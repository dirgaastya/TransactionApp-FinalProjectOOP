/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Dirga Astya W
 */
public class TransactionDetails extends javax.swing.JFrame {
    /**
     * Creates new form TransactionDetails
     * @throws java.sql.SQLException
     */
    public TransactionDetails() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.setBackground(new java.awt.Color(0,0,0,0));
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        Date date = new Date();
        txtDate.setText(formatter.format(date)); 
        displayTable();
     
    }
    

    public final void displayTable() throws SQLException{
      try {
            try ( // TODO add your handling code here:
                Connection conn = (Connection)finalprojectoop.connect.getConnection()) {
                Statement s = conn.createStatement();
                
                String sql = "SELECT * FROM user_db.transaction_temp";
                s = conn.createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next()) {
                    String date = rs.getDate("Date").toString();
                    String item = rs.getString("Name");
                    String price = String.valueOf(rs.getInt("Price"));  
                    String qty = String.valueOf(rs.getInt("Qty"));
                    String sum = String.valueOf(rs.getInt("Sum"));
                    
                    String tbData[] = {date,item,price,qty,sum};
                    DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                    tblModel.addRow(tbData);
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cart = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Checkout.png"))); // NOI18N
        Cart.setBorder(null);
        Cart.setBorderPainted(false);
        Cart.setContentAreaFilled(false);
        Cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cart.setFocusPainted(false);
        Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartActionPerformed(evt);
            }
        });
        getContentPane().add(Cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, -1, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        Back.setBorder(null);
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setFocusPainted(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 247, 250));
        jLabel1.setText("Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(245, 247, 250));
        txtDate.setBorder(null);
        txtDate.setOpaque(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 310, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 320, 30));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 247, 250));
        jLabel2.setText("Total");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(245, 247, 250));
        txtTotal.setBorder(null);
        txtTotal.setOpaque(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 310, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 320, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item Name", "Price", "Qty", "Sum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 660, 280));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Transaction Details.png"))); // NOI18N
        Bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here
        Home newHome = new Home();
        newHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = (Connection)finalprojectoop.connect.getConnection();
            Statement s = conn.createStatement();
            String sql = "INSERT INTO transaction_report SELECT * FROM user_db.transaction_temp;";
            s.execute(sql);
            String sql2 = "SELECT total FROM user_db.total";
            int valueTotal = 0;
            ResultSet rs = s.executeQuery(sql2);
            while (rs.next()) {                
                valueTotal = rs.getInt(1);
                String getString = txtTotal.getText();
                int total = Integer.parseInt(getString);
                valueTotal += total;                
            }
            String updateTotal = "UPDATE user_db.total SET total= ?";
            PreparedStatement stmt = conn.prepareStatement(updateTotal);
            stmt.setInt(1, valueTotal);
            stmt.executeUpdate();
            String sqldel = "DELETE FROM transaction_temp";
                
                s.executeUpdate(sqldel);
            conn.close();
          
            
            JOptionPane.showMessageDialog(this, "Checkout has been successful");
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CartActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TransactionDetails().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TransactionDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Bg;
    private javax.swing.JButton Cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDate;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
