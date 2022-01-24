/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dirga Astya W
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form CheckLogin
     * @throws java.sql.SQLException
     */
    public SignUp() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new java.awt.Color(0,0,0,0));
        jPanel2.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        txtUsername1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Password1 = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnSign = new javax.swing.JButton();
        btnSignUPP = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setPreferredSize(new java.awt.Dimension(760, 670));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(245, 247, 250));
        Username.setText("Username");
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, -1));

        txtUsername1.setBackground(new java.awt.Color(31, 41, 51));
        txtUsername1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtUsername1.setForeground(new java.awt.Color(245, 247, 250));
        txtUsername1.setText("Username");
        txtUsername1.setBorder(null);
        txtUsername1.setCaretColor(new java.awt.Color(245, 247, 250));
        txtUsername1.setOpaque(false);
        txtUsername1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsername1MouseClicked(evt);
            }
        });
        jPanel2.add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 360, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 360, 30));

        Email.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(245, 247, 250));
        Email.setText("Email");
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 150, -1));

        txtEmail.setBackground(new java.awt.Color(31, 41, 51));
        txtEmail.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(245, 247, 250));
        txtEmail.setText("email@email.com");
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(245, 247, 250));
        txtEmail.setOpaque(false);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 360, 40));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 360, 30));

        Password1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        Password1.setForeground(new java.awt.Color(245, 247, 250));
        Password1.setText("Password");
        jPanel2.add(Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 150, -1));

        txtPass1.setBackground(new java.awt.Color(31, 41, 51));
        txtPass1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtPass1.setForeground(new java.awt.Color(245, 247, 250));
        txtPass1.setText("Password");
        txtPass1.setBorder(null);
        txtPass1.setCaretColor(new java.awt.Color(245, 247, 250));
        txtPass1.setOpaque(false);
        txtPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPass1MouseClicked(evt);
            }
        });
        jPanel2.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 360, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 360, 30));

        btnSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sign Up 3.png"))); // NOI18N
        btnSign.setBorder(null);
        btnSign.setBorderPainted(false);
        btnSign.setContentAreaFilled(false);
        btnSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });
        jPanel2.add(btnSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, -1));

        btnSignUPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sign Up 2.png"))); // NOI18N
        jPanel2.add(btnSignUPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sign in 2.png"))); // NOI18N
        btnSignIn.setBorder(null);
        btnSignIn.setBorderPainted(false);
        btnSignIn.setContentAreaFilled(false);
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.setFocusPainted(false);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(31, 41, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login Right.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setFocusable(false);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login Left.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        try {
            // TODO add your handling code here:
            Login newLogin = new Login();
            newLogin.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
        String name = txtUsername1.getText();
        String pass = txtPass1.getText();
        String email = txtEmail.getText();
        try {
        Connection conn = (Connection)finalprojectoop.connect.getConnection();
        String sql = "INSERT INTO user (username, password,email) VALUES (?,?,?)";
        
        java.sql.Statement stm = conn.createStatement();
            try (java.sql.PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, name);
                pst.setString(2, pass);
                pst.setString(3, email);
                JOptionPane.showMessageDialog(null, "Akun Berhasil Dibuat");
                pst.execute();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        txtUsername1.setText("Username");
        txtPass1.setText("Password");
        txtEmail.setText("email@email.com");
    }//GEN-LAST:event_btnSignActionPerformed

    private void txtUsername1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsername1MouseClicked
        // TODO add your handling code here:
        txtUsername1.setText("");
    }//GEN-LAST:event_txtUsername1MouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPass1MouseClicked
        // TODO add your handling code here:.
        txtPass1.setText("");
    }//GEN-LAST:event_txtPass1MouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SignUp().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Password1;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSign;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel btnSignUPP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass1;
    private javax.swing.JTextField txtUsername1;
    // End of variables declaration//GEN-END:variables
}
