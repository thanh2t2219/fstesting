/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsoccerscout;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oOo
 */
public class MyConnection {
    public static Connection getConnection(){
    Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mysql_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    public static void main(String args[]){
       try{
        Connection con = MyConnection.getConnection();
        Statement st2 = con.createStatement();
        st2.executeUpdate("INSERT INTO `playertable`(name,num,nationality,height,weight,rating,position,birthday)VALUES('A',3,'BC',102,10,0,'AA','230')");
        con.close();
       }
            catch(Exception E){
                   System.err.println("Gotcha") ;
                    }
 
}
}
