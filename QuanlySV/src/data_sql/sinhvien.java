
package data_sql;
import java.sql.*;
import javax.swing.*;
public class sinhvien {
    public static ResultSet rs=null;// kết quả trả về 1 bảng hay 1 dòng dl
    public static PreparedStatement pst =null; // biến thực thi sql
    public static Connection conn = connect.getConnect();// lấy từ lớp connect
    //hàm nạp dl cho bảng
    public static void themSV(String masv, String tensv,String Email, String SoDT, String GioiTinh, String DiaChi){
        String sql = "INSERT INTO SinhVien (masv, HoTen, Email, SoDT, GioiTinh, DiaChi)VALUES (?,?,?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, masv.trim());
            pst.setString(2, tensv.trim());
            pst.setString(3, Email.trim());
            pst.setString(4, SoDT.trim());
            pst.setString(5,GioiTinh.toString());
            pst.setString(6, DiaChi.trim());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm vào "+tensv+ " thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã lớp "+masv+ " đã tồn tại, không thể thêm","Thông báo",1);
        }
    }
    public static void suaSV(String masv1, String masv, String tensv,String Email, String SoDT, String GioiTinh, String DiaChi){
        String sql = "UPDATE Sinhvien SET masv=N'"+masv1+"',hoten=N'"+tensv+"',Email=N'"+Email+"',SoDT=N'"+SoDT+"',GioiTinh=N'"+GioiTinh+"',DiaChi=N'"+DiaChi+"' WHERE masv='"+masv.trim()+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "lớp "+masv1+ " đã sữa"+masv+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã lớp "+masv1+ " đã tồn tại, không thể sửa","Thông báo",1);
        }
    }
     public static void xoaSV(String masv){
        String sql = "DELETE FROM sinhvien WHERE masv='"+masv.trim()+"'";
        
         System.out.println(sql);
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "lớp "+masv+ " đã xóa thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã lớp "+masv+ " đã tồn tại, không thể xóa vì liên quan table khác","Thông báo",1);
        }
    }
}

