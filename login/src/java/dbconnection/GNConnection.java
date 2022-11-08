/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GNConnection 
{
    private static final String url="jdbc:mysql://localhost:3306/gatenetacademy";
    private static final String user="root";
    private static final String pwd="root";
     public static Connection getGNConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, pwd);
        return con;
    }
}

    

