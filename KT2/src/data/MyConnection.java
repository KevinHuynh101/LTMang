/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kimdo
 */
public class MyConnection {
    public static Connection getConnect() {
        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String URL = "jdbc:sqlserver://WKS-DEV-23;;encrypt=false;user=sa;password=21052002;applicationName=NamHuynh;databaseName=VANPHONGPHAM;sslProtocol=TLSv1";
           
            String URL = "jdbc:sqlserver://NAMHUYNH\\SQLEXPRESS:1433;"+
                    "databaseName=VANPHONGPHAM;user=sas;password=12345;encrypt=false";
            System.out.println(URL);
            Connection con = DriverManager.getConnection(URL);
            
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
