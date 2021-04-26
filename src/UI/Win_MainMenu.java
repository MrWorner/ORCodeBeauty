package UI;

import UI.P1_CodeEditor;
import UI.P2_Settings;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import OR3Beauty.*;
import main.Global;
import updateChecker.UpdateChecker;

/**
 *
 * @author MaximGodyna
 */
public class Win_MainMenu extends javax.swing.JFrame {

    // StudMarksTest StudMarksTest = new StudMarksTest();
    // NewsP NewsPanel = new NewsP();
    //FTPmanagerP FTPmanagerPanel;
    Color DefCol;
    Color DefPressedCol;

    //JLabel backlabel;
    public Win_MainMenu() {
        initComponents();

        Global.Design = Global.CurrentINI.readOneProp("Design");
        Global.DesignName = Global.CurrentINI.readOneProp("DesignName");

        //Global.StatisticsPanel = new P1_Statistics(); 
//        Global.UserManagerPanel = new P2_UserManager();
//        Global.TriggerManagerPanel = new P3_TriggerManager();
//        Global.PerimetrManagerPanel = new P4_PerimetrManager();
//        Global.ParentManagerPanel = new P5_AssignParents();
//        Global.IDcardManagerPanel = new P6_IDcardManager();
        Global.SettingsPanel = new P2_Settings(this);

        //System.out.println("Global.Design = " + Global.Design);
        //this.setType(javax.swing.JFrame.Type.UTILITY);
        //Buttons[0] = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7};
        //  DefCol = jButton1.getBackground();
//         DefCol = jButton2.getBackground();
        DefPressedCol = jButton1.getBackground();

        //jButton1.setBackground(Color.CYAN);
        // System.out.println(DefCol);
        //URL iconURL = getClass().getResource("/images/Cat.png");
        //ImageIcon icon = new ImageIcon(iconURL);
        // this.setIconImage(icon.getImage());
        // INIfile INI = new INIfile();
        // Global.desing = INI.readOneProp("Desing");
        // ImageIcon earth = new ImageIcon(Global.desing);
        ImageIcon earth = new ImageIcon(Global.Design);
        Global.backlabelNEW = new JLabel(earth);
        getLayeredPane().add(Global.backlabelNEW,
                new Integer(Integer.MIN_VALUE));
        Global.backlabelNEW.setBounds(0, 0, earth.getIconWidth(),
                earth.getIconHeight());

        //FTPmanagerPanel = new FTPmanagerP(); //BUTTON 1
        // TimeTablePanel = new TimeTableP();//BUTTON 2  
        //**IMAGE TO PANEL START
        JPanel content = jPanel4;
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        //content.setOpaque(false);
        jPanel2.setOpaque(false);
        jPanel4.setOpaque(false);

        jPanel4.setBorder(BorderFactory.createEmptyBorder());
        jPanel2.setBorder(BorderFactory.createEmptyBorder());
        //getContentPane().setLayout(new FlowLayout());
        getContentPane().add(content);
        ((JPanel) getContentPane()).setOpaque(false);

        //jPanel1.removeAll();
        // jPanel1.repaint();
        // jPanel1.revalidate();
        //adding panels
        //NewsP NewsPanel = new NewsP();
        //jPanel1.add(NewsPanel = new NewsP());
        //jPanel1.add(NewsPanel);
        // jPanel1.repaint();
        //jPanel1.revalidate();
        //  jButton4.setVisible(false);
        // jButton5.setVisible(false);
        // jButton6.setVisible(false);
        // jButton7.setVisible(false);
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        //jPanel1.add(Global.StatisticsPanel = new P1_Statistics());
        //jPanel1.add(Global.StatisticsPanel);
        jPanel1.add(P1_CodeEditor.getInstance());
        jPanel1.repaint();
        jPanel1.revalidate();

        UpdateChecker.Start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jBLogout = new javax.swing.JButton();
        jBfolder = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OR3BEAUTY");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Code Editor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBLogout.setBackground(new java.awt.Color(255, 255, 204));
        jBLogout.setText("Leave");
        jBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogoutActionPerformed(evt);
            }
        });

        jBfolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileico/folder.png"))); // NOI18N
        jBfolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfolderActionPerformed(evt);
            }
        });

        jButton7.setText("Settings");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(667, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBfolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 750, Short.MAX_VALUE)
                        .addComponent(jBLogout)
                        .addGap(12, 12, 12))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfolder, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMaximumSize(new java.awt.Dimension(140, 135));
        jPanel4.setMinimumSize(new java.awt.Dimension(140, 135));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setText("Version: v0.1a");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileico/MainMenuLogo.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1042, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        // jPanel1.add(Global.StatisticsPanel = new P1_Statistics());
        jPanel1.add(P1_CodeEditor.getInstance());

        jPanel1.repaint();
        jPanel1.revalidate();

        jButton1.setBackground(DefPressedCol);
//         jButton2.setBackground(DefCol);
//         jButton3.setBackground(DefCol);
//         jButton4.setBackground(DefCol);
//         jButton5.setBackground(DefCol);
//         jButton6.setBackground(DefCol);
        jButton7.setBackground(DefCol);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBLogoutActionPerformed

    private void jBfolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfolderActionPerformed
//        try {
//            Desktop.getDesktop().open(new File("D:/"));
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
    }//GEN-LAST:event_jBfolderActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        //jPanel1.add(SettingsPanel = new P2_Settings(backlabel, this));
        Global.SettingsPanel = new P2_Settings(this);
        jPanel1.add(Global.SettingsPanel);
        jPanel1.repaint();
        jPanel1.revalidate();

        jButton1.setBackground(DefCol);
//         jButton2.setBackground(DefCol);
//         jButton3.setBackground(DefCol);
//         jButton4.setBackground(DefCol);
//         jButton5.setBackground(DefCol);
//         jButton6.setBackground(DefCol);
        jButton7.setBackground(DefPressedCol);


    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Win_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        try {
            for (UIManager.LookAndFeelInfo info
                    : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.put("nimbusBase", new Color(0xBB, 0xC3, 0xFF));
                    UIManager.put("TitledBorder.position",
                            TitledBorder.CENTER);
                    UIManager.put("nimbusBlueGrey", new Color(0xD1, 0xD1, 0xD1));
                    UIManager.put("control", new Color(0xFA,
                            0xFA, 0xFA));
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        } // If Nimbus is not available, you can setthe GUI to another look // and feel. }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win_MainMenu().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogout;
    private javax.swing.JButton jBfolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
