/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;

import java.awt.Point;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.awt.image.DataBufferByte;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 *
 * @author master
 */
public class Steganography {
    /*
	 *Steganography Empty Constructor
	 */
	public Steganography()
	{
	}
	
	
	public boolean encode(String path, String original, String ext1, String stegan, String message, String key)
	{
            System.out.println("model.Steganography.encode()");
		String			file_name 	= image_path(path,original,ext1);
		BufferedImage 	image_orig	= getImage(file_name);
		
		//user space is not necessary for Encrypting
		BufferedImage image = user_space(image_orig);
		image = add_text(image,message,key);
		
		return(setImage(image,new File(image_path(path,stegan,"png")),"png"));
	}
	
	
	public String decode(String path, String name, String key)
	{
		byte[] decode;
		try
		{
			//user space is necessary for decrypting
			BufferedImage image  = user_space(getImage(image_path(path,name,"png")));
			decode = decode_text(get_byte_data(image));
                        String text = new String(decode);
                        System.out.println("Text truoc khi decrypt: "+ text);
                        text = decrypt(text, key);
                        System.out.println("Text sau khi decrypt: "+ text);
			return(text);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, 
				"There is no hidden message in this image!","Error",
				JOptionPane.ERROR_MESSAGE);
			return "";
		}
	}
	
	
	private String image_path(String path, String name, String ext)
	{
		return path + "/" + name + "." + ext;
	}
	
	
	private BufferedImage getImage(String f)
	{
		BufferedImage 	image	= null;
		File 		file 	= new File(f);
		
		try
		{
			image = ImageIO.read(file);
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, 
				"Image could not be read!","Error",JOptionPane.ERROR_MESSAGE);
		}
		return image;
	}
	
	
	private boolean setImage(BufferedImage image, File file, String ext)
	{
		try
		{
			file.delete(); //delete resources used by the File
			ImageIO.write(image,ext,file);
			return true;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, 
				"File could not be saved!","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
        
        // nhớ phải gen key
	public String encrypt(String originalText, String key) {
		try {
                     // truoc khi sua //
//			PublicKey publicKey = DemoRSA.getPublicKey(key);
//			
//			Cipher cipher = Cipher.getInstance("RSA");
//			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
//			
//			byte[] byteEncrypted = cipher.doFinal(originalText.getBytes());
//			String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
//			return encrypted;
                     // truoc khi sua - end
                     
                     KeyGenerator generator = KeyGenerator.getInstance("AES");
                    generator.init(128);
                    SecretKey secKey = generator.generateKey();
                    PublicKey publicKey = DemoRSA.getPublicKey(key);
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.PUBLIC_KEY, publicKey);
                    byte[] encSecKey = cipher.doFinal(secKey.getEncoded());


                    Cipher aesCipher = Cipher.getInstance("AES");
                    aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
                    byte[] byteCipherText = aesCipher.doFinal(originalText.getBytes());

                    return Base64.getEncoder().encodeToString(encSecKey) + "#" + Base64.getEncoder().encodeToString(byteCipherText);
                                                                
		} catch (Exception ex) {
			ex.printStackTrace();
		}
                return null;
	}

	public String decrypt(String encryptText, String key) {
		try {
                        // truoc khi sua
//			PrivateKey privateKey = DemoRSA.getPrivateKey(key);
//			
//			Cipher cipher = Cipher.getInstance("RSA");
//			cipher.init(Cipher.DECRYPT_MODE, privateKey);
//			
//			byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptText));
//			return new String(decrypted);
                        // truoc khi sua - end
                        
                        String[] split = encryptText.split("#");

                    String encSecKey = split[0];
                    String encText = split[1];
                    PrivateKey privateKey = DemoRSA.getPrivateKey(key);
                    byte[] bytesSecKey = Base64.getDecoder().decode(encSecKey);
                    byte[] bytesText = Base64.getDecoder().decode(encText);

                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(Cipher.PRIVATE_KEY, privateKey);
                    byte[] decSecKey = cipher.doFinal(bytesSecKey);
                    SecretKey secKey = new SecretKeySpec(decSecKey , 0, decSecKey .length, "AES");

                    Cipher aesCipher = Cipher.getInstance("AES");
                    aesCipher.init(Cipher.DECRYPT_MODE, secKey);
                    return new String(aesCipher.doFinal(bytesText));
                    
		} catch (Exception ex) {
			ex.printStackTrace();
		}
                return null;
	}
	
	private BufferedImage add_text(BufferedImage image, String text, String key)
	{
                System.out.println("Text truoc khi encrypt: "+text);
                text = encrypt(text, key);
                System.out.println("Text sau encrypt: "+text);
		byte img[]  = get_byte_data(image);
		byte msg[] = text.getBytes();
		byte len[]   = bit_conversion(msg.length);
		try
		{
			encode_text(img, len,  0); //0 first positiong
			encode_text(img, msg, 32); //4 bytes of space for length: 4bytes*8bit = 32 bits để giấu đc 32 bit thì cần 32 byte LSB để giấu
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, 
"Target File cannot hold message!", "Error",JOptionPane.ERROR_MESSAGE);
		}
		return image;
	}
	
	
	private BufferedImage user_space(BufferedImage image)
	{
		BufferedImage new_img  = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D	graphics = new_img.createGraphics();
		graphics.drawRenderedImage(image, null);
		graphics.dispose(); 
		return new_img;
	}
	
	
	private byte[] get_byte_data(BufferedImage image)
	{
		WritableRaster raster   = image.getRaster();
		DataBufferByte buffer = (DataBufferByte)raster.getDataBuffer();
		return buffer.getData();
	}
	
	
	private byte[] bit_conversion(int i)
	{
		//originally integers (ints) cast into bytes
		//byte byte7 = (byte)((i & 0xFF00000000000000L) >>> 56);
		//byte byte6 = (byte)((i & 0x00FF000000000000L) >>> 48);
		//byte byte5 = (byte)((i & 0x0000FF0000000000L) >>> 40);
		//byte byte4 = (byte)((i & 0x000000FF00000000L) >>> 32);
		
		
		byte byte3 = (byte)((i & 0xFF000000) >>> 24); //0
		byte byte2 = (byte)((i & 0x00FF0000) >>> 16); //0
		byte byte1 = (byte)((i & 0x0000FF00) >>> 8 ); //0
		byte byte0 = (byte)((i & 0x000000FF)	   );
		return(new byte[]{byte3,byte2,byte1,byte0});
	}
	
	
	private byte[] encode_text(byte[] image, byte[] addition, int offset)
	{
		//check that the data + offset will fit in the image
		if(addition.length + offset > image.length)
		{
			throw new IllegalArgumentException("File not long enough!");
		}
		//loop through each addition byte
		for(int i=0; i<addition.length; ++i)
		{
			int add = addition[i];
			for(int bit=7; bit>=0; --bit, ++offset) 
			{
				
				int b = (add >>> bit) & 1;
				
				image[offset] = (byte)((image[offset] & 0xFE) | b );
			}
		}
		return image;
	}
	
	
	private byte[] decode_text(byte[] image)
	{
		int length = 0;
		int offset  = 32;
		for(int i=0; i<32; ++i)
		{
			length = (length << 1) | (image[i] & 1);
		}
		
		byte[] result = new byte[length];
		
		for(int b=0; b<result.length; ++b )
		{
			
			for(int i=0; i<8; ++i, ++offset)
			{
				result[b] = (byte)((result[b] << 1) | (image[offset] & 1));
			}
		}
		return result;
	}
}