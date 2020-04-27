/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login_register_design;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class My_CNX {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "users_db";
    private static Integer portnumber = 3307;
    private static String password = "123456789";
    
    public static Connection getConnection(){
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}
