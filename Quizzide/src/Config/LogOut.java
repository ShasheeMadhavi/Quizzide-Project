/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import javax.swing.JFrame;

/**
 *
 * @author Shashee Madhavi
 */
public class LogOut {
    public static void logOut(JFrame context, UI.Login login) {
        LoginSession.isLoggedIn = false;
        context.setVisible(false);
        login.setVisible(true);
        
    }
}
