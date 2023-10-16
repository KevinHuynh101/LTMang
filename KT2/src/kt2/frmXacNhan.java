/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kt2;
import data.DbAccess;
import data.NhanVien;
import data.Pass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kt2.frmDangNhap;

/**
 *
 * @author kimdo
 */
public class frmXacNhan extends javax.swing.JFrame {

    /**
     * Creates new form frmXacNhan
     */
    public frmXacNhan() {
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

        jLabel1 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnYes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vui lòng xác nhận mật khẩu : ");

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        jButton2.setText("No");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYes)
                    .addComponent(jButton2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        List<Pass> studentList = new ArrayList<>();
        String s= "" ;
        String pass = new String(txtpass.getPassword());
        String s1 = "";
        boolean s2 = true ;
        
        try {
            DbAccess acc = new DbAccess();
            String QueryStr = "select * from PASS ";            
            ResultSet rs = acc.Query(QueryStr);
            
           while (rs.next()) {                
                Pass std = new Pass(rs.getInt("id"), 
                        rs.getString("PASS"),rs.getString("S1"),rs.getBoolean("S2"));
                s= std.getPass();      
                s1 =std.getS1();
                s2 = std.isS2();
            }
//            System.out.println(s);
            boolean sosanh =pass.equals(s);
            if(sosanh == true){
                JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu thành công ");
                update(s1,s2);
                frmNV frm = new frmNV();
                frm.setVisible(true);
                
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Mật khẩu không đúng ");
            }
           // DbAccess.pass(password);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnYesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frmNV frm = new frmNV();
                frm.setVisible(true);
                
                dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmXacNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmXacNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmXacNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmXacNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmXacNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnYes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
    public void update(String maquanly,boolean quanly){
        Connection connection = null;
        PreparedStatement statement = null;
        
        
          try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql ="UPDATE NHAN_VIEN SET LAQUANLY = '"+quanly+"' WHERE MANHANVIEN = '"+maquanly+"';";
           
            statement = connection.prepareCall(sql);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
