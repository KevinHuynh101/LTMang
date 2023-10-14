
package data_sql;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

import sun.security.pkcs11.Secmod;

public class updatatable {
    public static ResultSet rs=null;// kết quả trả về 1 bảng hay 1 dòng dl
    public static PreparedStatement pst =null; // biến thực thi sql
    public static Connection conn = connect.getConnect();// lấy từ lớp connect
    //hàm nạp dl cho bảng
    public static void loadData(String sql, JTable tb){
        try {
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Thông báo lỗi",1);
        }
    }
         //hàm đổ 1 dòng dl từ table -> field     
        public static ResultSet ShowTextField(String sql){
            try {
                pst= conn.prepareStatement(sql);
                //trả về 1 dòng dl đọc được
                return pst.executeQuery();
                
            } catch (Exception e) {
                return null;
            }
        }
  }
    

