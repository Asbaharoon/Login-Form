/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.userinterface;

import com.test.dao.UserDAO;
import com.test.daoimpl.CityDAOImpl;
import com.test.daoimpl.UserDAOImpl;
import com.test.models.UserModel;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import com.test.dao.CityDAO;

/**
 *
 * @author Ahsan
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        initComponents();
        //getContentPane().setBackground(new Color(52, 73, 235));
        //getContentPane().setBackground(new Color(54, 3, 64));
        getContentPane().setBackground(new Color(74, 8, 87));
        //getContentPane().setBackground(new Color(100, 9, 117));

    }

    // Front End Validation
    
    // To Check Either Entered Email is Valid or Not
    static boolean isValidEmail(String email){
        //It ensures that the email must contain @ and . sign 
        //String email = emailField.getText().trim();
        if(!(email.contains("@") && email.contains("."))){
            
            return false;
        }
        return true;
    }
    
    // To Check Either Entered Password is Valid or Not
    static boolean isValidPassword(char password[]){
        //It Checks length, Contains an UpperCase and LowerCase of Password
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isContainsSpecificSpecialCharacters = false;
        
        //char password[] = passwordField.getText().trim().toCharArray();
    
        // To Check Length of Password
        if(!(password.length >= 8)){
            return false;
        }
        
        // To Check Upper Case Character
        for(int i = 0 ; i < password.length ;i++){
            
            if(Character.isUpperCase(password[i])){
                
                isUpperCase = true;
                break;
            }
        }
        
        // To Check Upper Case Character
        for(int i = 0 ; i < password.length ;i++){
            
            if(Character.isLowerCase(password[i])){
                
                isLowerCase = true;
                break;
            }
        }
        
        //TO Check Specific Special Characters
        for(int i = 0 ; i < password.length ;i++){
            
            if(Pattern.matches("[!@#$]", Character.toString(password[i]))){
                
                isContainsSpecificSpecialCharacters = true;
                break;
            }
        }
        return(isUpperCase && isLowerCase && isContainsSpecificSpecialCharacters);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        newAccountLbl = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        forgotPasswordLbl = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        headerLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(255, 255, 255));
        headerLbl.setText("WELCOME");

        emailLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 255, 255));
        emailLbl.setText("Email");

        passwordLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setText("Password");

        newAccountLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newAccountLbl.setForeground(new java.awt.Color(255, 0, 0));
        newAccountLbl.setText("New? Create an Account ?");

        signUpBtn.setForeground(new java.awt.Color(255, 0, 0));
        signUpBtn.setText("SignUp");
        signUpBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signUpBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailFieldKeyTyped(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        loginBtn.setForeground(new java.awt.Color(0, 0, 255));
        loginBtn.setText("Login ");
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        forgotPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forgotPasswordLbl.setForeground(new java.awt.Color(255, 0, 0));
        forgotPasswordLbl.setText("Forgot Password ?");

        resetBtn.setForeground(new java.awt.Color(255, 0, 0));
        resetBtn.setText("Reset");
        resetBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resetBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headerLbl)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(loginBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(forgotPasswordLbl)
                                    .addGap(34, 34, 34)
                                    .addComponent(resetBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailLbl)
                                        .addComponent(passwordLbl))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordField)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(newAccountLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUpBtn)
                                .addGap(14, 14, 14)))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAccountLbl)
                    .addComponent(signUpBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(emailLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPasswordLbl)
                    .addComponent(resetBtn))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        
        new RegisterationForm().setVisible(true);
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        UserDAO dao = new UserDAOImpl();
        UserModel user = null;
        
        if(!isValidEmail(emailField.getText().trim())){
            JOptionPane.showMessageDialog(this, "Invalid Email!");
        }
        else if(!isValidPassword(passwordField.getText().trim().toCharArray())){
            JOptionPane.showMessageDialog(this, "Invalid Password!");
        }
        else if(!dao.isEmailExist(emailField.getText().trim())){
            
            JOptionPane.showMessageDialog(this, "Email does not Exist!");
        }     
        else if(!dao.isPasswordExist(passwordField.getText().trim())){
            
            JOptionPane.showMessageDialog(this, "Password does not match!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Successfully Logged In!");
            user = dao.getSpecificUser(emailField.getText().trim(), passwordField.getText().trim());
            System.out.println(user.getGender());
            new UserFrame(user,emailField,passwordField).setVisible(true);
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        
        loginBtn.requestFocusInWindow();
                
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        
        char c = evt.getKeyChar();
        String x = Character.toString(c);
        
        if(!(Character.isLetterOrDigit(c) || Character.isISOControl(c) || Pattern.matches("[!@#$]", x))){
            
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letters & Numbers only!");
        }
        
    }//GEN-LAST:event_passwordFieldKeyTyped

    private void emailFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyTyped
        
        char c = evt.getKeyChar();
        
        if(!(Character.isLetterOrDigit(c) || Character.isISOControl(c) || Character.toString(c).equals(".") || Character.toString(c).equals("@"))){
            
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letters, Numbers, @ and . only!");
        }
        
    }//GEN-LAST:event_emailFieldKeyTyped

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        
        passwordField.requestFocusInWindow();
    }//GEN-LAST:event_emailFieldActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        String email = JOptionPane.showInputDialog("Enter Email\nNote: Email should be that one which you have used to at time of creating new account ");
        
        if(email != null && !email.trim().isEmpty()){
            System.out.println(email);
        }
        
    }//GEN-LAST:event_resetBtnActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel forgotPasswordLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel newAccountLbl;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
