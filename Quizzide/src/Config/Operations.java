/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shashee Madhavi
 */
public class Operations {
    public static boolean isLogin(String username, String password, JFrame frame) {
        try{
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery = 
                    "SELECT actual_name, username, role FROM tbl_users WHERE username='"
                    + username + "'AND password='"
                    + password + "'";
            
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                LoginSession.userName = resultSet.getString("username");
                LoginSession.userRealName = resultSet.getString("actual_name");
                LoginSession.userRole = resultSet.getString("role");
                
                return true;
            }
            myConn.close();
            
            
        }catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database Error!" + exception.getMessage());
        }
        return false;
    }
}
