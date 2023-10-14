
package QUANLYSINHVIEN;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class connect {
    public static Connection getConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String URL = "jdbc:sqlserver://localhost;Database=QLSinhVien;user=sa;password=Ltm@123";
            Connection con = DriverManager.getConnection(URL);
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}