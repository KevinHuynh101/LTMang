
package lession5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choose;
        
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            
            switch(choose) {
                case 1:
                    showStudents();
                    break;
                case 2:
                    insertStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    findStudent();
                    break;
                case 6:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Failed!!!");
                    break;
            }
        } while(choose != 6);
    }
    
    static void showMenu() {
        System.out.println("1. Show Students");
        System.out.println("2. Insert");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Find");
        System.out.println("6. Exit");
        System.out.println("Choose: ");
    }

    private static void showStudents() {
        //Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        Connection conn = null;
        Statement statement = null;
        try {
            //B1. Tạo kết nối tới CSDL
            conn = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement", "root", "");
            
            //B2. Tạo 1 truy vấn tới CSDL
            //B2.1: Viết 1 lệnh sql lấy danh sách sinh viên
            String sql = "select * from student";
            //B2.2: Viết API Java Trúy vấn CSDL
            statement = conn.createStatement();
            //B2.4: Lấy dữ liệu từ CSDL ra
            ResultSet resultSet = statement.executeQuery(sql);
            //B2.5: Đọc dữ liệu từ ResultSet => convert thành cacs object trong Java
            while(resultSet.next()) {
                Student std = new Student(resultSet.getString("rollno"), 
                        resultSet.getString("fullname"), 
                        resultSet.getString("birthday"), 
                        resultSet.getString("gender"), 
                        resultSet.getString("email"), 
                        resultSet.getString("address"));
                std.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //B3. Close connection
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Finish Show Students
    }

    private static void insertStudent() {
        Student student = new Student();
        student.input();
        
        //Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            //B1. Tạo kết nối tới CSDL
            conn = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement", "root", "");
            
            //B2. Tạo 1 truy vấn tới CSDL
            //B2.1: Viết 1 lệnh sql lấy danh sách sinh viên
            String sql = "insert into student(rollno, fullname, birthday, gender, email, address)"
                    + " values (?, ?, ?, ?, ?, ?)";
            //B2.2: Viết API Java Trúy vấn CSDL
            statement = conn.prepareCall(sql);
            statement.setString(1, student.getRollno());
            statement.setString(2, student.getFullname());
            statement.setString(3, student.getBirthday());
            statement.setString(4, student.getGender());
            statement.setString(5, student.getEmail());
            statement.setString(6, student.getAddress());
            //B2.4: Lấy dữ liệu từ CSDL ra
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //B3. Close connection
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Finish Show Students
    }

    private static void updateStudent() {
        System.out.println("Sửa thông tin sinh vien theo MSV");
        Student student = new Student();
        student.input();
        
        //Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            //B1. Tạo kết nối tới CSDL
            conn = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement", "root", "");
            
            //B2. Tạo 1 truy vấn tới CSDL
            //B2.1: Viết 1 lệnh sql lấy danh sách sinh viên
            String sql = "update student set fullname = ?, birthday = ?, gender = ?, email = ?, address = ?"
                    + " where rollno = ?";
            //B2.2: Viết API Java Trúy vấn CSDL
            statement = conn.prepareCall(sql);
            statement.setString(1, student.getFullname());
            statement.setString(2, student.getBirthday());
            statement.setString(3, student.getGender());
            statement.setString(4, student.getEmail());
            statement.setString(5, student.getAddress());
            statement.setString(6, student.getRollno());
            //B2.4: Lấy dữ liệu từ CSDL ra
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //B3. Close connection
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Finish Show Students
    }

    private static void deleteStudent() {
        System.out.println("Nhap MSV can xoa: ");
        String rollNo = scan.nextLine();
        
        
        //Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            //B1. Tạo kết nối tới CSDL
            conn = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement", "root", "");
            
            //B2. Tạo 1 truy vấn tới CSDL
            //B2.1: Viết 1 lệnh sql lấy danh sách sinh viên
            String sql = "delete from student where rollno = ?";
            //B2.2: Viết API Java Trúy vấn CSDL
            statement = conn.prepareCall(sql);
            statement.setString(1, rollNo);
            //B2.4: Lấy dữ liệu từ CSDL ra
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //B3. Close connection
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Finish Show Students
    }

    private static void findStudent() {
        System.out.println("Nhap sinh vien can tim kiem: ");
        String fullname = scan.nextLine();
        
        //Các bước cần làm để lấy dữ liệu trong CSDL ra & hiển thị
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            //B1. Tạo kết nối tới CSDL
            conn = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagement", "root", "");
            
            //B2. Tạo 1 truy vấn tới CSDL
            //B2.1: Viết 1 lệnh sql lấy danh sách sinh viên
            String sql = "select * from student where fullname like ?";
            //B2.2: Viết API Java Trúy vấn CSDL
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%"+fullname+"%");
            //B2.4: Lấy dữ liệu từ CSDL ra
            ResultSet resultSet = statement.executeQuery();
            //B2.5: Đọc dữ liệu từ ResultSet => convert thành cacs object trong Java
            while(resultSet.next()) {
                Student std = new Student(resultSet.getString("rollno"), 
                        resultSet.getString("fullname"), 
                        resultSet.getString("birthday"), 
                        resultSet.getString("gender"), 
                        resultSet.getString("email"), 
                        resultSet.getString("address"));
                std.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //B3. Close connection
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Finish Show Students
    }
}
