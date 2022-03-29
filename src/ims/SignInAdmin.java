/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maaz
 */
public class SignInAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SignInAdmin
     */
    public SignInAdmin() {
        initComponents();
        
    }

    private String name ;
    public Connection getCon(){
    
    String url,username,password;    
    
    url = "jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false";
    username = "root";
    password = "abc1994";
    
    
        
    Connection con = null;    
    
    try{
      con =  DriverManager.getConnection(url, username, password);
      //JOptionPane.showMessageDialog(null, "Successful");
    }
    catch(Exception ex){
    
        JOptionPane.showMessageDialog(null,ex.getMessage());
        
    }
            
    return(con);
    }
    
    
    public boolean check(){
    
    boolean flag ;
    
    if(txt_firstName.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Please Enter Your First Name");
        flag = false;
    }
    else if(Password.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Please Enter Password");
        flag = false;
    }
    else
    {   
        
        flag = true;
    }
    return(flag);
    
    }
    
     public void logIn(){
    
    String name , password , sql;
    sql = "select * from administrator where first_name = ? and password = ?";
    name = txt_firstName.getText();
    password = Password.getText();
    Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
    
    
    if(check() == true)
    {
        try{
            con = getCon();
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "Welcome Admin");
                DashboardAdmin ad = new DashboardAdmin();
                ad.setVisible(true);
                ad.setName(name);
                this.setVisible(false);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Access Denied Please Re-Type First Name And Password");
            }
            
            con.close();
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
    }
      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btn_signIp = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        txt_firstName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        btn_back = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrator's Login Page");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Password:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("View Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btn_signIp.setBackground(new java.awt.Color(0, 255, 0));
        btn_signIp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_signIp.setForeground(new java.awt.Color(255, 255, 255));
        btn_signIp.setText("Sign In");
        btn_signIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signIpActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(0, 153, 153));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        txt_firstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_firstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_firstNameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_firstNameMousePressed(evt);
            }
        });
        txt_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstNameActionPerformed(evt);
            }
        });
        txt_firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstNameKeyTyped(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(255, 0, 0));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1)
                                .addComponent(btn_signIp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel15))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_signIp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_close)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_firstNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstNameMouseClicked

    private void txt_firstNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_firstNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstNameMousePressed

    private void txt_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstNameActionPerformed

    private void txt_firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstNameKeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if(jCheckBox1.isSelected())
        {
            Password.setEchoChar((char)0);
        }
        else
        {
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btn_signIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signIpActionPerformed

        
        logIn();
          
        
        
        /*
        String userName = txt_userName.getText();
        
        if( checkValues() && logIn() ){
        
        Purchase purchase  = new Purchase();
        purchase.setVisible(true);
        purchase.txt_operator.setText(userName);
        this.setVisible(false);
        }*/
    }//GEN-LAST:event_btn_signIpActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed

        txt_firstName.setText(null);
        Password.setText(null);
        jCheckBox1.setSelected(false);

    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        Dashboard dshbrd = new Dashboard();
        dshbrd.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(SignInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_signIp;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_firstName;
    // End of variables declaration//GEN-END:variables
}
