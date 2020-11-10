/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.GenerateKeys;
import model.Image_Filter;
import model.AverageLsb;
import model.ChiSquare;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import model.Steganography;
import org.math.plot.Plot2DPanel;
import org.math.plot.plotObjects.BaseLabel;

/**
 *
 * @author master
 */
public class MainLayout extends javax.swing.JFrame {

    /**
     * Creates new form MainLayout
     */
    private JFileChooser pathSaveGenKey = new JFileChooser();
    private JFileChooser pathImageEncode = new JFileChooser();
    private JFileChooser pathKeyEncode = new JFileChooser();
    private JFileChooser pathImageDecode = new JFileChooser();
    private JFileChooser pathKeyDecode = new JFileChooser();
    private JFileChooser pathImageDetect = new JFileChooser();
    private Steganography steg = new Steganography();
    Integer type = 0;
    private Plot2DPanel chiSquarePanel = new Plot2DPanel();
    
    public MainLayout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jOptionPane1 = new javax.swing.JOptionPane();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFrame5 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelEncodeImage = new javax.swing.JLabel();
        encodeText = new javax.swing.JTextField();
        publicKeyButton = new javax.swing.JButton();
        javax.swing.JButton EncodeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectImageEncodeButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelDecodeImage = new javax.swing.JLabel();
        selectImageDecodeButton = new javax.swing.JButton();
        privateKeyButton = new javax.swing.JButton();
        javax.swing.JButton DecodeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        decodeText = new javax.swing.JTextField();
        GenKeyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGenKey = new javax.swing.JButton();
        btnSaveKeyFolder = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        detectImage = new javax.swing.JLabel();
        btnDetect = new javax.swing.JButton();
        btnSelectImageDetect1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        paL = new javax.swing.JScrollPane();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEncodeImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        encodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeTextActionPerformed(evt);
            }
        });

        publicKeyButton.setText("Public Key");
        publicKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicKeyButtonActionPerformed(evt);
            }
        });

        EncodeButton.setText("Encode");
        EncodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncodeButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("* Nhập đoạn message cần giấu:");

        selectImageEncodeButton.setText("Chọn ảnh");
        selectImageEncodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageEncodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEncodeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EncodeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicKeyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encodeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectImageEncodeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelEncodeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(encodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectImageEncodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(publicKeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EncodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Encode", jPanel1);

        labelDecodeImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        selectImageDecodeButton.setText("Chọn ảnh");
        selectImageDecodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageDecodeButtonActionPerformed(evt);
            }
        });

        privateKeyButton.setText("Private Key");
        privateKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateKeyButtonActionPerformed(evt);
            }
        });

        DecodeButton.setText("Decode");
        DecodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecodeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("* Đoạn message đã giấu:");

        decodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDecodeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DecodeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(privateKeyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectImageDecodeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(decodeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(selectImageDecodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(privateKeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DecodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(decodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDecodeImage, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Decode", jPanel3);

        jLabel1.setText("* Chương trình sinh cặp khóa public key và private key trong RSA:");

        btnGenKey.setText("Sinh khóa (Gen Key)");
        btnGenKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenKeyActionPerformed(evt);
            }
        });

        btnSaveKeyFolder.setText("Chọn nơi lưu file key ...");
        btnSaveKeyFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveKeyFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GenKeyPanelLayout = new javax.swing.GroupLayout(GenKeyPanel);
        GenKeyPanel.setLayout(GenKeyPanelLayout);
        GenKeyPanelLayout.setHorizontalGroup(
            GenKeyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenKeyPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(GenKeyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveKeyFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(648, Short.MAX_VALUE))
        );
        GenKeyPanelLayout.setVerticalGroup(
            GenKeyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenKeyPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSaveKeyFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenKey, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GenKey", GenKeyPanel);

        btnDetect.setText("OK");
        btnDetect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetectActionPerformed(evt);
            }
        });

        btnSelectImageDetect1.setText("Chọn ảnh...");
        btnSelectImageDetect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImageDetect1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trên xuống dưới", "Trái sang phải", "Dưới lên trên", "Phải sang trái" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(detectImage, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paL))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSelectImageDetect1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(564, 564, 564)
                        .addComponent(btnDetect, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDetect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectImageDetect1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detectImage, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(paL))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detect", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encodeTextActionPerformed

    private void btnGenKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenKeyActionPerformed
        // TODO add your handling code here:
        try {
            if(this.pathSaveGenKey.getSelectedFile() != null) {
                new GenerateKeys(1024).generateKeysToFile(this.pathSaveGenKey.getSelectedFile().toString(), this.pathSaveGenKey.getSelectedFile().toString());
                showMessageDialog(null, "Lưu key thành công"); 
            }
            else {
                showMessageDialog(null, "Vui lòng chọn folder lưu key"); 
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenKeyActionPerformed

    private void btnSaveKeyFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveKeyFolderActionPerformed
        // TODO add your handling code here:
        this.pathSaveGenKey.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        this.pathSaveGenKey.showSaveDialog(null);
        if(this.pathSaveGenKey.getSelectedFile() != null) this.btnSaveKeyFolder.setText("Bạn đã chọn folder: "+ this.pathSaveGenKey.getSelectedFile());
//        System.out.println(pathSaveGenKey.getCurrentDirectory());
//        System.out.println(pathSaveGenKey.getSelectedFile());
    }//GEN-LAST:event_btnSaveKeyFolderActionPerformed

    private void selectImageEncodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageEncodeButtonActionPerformed
        // TODO add your handling code here:
        this.pathImageEncode.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); 
        this.pathImageEncode.showSaveDialog(null);
        this.pathImageEncode.setFileFilter(new Image_Filter());

        if(this.pathImageEncode.getSelectedFile() != null) {
            this.labelEncodeImage.setIcon(new ImageIcon(this.pathImageEncode.getSelectedFile().toString()));
        }
    }//GEN-LAST:event_selectImageEncodeButtonActionPerformed

    private void EncodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncodeButtonActionPerformed
        // TODO add your handling code here:
        //start path of displayed File Chooser
