package com.mycompany.login_register_design;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class THE_CONNECTION {
    
    
    private static String servername = "localhost";
    private static String dbname = "java_rst_db";
    private static String username = "root";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    // create a function to get the connection
    public static Connection getTheConnection() {
        Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
}
