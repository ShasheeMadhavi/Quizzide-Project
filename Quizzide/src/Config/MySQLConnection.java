/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shashee Madhavi
 */
public class MySQLConnection {
    public static Connection geConnection() throws Exception {
        String dbRoot = "jdbc:mysql://";
        String hostName = "sql12.freemysqlhosting.net:3306/";
        String dbName = "";
        String dbUrl = dbRoot+hostName+dbName;
        
        String hostUsername = "";
        String hostPassword = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        
        return myConn;
    }
}
