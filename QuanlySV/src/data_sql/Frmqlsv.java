
package data_sql;
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
        showCT();
        //updatatable.loadData(sql, tbdssv);
        ProcessCTR(false);
    }
public void showCT(){
        updatatable.loadData(sql, tbdssv);
        this.lbtong.setText("Tổng :" + this.tbdssv.getRowCount() +" lớp học");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        txthotesv = new javax.swing.JTextField();
        btnthemmoi = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdssv = new javax.swing.JTable();
        lbtong = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtsodt = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        cbogt = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("Mã SV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("Họ tên SV");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setText("Số điện thoại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jLabel6.setText("Giới tính");

        btnthemmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        btnxoa.setText("XÓA");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        tbdssv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ và Tên SV", "Email", "Số đt", "Giới tính", "Địa chỉ"
            }
        ));
        tbdssv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdssvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdssv);

        lbtong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbtong.setText("Tổng....");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("Địa chỉ");

        cbogt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbogt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txthotesv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                            .addComponent(txtmasv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                            .addComponent(txtsodt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnthemmoi)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnsua)
                                                .addComponent(btnthem)
                                                .addComponent(btnxoa))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(lbtong, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(604, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnthemmoi))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txthotesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbogt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbtong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ProcessCTR(boolean b){
    this.btnthem.setEnabled(b);
    this.btnxoa.setEnabled(b);
    this.btnsua.setEnabled(b);
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
        ResultSet rs = updatatable.ShowTextField(sql1);
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
                
                sinhvien.themSV(this.txtmasv.getText().trim(), this.txthotesv.getText(),this.txtemail.getText(),this.txtsodt.getText(),this.cbogt.getSelectedItem().toString(),this.txtdc.getText());
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
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbogt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbtong;
    private javax.swing.JTable tbdssv;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthotesv;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtsodt;
    // End of variables declaration//GEN-END:variables
}
