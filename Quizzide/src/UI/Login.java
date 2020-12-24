/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Config.Operations;
import javax.swing.JOptionPane;


/**
 *
 * @author Shashee Madhavi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_main = new javax.swing.JPanel();
        p_left = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        p_right = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        txt_signIn = new javax.swing.JLabel();
        close_button = new javax.swing.JLabel();
        p_signIn = new javax.swing.JPanel();
        lbl_signIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_left.setBackground(new java.awt.Color(0, 51, 102));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_resized.png"))); // NOI18N

        javax.swing.GroupLayout p_leftLayout = new javax.swing.GroupLayout(p_left);
        p_left.setLayout(p_leftLayout);
        p_leftLayout.setHorizontalGroup(
            p_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_leftLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(logo)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        p_leftLayout.setVerticalGroup(
            p_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_leftLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_right.setBackground(new java.awt.Color(51, 51, 51));

        username.setBackground(new java.awt.Color(51, 51, 51));
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("Username");
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("000000000");
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        txt_signIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_signIn.setForeground(new java.awt.Color(204, 204, 204));
        txt_signIn.setText("Sign In");

        close_button.setForeground(new java.awt.Color(204, 204, 204));
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_20px.png"))); // NOI18N
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_buttonMouseExited(evt);
            }
        });

        p_signIn.setBackground(new java.awt.Color(0, 51, 102));
        p_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_signInMouseExited(evt);
            }
        });

        lbl_signIn.setBackground(new java.awt.Color(0, 51, 102));
        lbl_signIn.setForeground(new java.awt.Color(204, 204, 204));
        lbl_signIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_signIn.setText("Sign In");

        javax.swing.GroupLayout p_signInLayout = new javax.swing.GroupLayout(p_signIn);
        p_signIn.setLayout(p_signInLayout);
        p_signInLayout.setHorizontalGroup(
            p_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_signInLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbl_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        p_signInLayout.setVerticalGroup(
            p_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_signInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_signIn, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout p_rightLayout = new javax.swing.GroupLayout(p_right);
        p_right.setLayout(p_rightLayout);
        p_rightLayout.setHorizontalGroup(
            p_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_rightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close_button)
                .addGap(16, 16, 16))
            .addGroup(p_rightLayout.createSequentialGroup()
                .addGroup(p_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_rightLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txt_signIn))
                    .addGroup(p_rightLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(p_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(password)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        p_rightLayout.setVerticalGroup(
            p_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_rightLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(close_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_signIn)
                .addGap(55, 55, 55)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p_signIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout p_mainLayout = new javax.swing.GroupLayout(p_main);
        p_main.setLayout(p_mainLayout);
        p_mainLayout.setHorizontalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addComponent(p_left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p_right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_mainLayout.setVerticalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(p_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void close_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseEntered
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_20px_1.png")));
    }//GEN-LAST:event_close_buttonMouseEntered

    private void close_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseExited
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_20px.png")));
    }//GEN-LAST:event_close_buttonMouseExited

    private void p_signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_signInMouseEntered
        p_signIn.setBackground(new java.awt.Color(0, 102, 153));
        p_signIn.setCursor(new java.awt.Cursor(HAND_CURSOR));
    }//GEN-LAST:event_p_signInMouseEntered

    private void p_signInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_signInMouseExited
        p_signIn.setBackground(new java.awt.Color(0, 51, 102));
    }//GEN-LAST:event_p_signInMouseExited

    private void p_signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_signInMouseClicked
        Config.Operations operations = new Operations();
        
        try {
            String usernameStr = username.getText();
            String passwordStr = password.getText();
            if (operations.isLogin(usernameStr, passwordStr, this)) {
                new adminHome().setVisible(true);
                this.dispose();
                
            }else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Please type correct information!");
        }
    }//GEN-LAST:event_p_signInMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel lbl_signIn;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel p_left;
    private javax.swing.JPanel p_main;
    private javax.swing.JPanel p_right;
    private javax.swing.JPanel p_signIn;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel txt_signIn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
