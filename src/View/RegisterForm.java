package View;

import Controller.My_CNX;
import java.awt.Color;
import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWaitingR = new javax.swing.JPanel();
        jLabelWaitingR = new javax.swing.JLabel();
        jPanelExitR = new javax.swing.JPanel();
        jLabelExitR = new javax.swing.JLabel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelConfirmPassword = new javax.swing.JLabel();
        JLabelPriority = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPasswordFieldPasswordConfirm = new javax.swing.JPasswordField();
        jTextFieldPhone = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelWallpaperR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelWaitingR.setBackground(new java.awt.Color(0, 102, 102));
        jPanelWaitingR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabelWaitingR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelWaitingR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWaitingR.setText("-");
        jLabelWaitingR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelWaitingRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelWaitingRLayout = new javax.swing.GroupLayout(jPanelWaitingR);
        jPanelWaitingR.setLayout(jPanelWaitingRLayout);
        jPanelWaitingRLayout.setHorizontalGroup(
            jPanelWaitingRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWaitingRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelWaitingR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelWaitingRLayout.setVerticalGroup(
            jPanelWaitingRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWaitingRLayout.createSequentialGroup()
                .addComponent(jLabelWaitingR)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelExitR.setBackground(new java.awt.Color(0, 102, 102));
        jPanelExitR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabelExitR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelExitR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExitR.setText("x");
        jLabelExitR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitRLayout = new javax.swing.GroupLayout(jPanelExitR);
        jPanelExitR.setLayout(jPanelExitRLayout);
        jPanelExitRLayout.setHorizontalGroup(
            jPanelExitRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelExitR)
                .addContainerGap())
        );
        jPanelExitRLayout.setVerticalGroup(
            jPanelExitRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelExitR))
        );

        jLabelFullName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFullName.setText("Full Name: ");

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserName.setText("User Name: ");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password: ");

        jLabelConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmPassword.setText("Confirm Password: ");

        JLabelPriority.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLabelPriority.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPriority.setText("Priority:");

        jTextFieldFullName.setBackground(new java.awt.Color(0, 153, 153));
        jTextFieldFullName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldFullName.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldUserName.setBackground(new java.awt.Color(0, 153, 153));
        jTextFieldUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldUserName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setBackground(new java.awt.Color(0, 153, 153));
        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(255, 255, 255));

        jPasswordFieldPasswordConfirm.setBackground(new java.awt.Color(0, 153, 153));
        jPasswordFieldPasswordConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordFieldPasswordConfirm.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldPhone.setBackground(new java.awt.Color(0, 153, 153));
        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldPhone.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(0, 153, 153));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("REGISTER");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email: ");

        jTextFieldEmail.setBackground(new java.awt.Color(0, 153, 153));
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));

        jLabelWallpaperR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/RegisterVertical.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWallpaperR)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jPanelWaitingR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanelExitR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelFullName)
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelUserName)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelPassword)
                        .addGap(19, 19, 19)
                        .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConfirmPassword)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jPasswordFieldPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JLabelPriority)
                        .addGap(2, 2, 2)
                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelWallpaperR)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelWaitingR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelExitR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFullName)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUserName)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfirmPassword)
                    .addComponent(jPasswordFieldPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelPriority)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jButtonRegister))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelWaitingRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWaitingRMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelWaitingRMouseClicked

    private void jLabelExitRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitRMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitRMouseClicked

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        String fname = jTextFieldFullName.getText();
        String username = jTextFieldUserName.getText();
        String pass1 = String.valueOf(jPasswordFieldPassword.getPassword());
        String pass2 = String.valueOf( jPasswordFieldPasswordConfirm.getPassword());
        String email = jTextFieldEmail.getText();
        String priority = jTextFieldPhone.getText();
        
        if ( verifyFields() ){
            if( !checkUsername(username) ){
                PreparedStatement ps;
                ResultSet rs;
                
                String registerUserQuery = "INSERT INTO `login`(`usuario`, `contraseña`, `jerarquía`, `email`, `nombreCompleto`) VALUES (?,?,?,?,?)";
                
                try {
                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, username);
                    ps.setString(2, pass1);
                    ps.setString(3, priority);
                    ps.setString(4, email);
                    ps.setString(5, fname);
                    
                    if( ps.executeUpdate() != 0 ){
                        JOptionPane.showMessageDialog(null,"Your account has been created");
                        this.dispose();
                        new MenuUsuarios().setVisible(true);
                    }else{
                        JOptionPane.showConfirmDialog(null,"Error: Check your information");
                    }
                            
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed
    
    public boolean verifyFields(){
        String fname = jTextFieldFullName.getText();
        String uname = jTextFieldUserName.getText();
        String email = jTextFieldEmail.getText();
        String pass1 = String.valueOf(jPasswordFieldPassword.getPassword());
        String pass2 = String.valueOf( jPasswordFieldPasswordConfirm.getPassword());
        String priority = jTextFieldPhone.getText();
        
        if ( fname.trim().equals("")  || uname.trim().equals("")  || email.trim().equals("")  || pass1.trim().equals("") 
             ||  pass2.trim().equals("")  || priority.trim().equals("")   ){
                JOptionPane.showMessageDialog(null,"Uno o más campos se encuentran vacios");
                return false;
        }
        
        //Checking if we have the same passwords
        if( !pass1.equals(pass2) ){
            JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
            return false;
        } 
        //if everythig is okay
        else{
            return true;
        }
    }
    
    
    //Checking if username is alredy exits in database
    public boolean checkUsername( String username ){
        PreparedStatement st;
        ResultSet rs;
        boolean usernameExist = false;
        
        String query = "SELECT * FROM `login` WHERE `usuario` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1,username);
            rs = st.executeQuery();
            
            if( rs.next() ){
                usernameExist = true;
                JOptionPane.showMessageDialog(null,"This user is busy, choose another");
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usernameExist;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelPriority;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelExitR;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelWaitingR;
    private javax.swing.JLabel jLabelWallpaperR;
    private javax.swing.JPanel jPanelExitR;
    private javax.swing.JPanel jPanelWaitingR;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordConfirm;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