//	JFileChooser chooser = new JFileChooser("./");
//	chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//	chooser.setFileFilter(new Image_Filter());
//	int returnVal = this.pathImageEncode.showOpenDialog(view);
        String plainText = encodeText.getText();
	if (plainText != null && !plainText.isEmpty() && this.pathImageEncode.getSelectedFile() != null && this.pathKeyEncode.getSelectedFile() != null){
            //File directory = chooser.getSelectedFile();
            File directory = this.pathImageEncode.getSelectedFile();
            try{
		//String text = input.getText();
                System.out.println(plainText);
		String ext  = Image_Filter.getExtension(directory);
                System.out.println(ext);
		String name = directory.getName();
                System.out.println(name);
		String path = directory.getPath();
                System.out.println(path);
		path = path.substring(0,path.length()-name.length()-1);
                System.out.println(path);
		name = name.substring(0, name.length()-4);
                System.out.println(name);
		String stegan = JOptionPane.showInputDialog(null,
                    "Enter output file name:", "File name",
                    JOptionPane.PLAIN_MESSAGE);
			
		if(this.steg.encode(path,name,ext,stegan,plainText, this.pathKeyEncode.getSelectedFile().toString()))
		{
                    JOptionPane.showMessageDialog(null, "Giấu tin thành công", 
			"Success!", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
                    JOptionPane.showMessageDialog(null, "Không thể giấu tin!", 
                    "Error!", JOptionPane.INFORMATION_MESSAGE);
		}
		}
		catch(Exception except) {
		//msg if opening fails
                System.out.println(except);
		JOptionPane.showMessageDialog(null, "The File cannot be opened!", 
                    "Error!", JOptionPane.INFORMATION_MESSAGE);
		}
        }
        else {
            showMessageDialog(null, "Bạn chưa nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_EncodeButtonActionPerformed

    private void publicKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicKeyButtonActionPerformed
        // TODO add your handling code here:
        this.pathKeyEncode.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        this.pathKeyEncode.showSaveDialog(null);
        if(this.pathKeyEncode.getSelectedFile() != null) showMessageDialog(null, "Bạn đã chọn file: "+ this.pathKeyEncode.getSelectedFile());
    }//GEN-LAST:event_publicKeyButtonActionPerformed

    private void selectImageDecodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageDecodeButtonActionPerformed
        // TODO add your handling code here:
        this.pathImageDecode.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); 
        this.pathImageDecode.showSaveDialog(null);
        this.pathImageDecode.setFileFilter(new Image_Filter());

        if(this.pathImageDecode.getSelectedFile() != null) {
            this.labelDecodeImage.setIcon(new ImageIcon(this.pathImageDecode.getSelectedFile().toString()));
        }
    }//GEN-LAST:event_selectImageDecodeButtonActionPerformed

    private void privateKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateKeyButtonActionPerformed
        // TODO add your handling code here:
        this.pathKeyDecode.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        this.pathKeyDecode.showSaveDialog(null);
        if(this.pathKeyDecode.getSelectedFile() != null) showMessageDialog(null, "Bạn đã chọn file: "+ this.pathKeyDecode.getSelectedFile());
    }//GEN-LAST:event_privateKeyButtonActionPerformed

    private void DecodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecodeButtonActionPerformed
        // TODO add your handling code here:
        File directory = this.pathImageDecode.getSelectedFile();
        if (this.pathKeyDecode.getSelectedFile().toString() != null && directory != null){
            try{
                String image = directory.getPath();
                String stat_name = directory.getName();
                String stat_path = directory.getPath();
                stat_path = stat_path.substring(0,stat_path.length()-stat_name.length()-1);
                stat_name = stat_name.substring(0, stat_name.length()-4);
                String message = this.steg.decode(stat_path, stat_name, this.pathKeyDecode.getSelectedFile().toString());
                System.out.println(stat_path + ", " + stat_name);
                if(message != "")
                {
                JOptionPane.showMessageDialog(null, "The Image was decoded Successfully!", 
                "Success!", JOptionPane.INFORMATION_MESSAGE);
                        decodeText.setText(message);
                        }
                else
                {
                        JOptionPane.showMessageDialog(null, "The Image could not be decoded!", 
                        "Error!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(Exception except) {
                //msg if opening fails
                JOptionPane.showMessageDialog(null, "The File cannot be opened!", 
                "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            showMessageDialog(null, "Bạn chưa nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_DecodeButtonActionPerformed

    private void decodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decodeTextActionPerformed

    private void btnDetectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetectActionPerformed
        // TODO add your handling code here:
        if(this.pathImageDetect.getSelectedFile() != null)
	{
            BufferedImage image = getImage(pathImageDetect.getSelectedFile().toString());
            int size = Integer.parseInt("2048");
            int nbBlocks = ((3*image.getWidth()*image.getHeight())/size) - 1;
            double[] x = new double[nbBlocks];
            double[] chi = new double[nbBlocks];
            double[] averageLSB = new double[nbBlocks];
            if(type == 0)
            {
                AverageLsb.averageLsbAttackTopToBottom(image, x, averageLSB, size);
                ChiSquare.chiSquareAttackTopToBottom(image, x, chi, size);
            }
            else if(type == 1)
            {
		AverageLsb.averageLsbAttackLeftToRight(image, x, averageLSB, size);
		ChiSquare.chiSquareAttackLeftToRight(image, x, chi, size);
            }
            else if(type == 2) 
            {
		AverageLsb.averageLsbAttackBottomToTop(image, x, averageLSB, size);
		ChiSquare.chiSquareAttackBottomToTop(image, x, chi, size);
            }
            else 
            {
                AverageLsb.averageLsbAttackRightToLeft(image, x, averageLSB, size);
                ChiSquare.chiSquareAttackRightToLeft(image, x, chi, size);
            }
					
            chiSquarePanel.removeAllPlots();
            chiSquarePanel.addScatterPlot("Average LSB", x, averageLSB);
            BaseLabel title = new BaseLabel("Chi-Square and Average LSB",null, 0.5, 1.1);
            title.setFont(new Font("Courier", Font.BOLD, 20));
            chiSquarePanel.addPlotable(title);
            chiSquarePanel.addLinePlot("Chi-Square", x, chi);
            chiSquarePanel.addLegend("EAST");
            chiSquarePanel.setAxisLabel(0, size+"-byte data block");
            chiSquarePanel.setAxisLabel(1, "Average LSB value (blue)\np-value of Chi-Square test (red)");
            //jTabbedPane1.addTab("Chi-Square", null, chiSquarePanel, null);
            paL.add(chiSquarePanel);
	}
    }//GEN-LAST:event_btnDetectActionPerformed

    private void btnSelectImageDetect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImageDetect1ActionPerformed
        // TODO add your handling code here:
        this.pathImageDetect.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        this.pathImageDetect.showSaveDialog(null);
        this.pathImageDetect.setFileFilter(new Image_Filter());

        if(this.pathImageDetect.getSelectedFile() != null) {
            this.detectImage.setIcon(new ImageIcon(this.pathImageDetect.getSelectedFile().toString()));
        }
    }//GEN-LAST:event_btnSelectImageDetect1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        this.type = jComboBox1.getSelectedIndex();
        System.out.println("box " + this.type);
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame mainLayout = new MainLayout();
                mainLayout.setSize(1650,1080);
                mainLayout.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GenKeyPanel;
    private javax.swing.JButton btnDetect;
    private javax.swing.JButton btnGenKey;
    private javax.swing.JButton btnSaveKeyFolder;
    private javax.swing.JButton btnSelectImageDetect1;
    private javax.swing.JTextField decodeText;
    private javax.swing.JLabel detectImage;
    private javax.swing.JTextField encodeText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelDecodeImage;
    private javax.swing.JLabel labelEncodeImage;
    private javax.swing.JScrollPane paL;
    private javax.swing.JButton privateKeyButton;
    private javax.swing.JButton publicKeyButton;
    private javax.swing.JButton selectImageDecodeButton;
    private javax.swing.JButton selectImageEncodeButton;
    // End of variables declaration//GEN-END:variables
}
