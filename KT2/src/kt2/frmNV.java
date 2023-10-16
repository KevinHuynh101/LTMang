/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kt2;

import data.DbAccess;

import data.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kimdo
 */
public class frmNV extends javax.swing.JFrame {
        DefaultTableModel tableModel;
       
    
    List<NhanVien> studentList = new ArrayList<>();

    /**
     * Creates new form frmPhanQuyen
     */
    public frmNV() {
        initComponents();
        
         

        
    }
    private void showStudent() {
        studentList = DbAccess.findNVQuanLy();
        
        tableModel.setRowCount(0);
        
        studentList.forEach((student) -> {
            tableModel.addRow(new Object[] { student.getManv(), 
                student.getTenNV(), student.getSdt(), student.getDiaChi(),student.isLaquanly()});
        });   
       
    }
     private void showStudent1() {
        studentList = DbAccess.findNV();
        
        tableModel.setRowCount(0);
        
        studentList.forEach((student) -> {
            tableModel.addRow(new Object[] { student.getManv(), 
                student.getTenNV(), student.getSdt(), student.getDiaChi(),student.isLaquanly()});
        
        });    
    }
     private void showNVQuanly(){
         tableModel = (DefaultTableModel) tblQuanLy.getModel();
        showStudent();
     }
     private void showNV(){
         tableModel = (DefaultTableModel) tbNV.getModel();
        showStudent1();
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblQuanLy = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách nhân viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblQuanLy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Địa chỉ", "Quản lý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQuanLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblQuanLy);
        if (tblQuanLy.getColumnModel().getColumnCount() > 0) {
            tblQuanLy.getColumnModel().getColumn(4).setPreferredWidth(65);
            tblQuanLy.getColumnModel().getColumn(4).setMaxWidth(65);
        }

        tbNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số diện thoại", "Địa chỉ", "Quản lý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNV.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbNVPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tbNV);
        if (tbNV.getColumnModel().getColumnCount() > 0) {
            tbNV.getColumnModel().getColumn(4).setPreferredWidth(65);
            tbNV.getColumnModel().getColumn(4).setMaxWidth(65);
        }

        jLabel1.setText("Nhân viên ");

        jLabel2.setText("Nhân viên quản lý");

        jButton1.setText("Xác nhận ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xác nhận");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mặt hàng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         showNVQuanly();
         showNV();
    }//GEN-LAST:event_formWindowOpened

    private void tblQuanLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblQuanLyMouseClicked

    private void tbNVPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbNVPropertyChange
        // TODO add your handling code here:
               
                                  
    }//GEN-LAST:event_tbNVPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Connection connection = null;
//        PreparedStatement statement = null;
        int selectedIndex = tbNV.getSelectedRow();
        
        int vitri = tbNV.getSelectedRow();
        String manv = tbNV.getValueAt(vitri, 0).toString();
        String TenNV = tbNV.getValueAt(vitri, 1).toString();
        boolean quanly = Boolean.parseBoolean(tbNV.getValueAt(vitri, 4).toString());
        if(selectedIndex >= 0) {
//            int option = JOptionPane.showConfirmDialog(this, "Muốn chắc chắn muốn hủy quyền cuả "+TenNV);
            int option = JOptionPane.showConfirmDialog(this, 
                 "Bạn  chắc chắn muốn cấp quyền quản trị cho "+TenNV, "Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
            if(option == 0) {
              DbAccess.pass(manv, quanly);
              frmXacNhan frm = new frmXacNhan();
               frm.setVisible(true);
               dispose();
//                       
        }else
            {
                showNVQuanly();
                showNV();  
            }            
        }
            
//                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblQuanLy.getSelectedRow();
        Connection connection = null;
        PreparedStatement statement = null;
        int vitri = tblQuanLy.getSelectedRow();        
        String maql = tblQuanLy.getValueAt(vitri, 0).toString();
        String TenNV = tblQuanLy.getValueAt(vitri, 1).toString();
        boolean quanly0 = Boolean.parseBoolean(tblQuanLy.getValueAt(vitri, 4).toString());
//        System.out.println(quanly0);
        if(selectedIndex >= 0) {
//            int option = JOptionPane.showConfirmDialog(this, "Muốn chắc chắn muốn hủy quyền cuả "+TenNV);
            int option = JOptionPane.showConfirmDialog(this, 
                 "Bạn  chắc chắn muốn hủy quyền quản trị cuả "+TenNV, "Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
            if(option == 0) {
              DbAccess.pass(maql, quanly0);
              frmXacNhan frm = new frmXacNhan();
               frm.setVisible(true);
               dispose();
//                       
        }else
            {
                showNVQuanly();
                showNV();  
            }            
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frmMatHang frm = new  frmMatHang();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbNV;
    private javax.swing.JTable tblQuanLy;
    // End of variables declaration//GEN-END:variables
}
