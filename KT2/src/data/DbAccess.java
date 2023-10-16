/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author huyho
 */
public class DbAccess {
    private Connection conn;
    private Statement stmt;
    
    
    public DbAccess(){
        try{
            MyConnection mycon = new MyConnection();
            conn = mycon.getConnect();
            stmt = conn.createStatement();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    
    public ResultSet Query(String str){
        try{
              ResultSet rs = stmt.executeQuery(str);
              return rs;
        }catch(Exception ex){
            return  null;
        }
    }
    
    public static List<NhanVien> findNVQuanLy() {
        List<NhanVien> studentList = new ArrayList<>();
         Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
//            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql = "select * from NHAN_VIEN where LAQUANLY =1;";
            
            statement = connection.createStatement();           
            ResultSet resultSet = statement.executeQuery(sql);
//            System.out.println(resultSet);
            
            while (resultSet.next()) {                
                NhanVien std = new NhanVien(resultSet.getString("MANHANVIEN"), 
                        resultSet.getString("TENNHANVIEN"),resultSet.getInt("SDT"), 
                        resultSet.getString("DIACHI"),resultSet.getString("TENDANGNHAP")
                        ,resultSet.getString("MATKHAU"),resultSet.getBoolean("LAQUANLY"));
                studentList.add(std);
            }
            System.out.println(studentList);
        }catch (SQLException ex) {
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
        //ket thuc.
         return studentList;
    }
    //////
    public static List<NhanVien> findNV() {
        List<NhanVien> studentList = new ArrayList<>();
         Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
//            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql = "select * from NHAN_VIEN where LAQUANLY =0;";
            
            statement = connection.createStatement();           
            ResultSet resultSet = statement.executeQuery(sql);
//            System.out.println(resultSet);
            
            while (resultSet.next()) {                
                NhanVien std = new NhanVien(resultSet.getString("MANHANVIEN"), 
                        resultSet.getString("TENNHANVIEN"),resultSet.getInt("SDT"), 
                        resultSet.getString("DIACHI"),resultSet.getString("TENDANGNHAP")
                        ,resultSet.getString("MATKHAU"),resultSet.getBoolean("LAQUANLY"));
                studentList.add(std);
            }
            System.out.println(studentList);
        }catch (SQLException ex) {
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
        //ket thuc.
         return studentList;
    }
    
    ////
    public static List<MatHang> findMatHang() {
        List<MatHang> studentList = new ArrayList<>();
         Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
//            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql = "select * from MAT_HANG ;";
            
            statement = connection.createStatement();           
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println(resultSet);
            
            while (resultSet.next()) {                
                MatHang std = new MatHang(resultSet.getString("MAMH"), 
                        resultSet.getString("TENMH"),resultSet.getInt("GIABAN"), 
                        resultSet.getString("DVT"),resultSet.getString("MALOAI")
                        ,resultSet.getString("MOTA"),resultSet.getBoolean("VOHIEUHOA"));
                studentList.add(std);
            }
            System.out.println(studentList);
        }catch (SQLException ex) {
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
        //ket thuc.
         return studentList;
    }
    
    ///
    public static List<String> findLoaiMH() {
        List<String> studentList = new ArrayList<>();
         Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
//            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql = "select * from LOAI_MAT_HANG ;";
            
            statement = connection.createStatement();           
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println(resultSet);
            
            while (resultSet.next()) {                
                String std = resultSet.getString("MALOAI");
                       
                studentList.add(std);
            }
            System.out.println(studentList);
        }catch (SQLException ex) {
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
        //ket thuc.
         return studentList;
    }
    
    public String pass (String pass){
      return pass;       
    }
    public static List<NhanVien> findTaiKhoan() {
        List<NhanVien> studentList = new ArrayList<>();
         Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
//            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql = "select * from NHAN_VIEN ;";
            
            statement = connection.createStatement();           
            ResultSet resultSet = statement.executeQuery(sql);
//            System.out.println(resultSet);
            
            while (resultSet.next()) {                
                NhanVien std = new NhanVien(resultSet.getString("MANHANVIEN"), 
                        resultSet.getString("TENNHANVIEN"),resultSet.getInt("SDT"), 
                        resultSet.getString("DIACHI"),resultSet.getString("TENDANGNHAP")
                        ,resultSet.getString("MATKHAU"),resultSet.getBoolean("LAQUANLY"));
                studentList.add(std);
            }
            System.out.println(studentList);
        }catch (SQLException ex) {
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
        //ket thuc.
         return studentList;
    }
    
    public static void pass(String maquanly,boolean quanly){
        Connection connection = null;
        PreparedStatement statement = null;
        
        
          try {
            //lay tat ca danh sach sinh vien
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sa;password=12345;encrypt=false";
            System.out.println(URL);
            connection = DriverManager.getConnection(URL);
            String sql = "UPDATE PASS SET  s1 =N'"+maquanly+"' , s2 = '"+quanly+"' WHERE id = 1;";
           
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
//

        
        
}
