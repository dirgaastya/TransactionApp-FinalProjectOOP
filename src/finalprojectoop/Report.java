/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Taufik Yahya
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     * @throws java.sql.SQLException
     */
    public Report() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        displayTable();
        this.setBackground(new java.awt.Color(0,0,0,0));
        getTotal();
    }
    public final void getTotal(){
        try {
            try (Connection conn = (Connection)finalprojectoop.connect.getConnection()) {
                Statement s = conn.createStatement();
                String sql2 = "SELECT total FROM user_db.total";
                
                ResultSet rs = s.executeQuery(sql2);
                while (rs.next()) {
                    int valueTotal = rs.getInt(1);
                    String total = String.valueOf(valueTotal);
                    txtReport.setText(total);
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public final void displayTable() throws SQLException{
      try {
            try ( // TODO add your handling code here:
                Connection conn = (Connection)finalprojectoop.connect.getConnection()) {
                Statement s = conn.createStatement();
                
                String sql = "SELECT * FROM user_db.transaction_report";
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

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtReport = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 660, 280));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 247, 250));
        jLabel3.setText("Total");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        txtReport.setEditable(false);
        txtReport.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtReport.setForeground(new java.awt.Color(245, 247, 250));
        txtReport.setBorder(null);
        txtReport.setOpaque(false);
        txtReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportActionPerformed(evt);
            }
        });
        getContentPane().add(txtReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 310, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 320, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Report.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Home newHome = new Home();
         newHome.setVisible(true);
         this.dispose();
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Report().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField txtReport;
    // End of variables declaration//GEN-END:variables
}
