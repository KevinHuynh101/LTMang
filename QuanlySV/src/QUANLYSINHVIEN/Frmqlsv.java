
package QUANLYSINHVIEN;
import static data_sql.Frmqlsv.masv;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Frmqlsv extends javax.swing.JFrame {
public static String sql = "SELECT * FROM dbo.SinhVien";
public static String masv;
    public Frmqlsv() {
        initComponents();
       // updatatable.loadData(sql, tbdssv);
        showCT();
        ProcessCTR(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        txthotesv = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsodt = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        cbogt = new javax.swing.JComboBox<>();
        btnthemmoi = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        bttim = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdssv = new javax.swing.JTable();
        lbtong = new javax.swing.JLabel();
        btht = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Mã Sinh Viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Họ tên Sinh Viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Giới tính");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Địa chỉ");

        txtmasv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txthotesv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtsodt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtdc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbogt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbogt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        btnthemmoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnthemmoi.setForeground(new java.awt.Color(153, 51, 0));
        btnthemmoi.setText("Nhập mới");
        btnthemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemmoiActionPerformed(evt);
            }
        });

        btnthem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnthem.setText("THÊM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsua.setText("SỬA");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QUANLYSINHVIEN/iconsset2/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnxoa.setText("XÓA");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        bttim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttim.setForeground(new java.awt.Color(0, 51, 204));
        bttim.setText("Tìm Kiếm");
        bttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimActionPerformed(evt);
            }
        });

        txttim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttim.setForeground(new java.awt.Color(153, 51, 0));

        tbdssv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên SV", "Email", "Số ĐT", "Giới tính", "Địa chỉ"
            }
        ));
        tbdssv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdssvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdssv);

        lbtong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbtong.setForeground(new java.awt.Color(153, 51, 0));
        lbtong.setText("Tổng số sinh viên");

        btht.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btht.setText("Tấc cả");
        btht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthtActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QUANLYSINHVIEN/iconsset2/Student-3-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtsodt)
                                            .addComponent(txtmasv)
                                            .addComponent(txthotesv)
                                            .addComponent(cbogt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btht))
                                    .addComponent(bttim)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnthemmoi)
                                    .addComponent(btnthem)
                                    .addComponent(btnxoa)
                                    .addComponent(btnsua)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(lbtong)))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btht)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnthemmoi)
                                .addGap(18, 18, 18)
                                .addComponent(btnthem)))
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txthotesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbogt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbtong)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showCT(){
        updatatable.loadData(sql, tbdssv);
        this.lbtong.setText("Tồng số: "+this.tbdssv.getRowCount()+ " Sinh Viên");
    }
    private void tbdssvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdssvMouseClicked
        ProcessCTR(true);
        this.btnthem.setEnabled(false);
        
        try {
            
            // lấy dòng dl hiện tại mình đang nhấn chuột
        int row = this.tbdssv.getSelectedRow();
        //lấy dl o dòng i vừa nhận và ssu đó đổi sang string
        String IDrow = (this.tbdssv.getModel()).getValueAt(row, 0).toString();
        
        String sql1 = "SELECT * FROM dbo.SinhVien where masv ='"+IDrow+"'";
        ResultSet rs = data_sql.updatatable.ShowTextField(sql1);
        if(rs.next())// nếu có kiều dl
        {
            masv = rs.getString("masv");
            this.txtmasv.setText(rs.getString("masv"));
            this.txthotesv.setText(rs.getString("hoten"));
            this.txtemail.setText(rs.getString("email"));
            this.txtsodt.setText(rs.getString("sodt"));
            if(rs.getString("gioitinh").toString()=="Nam")
                cbogt.setSelectedIndex(0);
            else cbogt.setSelectedIndex(1);
            //this.cbogt.getSelectedItem().toString()(rs.getString("gioitinh"));
            this.txtdc.setText(rs.getString("diachi"));
        }
    
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_tbdssvMouseClicked
public void ProcessCTR(boolean b){
    this.btnthem.setEnabled(b);
    this.btnxoa.setEnabled(b);
    this.btnsua.setEnabled(b);
}
    private void btnthemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemmoiActionPerformed
         ProcessCTR(false);
        this.btnthem.setEnabled(true);
        this.txtmasv.setText(null);
        this.txthotesv.setText(null);
        this.txtdc.setText(null);
        this.txtsodt.setText(null);
        this.txtemail.setText(null);
    }//GEN-LAST:event_btnthemmoiActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        if(this.txtmasv.getText().length()==0)
           // txtmasv.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(null, "Không được để trống", "Thông báo", 1);
        else
            if(this.txtmasv.getText().length()>10)
               // txtmasv.setBackground(Color.white);
                JOptionPane.showMessageDialog(null, "mã lớp ko quá 10 ký tự", "Thông báo", 1);
        else
            if(this.txtmasv.getText().length()==10)
                JOptionPane.showMessageDialog(null, "Không được để trống", "Thông báo", 1);
        else
            {
                
                data_sql.sinhvien.themSV(this.txtmasv.getText().trim(), this.txthotesv.getText(),this.txtemail.getText(),this.txtsodt.getText(),this.cbogt.getSelectedItem().toString(),this.txtdc.getText());
                showCT();
                ProcessCTR(false);
            }
   
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
       if(this.txtmasv.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Không được để trống", "Thông báo", 1);
        else
            if(this.txtmasv.getText().length()>10)
                JOptionPane.showMessageDialog(null, "mã lớp ko quá 10 ký tự", "Thông báo", 1);
        else
            if(this.txthotesv.getText().length()==10)
                JOptionPane.showMessageDialog(null, "Không được để trống", "Thông báo", 1);
        else
            {
                sinhvien.suaSV(masv,this.txtmasv.getText().trim(),this.txthotesv.getText(),this.txtemail.getText(),this.txtsodt.getText(),this.cbogt.getSelectedItem().toString(),this.txtdc.getText());
                showCT();
                ProcessCTR(false);
            }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
       if(this.txtmasv.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Bạn cần chọn để xóa", "Thông báo", 1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa lớp "+masv+ " hay không?","Thông báo",2)==0)
            sinhvien.xoaSV(masv);
            showCT();
            ProcessCTR(false);
        }    
    }//GEN-LAST:event_btnxoaActionPerformed

    private void bttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimActionPerformed
        if(this.txttim.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Cần Nhập từ khóa tìm"," Thông báo",1);
        else
        {
            String sql1="SELECT * FROM dbo.SinhVien where masv like '%"+this.txttim.getText()+"%'or hoten like '%"+this.txttim.getText()+"%'";
            updatatable.loadData(sql1, tbdssv);
            
        }
    }//GEN-LAST:event_bttimActionPerformed

    private void bthtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthtActionPerformed
       showCT();
        ProcessCTR(false);
        this.txttim.setText(null);
    }//GEN-LAST:event_bthtActionPerformed

   
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
            java.util.logging.Logger.getLogger(Frmqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmqlsv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btht;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton bttim;
    private javax.swing.JComboBox<String> cbogt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtong;
    private javax.swing.JTable tbdssv;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthotesv;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtsodt;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
