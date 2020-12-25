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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    public static void viewCources(JTable cources_table, JFrame frame, String sqlQuery) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = myConn.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)cources_table.getModel();
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                Object coursesObject[] = {
                    resultSet.getString("course_id"),
                    resultSet.getString("course_name")
                };
                tableModel.addRow(coursesObject);
            }
            myConn.close();
            
        } catch(Exception exception) {
            JOptionPane.showMessageDialog(frame, "Error: " + exception.getMessage());
        }
    }
    
    public static void saveCourse(String courseID, String courseName, JFrame frame) {
        try {
            Connection myConn = MySQLConnection.getConnection();
            String sqlQuery = "INSERT INTO tbl_courses (course_id, course_name) VALUES (?, ?)";
            
            PreparedStatement preparedStatement = myConn.prepareStatement(sqlQuery);
            preparedStatement.setString(1, courseID);
            preparedStatement.setString(2, courseName);
            
            try {
                preparedStatement.execute();
                JOptionPane.showMessageDialog(frame, "Data has been saved!");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Data Error: " + exception.getMessage());
            }
            myConn.close();
            
        } catch(Exception exception) {
            JOptionPane.showMessageDialog(frame, "Error: " + exception.getMessage());
        }
    }
}
