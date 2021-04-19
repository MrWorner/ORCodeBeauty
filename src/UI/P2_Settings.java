package UI;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import main.Global;

/**
 * 
 * @author MaximGodyna
 */

public class P2_Settings extends javax.swing.JPanel {

    //JLabel backlabel3;
    Win_MainMenu Jmain2;
    private static P2_Settings single_instance = null;

    
      public static P2_Settings getInstance(Win_MainMenu Jmain) 
    { 
        if (single_instance == null) 
            single_instance = new P2_Settings(Jmain);  
        return single_instance; 
    } 
    
    
    public P2_Settings(Win_MainMenu Jmain) {
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
                    Global.Design = "src/Images/Backgrounds/7.jpg";
                    Global.DesignName = "Green light";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Orange lines")) {
                    newim = new ImageIcon("src/Images/Backgrounds/2mini.jpg");
                    Global.Design = "src/Images/Backgrounds/2.jpg";
                    Global.DesignName = "Orange lines";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Blue")) {
                    newim = new ImageIcon("src/Images/Backgrounds/9mini.jpg");
                    Global.Design = "src/Images/Backgrounds/9.jpg";
                    Global.DesignName = "Blue";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Stars")) {
                    newim = new ImageIcon("src/Images/Backgrounds/1mini.jpg");
                    Global.Design = "src/Images/Backgrounds/1.jpg";
                    Global.DesignName = "Stars";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Happiness")) {
                    newim = new ImageIcon("src/Images/Backgrounds/3mini.jpg");
                    Global.Design = "src/Images/Backgrounds/3.jpg";
                    Global.DesignName = "Happiness";
                } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Pink")) {
                    newim = new ImageIcon("src/Images/Backgrounds/4mini.jpg");
                    Global.Design = "src/Images/Backgrounds/4.jpg";
                    Global.DesignName = "Pink";
                }

                jLabel6.setIcon(newim);
            }

            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            }
        };

        jComboBox1.addPopupMenuListener(listener);
        jComboBox1.setSelectedItem(Global.DesignName);

        ImageIcon newim = new ImageIcon("src/Images/Backgrounds/7mini.jpg");;
        if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Green light")) {
            newim = new ImageIcon("src/Images/Backgrounds/7mini.jpg");
            Global.Design = "src/Images/Backgrounds/7.jpg";
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Orange lines")) {
            newim = new ImageIcon("src/Images/Backgrounds/2mini.jpg");
            Global.Design = "src/Images/Backgrounds/2.jpg";
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Blue")) {
            newim = new ImageIcon("src/Images/Backgrounds/9mini.jpg");
            Global.Design = "src/Images/Backgrounds/9.jpg";
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Stars")) {
            newim = new ImageIcon("src/Images/Backgrounds/1mini.jpg");
            Global.Design = "src/Images/Backgrounds/1.jpg";
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Happiness")) {
            newim = new ImageIcon("src/Images/Backgrounds/3mini.jpg");
            Global.Design = "src/Images/Backgrounds/3.jpg";
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Pink")) {
            newim = new ImageIcon("src/Images/Backgrounds/4mini.jpg");
            Global.Design = "src/Images/Backgrounds/4.jpg";
        }

        jLabel6.setIcon(newim);
        //    jTxtNameS.setText(Global.stud_fname + " " + Global.stud_sname);
        //     jTxtTPnumberS.setText(Global.int_id);
        //     jstud_mailTXTfield.setText(Global.stud_mail);
        //     jstud_cphoneTXTfield.setText(Global.stud_cphone);
        //     jstud_hphoneTXTfield.setText(Global.stud_hphone);
        //     jstud_skypeTXTfield.setText(Global.stud_skype);
        //this.backlabel3 = backlabel2;
        this.Jmain2 = Jmain;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jBchangeB2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jBchangeB1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jBchangeB = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jMainLabelRes = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 673));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Language"));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English" }));

        jBchangeB2.setLabel("Change");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jBchangeB2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBchangeB2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Font settings"));

        jLabel1.setText("Size");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "13" }));

        jLabel2.setText("Font");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahoma" }));

        jBchangeB1.setLabel("Change");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox3, 0, 154, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jBchangeB1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBchangeB1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Theme"));

        jBchangeB.setLabel("Change");
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
                    .addComponent(jBchangeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(421, Short.MAX_VALUE))
        );

        jMainLabelRes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jMainLabelRes.setText("Settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jMainLabelRes))
                    .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabelRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBchangeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBchangeBActionPerformed

        Jmain2.getLayeredPane().remove(Global.backlabelNEW);
        ImageIcon earth = new ImageIcon(Global.Design);
        Global.backlabelNEW = new JLabel(earth);
        Jmain2.getLayeredPane().add(Global.backlabelNEW,
                new Integer(Integer.MIN_VALUE));
        Global.backlabelNEW.setBounds(0, 0, earth.getIconWidth(),
                earth.getIconHeight());
        // INIfile INI = new INIfile();
        // INI.changeValue("Desing", Global.desing);

        // JOptionPane.showMessageDialog(null, "backlabel3: " + backlabel3);
        Global.CurrentINI.changeValue("Design", Global.Design);
        Global.CurrentINI.changeValue("DesignName", Global.DesignName);
    }//GEN-LAST:event_jBchangeBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBchangeB;
    private javax.swing.JButton jBchangeB1;
    private javax.swing.JButton jBchangeB2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jMainLabelRes;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
