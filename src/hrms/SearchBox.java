/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrms;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LORDsajan
 */
public class SearchBox extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ImageIcon img;

    /**
     * Creates new form SearchBox
     */
    public SearchBox() {
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

        searchPan = new javax.swing.JPanel();
        heading3 = new javax.swing.JPanel();
        headLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchSub = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchPan.setBackground(new java.awt.Color(51, 51, 51));
        searchPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading3.setBackground(new java.awt.Color(0, 102, 102));
        heading3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        headLabel3.setForeground(new java.awt.Color(255, 255, 255));
        headLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headLabel3.setText("ADD USER");
        heading3.add(headLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        searchPan.add(heading3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        txtID.setBackground(new java.awt.Color(51, 51, 51));
        txtID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(null);
        txtID.setCaretColor(new java.awt.Color(255, 255, 255));
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtID.setOpaque(false);
        searchPan.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 280, 30));

        jSeparator7.setForeground(new java.awt.Color(102, 0, 0));
        searchPan.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 10));

        jSeparator8.setForeground(new java.awt.Color(102, 0, 0));
        searchPan.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 280, 10));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name");
        searchPan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 140, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");
        searchPan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 40));

        searchSub.setBackground(new java.awt.Color(0, 204, 204));
        searchSub.setText("SUBMIT");
        searchSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSubActionPerformed(evt);
            }
        });
        searchPan.add(searchSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 400, 30));

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtName.setOpaque(false);
        searchPan.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 280, 30));

        getContentPane().add(searchPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSubActionPerformed
        MyEmployees me = new MyEmployees();
        me.setVisible(true);
        this.dispose();
        String empID = txtID.getText();
        System.out.println(empID);
        String firstName = txtName.getText();
        System.out.println(firstName);
        DefaultTableModel t = (DefaultTableModel) me.tblEmp.getModel();
        int rowCount = t.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        /*
        try {
            SqliteConnect.connectDb();
            String sql = "SELECT * FROM employee WHERE first_name='" + firstName + "' OR emp_id='" + empID + "'";
            pst = SqliteConnect.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("first_name") + " " + rs.getString("last_name");
                t.addRow(new Object[]{
                    "            " + rs.getString("emp_id"),
                    "       " + name,
                    "     " + rs.getString("email"),
                    "        " + rs.getString("contact_no"),
                    "      " + rs.getString("designation"),
                    "         " + rs.getString("department"),
                    "        " + rs.getString("doJoin")
                });
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid ID");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         */
    }//GEN-LAST:event_searchSubActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headLabel3;
    private javax.swing.JPanel heading3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel searchPan;
    private javax.swing.JButton searchSub;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
