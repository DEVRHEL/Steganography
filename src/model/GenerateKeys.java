/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author master
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
public class GenerateKeys {
  
//  public static final String PUBLIC_KEY_FILE = "rsa_keypair/publicKey";
//  public static final String PRIVATE_KEY_FILE = "rsa_keypair/privateKey";
  
  private KeyPairGenerator keyGen;
  private KeyPair pair;
  private PrivateKey privateKey;
  private PublicKey publicKey;
  private SecretKey encryptedKey;
  public GenerateKeys(int keylength) throws NoSuchAlgorithmException, NoSuchProviderException {
    this.keyGen = KeyPairGenerator.getInstance("RSA");
    this.keyGen.initialize(keylength);
  }
  public void createKeys() {
      // truoc thay doi
    this.pair = this.keyGen.generateKeyPair();
    this.privateKey = pair.getPrivate();
    this.publicKey = pair.getPublic();
    // sau thay doi - end
      
  }
  public PrivateKey getPrivateKey() {
    return this.privateKey;
  }
  public PublicKey getPublicKey() {
    return this.publicKey;
  }
  public SecretKey getencryptedKey() {
      return this.encryptedKey;
  }
  public void writeToFile(String path, byte[] key) throws IOException {
    File f = new File(path);
    f.getParentFile().mkdirs();
    FileOutputStream fos = new FileOutputStream(f);
    fos.write(key);
    fos.flush();
    fos.close();
  }
  public static void main(String[] args) {
//    try {
//      new GenerateKeys(1024).generateKeysToFile();
//    } catch (NoSuchAlgorithmException e) {
//      e.printStackTrace();
//    } catch (NoSuchProviderException e) {
//      e.printStackTrace();
//    }
  }
  
  public void generateKeysToFile(String PUBLIC_KEY_FILE, String PRIVATE_KEY_FILE) {
    try {
      System.out.println("Starting generate...");
      this.createKeys();
      System.out.println("key created...");
      System.out.println("Pub file"+ PUBLIC_KEY_FILE);
      System.out.println("Pri file"+ PRIVATE_KEY_FILE);
      this.writeToFile(PUBLIC_KEY_FILE + "\\publicKey", this.getPublicKey().getEncoded());
      this.writeToFile(PRIVATE_KEY_FILE + "\\privateKey", this.getPrivateKey().getEncoded());
      System.out.println("Generated!");
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
