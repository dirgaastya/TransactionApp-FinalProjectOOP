/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dirga Astya W
 */
public class connect {
    private static  Connection connect;
    
    public static Connection getConnection() throws SQLException{
        try {
            String DB ="jdbc:mysql://localhost/user_db";
            String user="root";
            String pass="root";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connect = (Connection) DriverManager.getConnection(DB,user,pass);
            System.out.println("connect");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return connect;
    } 
}

