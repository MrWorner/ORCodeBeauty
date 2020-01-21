package test;

import main.*;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/*
* author:  Maxim Godyna TP026670
* version: 1.00, 26.10.2014
* description: Settings form: to change personal settings
* Available in offline session: SOME FEATURES
* Available version: STUDENT
 */
public class OLD_P7_Settings1 extends javax.swing.JPanel {

    JLabel backlabel3;
    MainMenu Jmain2;
    String Design = "src/Images/Backgrounds/7.jpg";

    public OLD_P7_Settings1(JLabel backlabel2, MainMenu Jmain) {
        initComponents();

        //Global.desing = "src/Images/Backgrounds/7.jpg";
        PopupMenuListener listener = new PopupMenuListener() {
            boolean initialized = false;

            public void popupMenuCanceled(PopupMenuEvent e) {
            }

            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                ImageIcon newim = new ImageIcon("src/Images/Backgrounds/7mini.jpg");;
                if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Green light")) {
                    newim = new ImageIcon("src/Images/Backgrounds/7mini.jpg");
                    Design = "src/Images/Backgrounds/7.jpg";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Orange lines")) {
                    newim = new ImageIcon("src/Images/Backgrounds/2mini.jpg");
                    Design = "src/Images/Backgrounds/2.jpg";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Blue")) {
                    newim = new ImageIcon("src/Images/Backgrounds/9mini.jpg");
                    Design = "src/Images/Backgrounds/9.jpg";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Stars")) {
                    newim = new ImageIcon("src/Images/Backgrounds/1mini.jpg");
                    Design = "src/Images/Backgrounds/1.jpg";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Happiness")) {
                    newim = new ImageIcon("src/Images/Backgrounds/3mini.jpg");
                    Design = "src/Images/Backgrounds/3.jpg";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Pink")) {
                    newim = new ImageIcon("src/Images/Backgrounds/4mini.jpg");
                    Design = "src/Images/Backgrounds/4.jpg";
                }

                jLabel6.setIcon(newim);
            }

            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            }
        };

        jComboBox1.addPopupMenuListener(listener);

        jStautsLabel1.setText("");
        jStautsLabel2.setText("");

        jFoldertxt.setText("");

        jTxtIntakeS.setText("");
        //    jTxtNameS.setText(Global.stud_fname + " " + Global.stud_sname);
        //     jTxtTPnumberS.setText(Global.int_id);

        //     jstud_mailTXTfield.setText(Global.stud_mail);
        //     jstud_cphoneTXTfield.setText(Global.stud_cphone);
        //     jstud_hphoneTXTfield.setText(Global.stud_hphone);
        //     jstud_skypeTXTfield.setText(Global.stud_skype);
        this.backlabel3 = backlabel2;
        this.Jmain2 = Jmain;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jstud_passLabel = new javax.swing.JLabel();
        jstud_passTXTfield = new javax.swing.JPasswordField();
        jstud_pass2Label = new javax.swing.JLabel();
        jstud_pass2TXTfield = new javax.swing.JPasswordField();
        jStautsLabel2 = new javax.swing.JLabel();
        jBchangePass = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTxtIntake = new javax.swing.JTextField();
        jTxtTPnumber = new javax.swing.JTextField();
        jTxtName = new javax.swing.JTextField();
        jTxtIntakeS = new javax.swing.JTextField();
        jTxtNameS = new javax.swing.JTextField();
        jTxtTPnumberS = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jSubmitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jstud_cphoneTXTfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jstud_hphoneTXTfield = new javax.swing.JTextField();
        jStautsLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jstud_mailTXTfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jstud_skypeTXTfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jResetButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jBself = new javax.swing.JButton();
        jFoldertxt = new javax.swing.JTextField();
        jBaccept = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jBchangeB = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jMainLabelRes = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Пароль"));

        jstud_passLabel.setText("Новый пароль");

        jstud_passTXTfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jstud_passTXTfieldMouseClicked(evt);
            }
        });
        jstud_passTXTfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jstud_passTXTfieldKeyPressed(evt);
            }
        });

        jstud_pass2Label.setText("Подтверждение");

        jstud_pass2TXTfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jstud_pass2TXTfieldMouseClicked(evt);
            }
        });
        jstud_pass2TXTfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstud_pass2TXTfieldActionPerformed(evt);
            }
        });
        jstud_pass2TXTfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jstud_pass2TXTfieldKeyPressed(evt);
            }
        });

        jStautsLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jStautsLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jStautsLabel2.setText("jStautsLabel2");

        jBchangePass.setText("Изменить");
        jBchangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBchangePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addComponent(jBchangePass)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstud_pass2TXTfield)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jstud_passLabel)
                            .addComponent(jstud_pass2Label))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jstud_passTXTfield))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jStautsLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jstud_passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jstud_passTXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jstud_pass2Label)
                .addGap(4, 4, 4)
                .addComponent(jstud_pass2TXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jStautsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBchangePass)
                .addGap(6, 6, 6))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Пользователь\n"));

        jTxtIntake.setEditable(false);
        jTxtIntake.setBackground(new java.awt.Color(255, 255, 204));
        jTxtIntake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtIntake.setText("Группа");

        jTxtTPnumber.setEditable(false);
        jTxtTPnumber.setBackground(new java.awt.Color(255, 255, 204));
        jTxtTPnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtTPnumber.setText("ID карта");

        jTxtName.setEditable(false);
        jTxtName.setBackground(new java.awt.Color(255, 255, 204));
        jTxtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtName.setText("Имя");

        jTxtIntakeS.setEditable(false);
        jTxtIntakeS.setBackground(new java.awt.Color(204, 255, 204));

        jTxtNameS.setEditable(false);
        jTxtNameS.setBackground(new java.awt.Color(204, 255, 204));
        jTxtNameS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameSActionPerformed(evt);
            }
        });

        jTxtTPnumberS.setEditable(false);
        jTxtTPnumberS.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtIntake)
                    .addComponent(jTxtName)
                    .addComponent(jTxtTPnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtNameS, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jTxtIntakeS)
                    .addComponent(jTxtTPnumberS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIntake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtIntakeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTPnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTPnumberS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Контактная информация"));

        jSubmitButton.setText("Принять");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Мобильный телефон"));
        jPanel3.setFocusCycleRoot(true);

        jstud_cphoneTXTfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstud_cphoneTXTfieldActionPerformed(evt);
            }
        });
        jstud_cphoneTXTfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jstud_cphoneTXTfieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstud_cphoneTXTfield)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstud_cphoneTXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Домашний телефон"));
        jPanel4.setFocusCycleRoot(true);

        jstud_hphoneTXTfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstud_hphoneTXTfieldActionPerformed(evt);
            }
        });
        jstud_hphoneTXTfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jstud_hphoneTXTfieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstud_hphoneTXTfield, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstud_hphoneTXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jStautsLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jStautsLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jStautsLabel1.setText("jStautsLabel1");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Почта"));

        jstud_mailTXTfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jstud_mailTXTfieldMouseClicked(evt);
            }
        });
        jstud_mailTXTfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstud_mailTXTfieldActionPerformed(evt);
            }
        });
        jstud_mailTXTfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jstud_mailTXTfieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstud_mailTXTfield)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstud_mailTXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Skype"));
        jPanel5.setFocusCycleRoot(true);

        jstud_skypeTXTfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstud_skypeTXTfieldActionPerformed(evt);
            }
        });
        jstud_skypeTXTfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jstud_skypeTXTfieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstud_skypeTXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jstud_skypeTXTfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jResetButton.setText("Очистить");
        jResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jStautsLabel1)
                        .addGap(206, 206, 206))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jResetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSubmitButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jStautsLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jResetButton))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Папка"));

        jBself.setText("Выбрать папку");
        jBself.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBselfActionPerformed(evt);
            }
        });

        jFoldertxt.setEditable(false);

        jBaccept.setText("ОК");
        jBaccept.setEnabled(false);
        jBaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBacceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFoldertxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBself)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBaccept))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFoldertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBself)
                    .addComponent(jBaccept))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Тема"));

        jBchangeB.setText("Изменить");
        jBchangeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBchangeBActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green light", "Orange lines", "Blue", "Stars", "Happiness", "Pink" }));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Backgrounds/7mini.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jBchangeB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBchangeB)
                .addContainerGap())
        );

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMainLabelRes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jMainLabelRes.setText("Настройки");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMainLabelRes))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabelRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jstud_passTXTfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstud_passTXTfieldMouseClicked
        jStautsLabel2.setText("");
    }//GEN-LAST:event_jstud_passTXTfieldMouseClicked

    private void jstud_passTXTfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jstud_passTXTfieldKeyPressed
        jstud_passTXTfield.setBackground(new Color(255, 253, 192));
    }//GEN-LAST:event_jstud_passTXTfieldKeyPressed

    private void jstud_pass2TXTfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstud_pass2TXTfieldMouseClicked
        jStautsLabel2.setText("");
    }//GEN-LAST:event_jstud_pass2TXTfieldMouseClicked

    private void jstud_pass2TXTfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstud_pass2TXTfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstud_pass2TXTfieldActionPerformed

    private void jstud_pass2TXTfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jstud_pass2TXTfieldKeyPressed
        jstud_pass2TXTfield.setBackground(new Color(255, 253, 192));
    }//GEN-LAST:event_jstud_pass2TXTfieldKeyPressed

    private void jBchangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBchangePassActionPerformed

        jstud_pass2TXTfield.setBackground(Color.white);
        jstud_passTXTfield.setBackground(Color.white);
        jStautsLabel2.setForeground(Color.RED);
        boolean error = false;
        //encryp ENC = new encryp();
        //int length;
        String PasswordFromTXTfield = String.valueOf(jstud_passTXTfield.getPassword());
        String Password2FromTXTfield = String.valueOf(jstud_pass2TXTfield.getPassword());

        //String input =  String.valueOf(jstud_passTXTfield.getPassword()); ;
        if (PasswordFromTXTfield.equals("")) {
            error = true;
            jStautsLabel2.setText("Password cannot be empty!");
            System.out.println("Password cannot be empty");
            jstud_passTXTfield.setText("");
            jstud_pass2TXTfield.setText("");
        } else if (PasswordFromTXTfield.length() < 4) {
            error = true;
            System.out.println("Password is too short!!");
            jStautsLabel2.setText("Password is too short");
            jstud_passTXTfield.setText("");
            jstud_pass2TXTfield.setText("");
        } else if (!PasswordFromTXTfield.equals(Password2FromTXTfield)) {
            error = true;
            System.out.println("Validation error!!");
            jStautsLabel2.setText("Validation error");
            jstud_passTXTfield.setText("");
            jstud_pass2TXTfield.setText("");
        }

        if (!error) {
            // String sql;
            // try {
            //     sql = "UPDATE STUDENT SET stud_pass = '" + ENC.run(String.valueOf(jstud_passTXTfield.getPassword()))
            //              + "' WHERE stud_tp='" + Global.stud_tp + "'";
            //      jStautsLabel2.setForeground(Color.BLACK);
            //      jStautsLabel2.setText("Your password has been changed");
            // DBConnect connect = new DBConnect(jStautsLabel2);
            //      connect.EXESQL2(sql);
            //      System.out.println("Password has been changed!");
            //      jstud_passTXTfield.setText("");
            //      jstud_pass2TXTfield.setText("");

            //   } catch (Exception ex) {
            //       System.out.println("SQL StudUpdateF: " + ex);
            //   }
        }

    }//GEN-LAST:event_jBchangePassActionPerformed

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed

        jstud_skypeTXTfield.setBackground(Color.white);
        jstud_cphoneTXTfield.setBackground(Color.white);
        jstud_hphoneTXTfield.setBackground(Color.white);
        jstud_mailTXTfield.setBackground(Color.white);
        boolean error = false;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(jstud_mailTXTfield.getText());
        if (jstud_mailTXTfield.getText().equalsIgnoreCase("")) {
            error = true;
            jStautsLabel1.setText("Email field cannot be empty");
        } else if (!matcher.matches()) {
            error = true;
            jStautsLabel1.setText("Email has incorrect format");
        }
        if (!error) {
            // String sql = "UPDATE STUDENT SET stud_mail = '" + jstud_mailTXTfield.getText()
            //          + "',  stud_cphone = '" + jstud_cphoneTXTfield.getText()
            //          + "', stud_hphone = '" + jstud_hphoneTXTfield.getText()
            //          + "', stud_skype = '" + jstud_skypeTXTfield.getText()
            //           + "' WHERE stud_tp='" + Global.stud_tp + "'";
            // DBConnect connect = new DBConnect(jStautsLabel1);
            //try {
            //     connect.EXESQL2(sql);
            // } catch (Exception ex) {
            //     System.out.println("SQL StudUpdateF: " + ex);
            // }

        }
    }//GEN-LAST:event_jSubmitButtonActionPerformed

    private void jstud_cphoneTXTfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstud_cphoneTXTfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstud_cphoneTXTfieldActionPerformed

    private void jstud_cphoneTXTfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jstud_cphoneTXTfieldKeyPressed
        jstud_cphoneTXTfield.setBackground(new Color(255, 253, 192));
    }//GEN-LAST:event_jstud_cphoneTXTfieldKeyPressed

    private void jstud_hphoneTXTfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstud_hphoneTXTfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstud_hphoneTXTfieldActionPerformed

    private void jstud_hphoneTXTfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jstud_hphoneTXTfieldKeyPressed
        jstud_hphoneTXTfield.setBackground(new Color(255, 253, 192));
    }//GEN-LAST:event_jstud_hphoneTXTfieldKeyPressed

    private void jstud_mailTXTfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstud_mailTXTfieldMouseClicked
        jStautsLabel1.setText("");
    }//GEN-LAST:event_jstud_mailTXTfieldMouseClicked

    private void jstud_mailTXTfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jstud_mailTXTfieldKeyPressed
        jstud_mailTXTfield.setBackground(new Color(255, 253, 192));
    }//GEN-LAST:event_jstud_mailTXTfieldKeyPressed

    private void jstud_skypeTXTfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstud_skypeTXTfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstud_skypeTXTfieldActionPerformed

    private void jstud_skypeTXTfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jstud_skypeTXTfieldKeyPressed
        jstud_skypeTXTfield.setBackground(new Color(255, 253, 192));
    }//GEN-LAST:event_jstud_skypeTXTfieldKeyPressed

    private void jResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetButtonActionPerformed
        // TODO add your handling code here:

        jstud_mailTXTfield.setText("");
        jstud_cphoneTXTfield.setText("");
        jstud_hphoneTXTfield.setText("");
        jstud_skypeTXTfield.setText("");
        jstud_skypeTXTfield.setBackground(Color.white);
        jstud_cphoneTXTfield.setBackground(Color.white);
        jstud_hphoneTXTfield.setBackground(Color.white);
        jstud_mailTXTfield.setBackground(Color.white);

        //jstud_passTXTfield.setText("");
        // jstud_pass2TXTfield.setText("");

    }//GEN-LAST:event_jResetButtonActionPerformed

    private void jBselfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBselfActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
        jBself.setEnabled(false);
        jBaccept.setEnabled(true);
        jFoldertxt.setText(chooser.getSelectedFile().getAbsolutePath());

    }//GEN-LAST:event_jBselfActionPerformed

    private void jBacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBacceptActionPerformed

        // Global.FTPuserfolderloc = jFoldertxt.getText();
        // INIfile UpdatedINI = new INIfile();
        // UpdatedINI.changeValue("FTPuserfolderloc", Global.FTPuserfolderloc);
        // Global.FTPuserfolderloc = Global.FTPuserfolderloc + "\\" + Global.stud_tp;
        // jFoldertxt.setText(Global.FTPuserfolderloc);
        //  FTPfunction FTPfunc = new FTPfunction();
        //  FTPfunc.FolderCheckAndCreate(Global.FTPuserfolderloc);
        //  Global.XLSlastSessionFolder = Global.FTPuserfolderloc + "/SaltaLastSession";
        //  FTPfunc.FolderCheckAndCreate(Global.XLSlastSessionFolder);
        //  jBself.setEnabled(true);
        //  jBaccept.setEnabled(false);
    }//GEN-LAST:event_jBacceptActionPerformed

    private void jstud_mailTXTfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstud_mailTXTfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstud_mailTXTfieldActionPerformed

    private void jTxtNameSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNameSActionPerformed

    private void jBchangeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBchangeBActionPerformed

        Jmain2.getLayeredPane().remove(backlabel3);
        ImageIcon earth = new ImageIcon(Design);
        backlabel3 = new JLabel(earth);
        Jmain2.getLayeredPane().add(backlabel3,
                new Integer(Integer.MIN_VALUE));
        backlabel3.setBounds(0, 0, earth.getIconWidth(),
                earth.getIconHeight());
        // INIfile INI = new INIfile();
        // INI.changeValue("Desing", Global.desing);


    }//GEN-LAST:event_jBchangeBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaccept;
    private javax.swing.JButton jBchangeB;
    private javax.swing.JButton jBchangePass;
    private javax.swing.JButton jBself;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jFoldertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jMainLabelRes;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jResetButton;
    private javax.swing.JLabel jStautsLabel1;
    private javax.swing.JLabel jStautsLabel2;
    private javax.swing.JButton jSubmitButton;
    private javax.swing.JTextField jTxtIntake;
    private javax.swing.JTextField jTxtIntakeS;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtNameS;
    private javax.swing.JTextField jTxtTPnumber;
    private javax.swing.JTextField jTxtTPnumberS;
    private javax.swing.JTextField jstud_cphoneTXTfield;
    private javax.swing.JTextField jstud_hphoneTXTfield;
    private javax.swing.JTextField jstud_mailTXTfield;
    private javax.swing.JLabel jstud_pass2Label;
    private javax.swing.JPasswordField jstud_pass2TXTfield;
    private javax.swing.JLabel jstud_passLabel;
    private javax.swing.JPasswordField jstud_passTXTfield;
    private javax.swing.JTextField jstud_skypeTXTfield;
    // End of variables declaration//GEN-END:variables
}
