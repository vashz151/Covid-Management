/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Komal
 */
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    boolean signup=false;
    public UserLogin() {
        initComponents();
        Sign_In2.setBackground(new Color(202,255,255));
        jLabel1.setVisible(true);
        
        
    }
    public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
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
        Home_Label1 = new javax.swing.JLabel();
        Sign_In_Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Sign_In2 = new javax.swing.JPanel();
        Username_Labell = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Username_Input = new javax.swing.JTextField();
        Sign_Up_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Enter_Btn = new javax.swing.JButton();
        Password_Input = new javax.swing.JPasswordField();
        Back_Btn = new javax.swing.JButton();
        Home_Label = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Home_Label1.setBackground(new java.awt.Color(0, 255, 255));
        Home_Label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home_Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home_Label1.setText(" User Login");
        Home_Label1.setToolTipText("");
        Home_Label1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Home_Label1.setAutoscrolls(true);
        Home_Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home_Label1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Sign_In_Panel.setForeground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        Sign_In2.setBackground(new java.awt.Color(202, 255, 255));
        Sign_In2.setForeground(new java.awt.Color(255, 255, 255));

        Username_Labell.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Username_Labell.setText("Username");

        Password_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Password_Label.setText("Password");

        Username_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_InputActionPerformed(evt);
            }
        });

        Sign_Up_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Sign_Up_Btn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Sign_Up_Btn.setText("SignUp");
        Sign_Up_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_Up_BtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Not a user..?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter Your:");

        Enter_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Enter_Btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Enter_Btn.setText("Enter");
        Enter_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_BtnActionPerformed(evt);
            }
        });

        Password_Input.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Sign_In2Layout = new javax.swing.GroupLayout(Sign_In2);
        Sign_In2.setLayout(Sign_In2Layout);
        Sign_In2Layout.setHorizontalGroup(
            Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_In2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(Enter_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Sign_In2Layout.createSequentialGroup()
                .addGroup(Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sign_In2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(Username_Labell, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(Username_Input)))
                    .addGroup(Sign_In2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sign_Up_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        Sign_In2Layout.setVerticalGroup(
            Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_In2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_Labell, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Enter_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(Sign_In2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sign_Up_Btn)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Back_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Back_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back_Btn.setText("Back");
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });

        Home_Label.setBackground(new java.awt.Color(0, 255, 255));
        Home_Label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Home_Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home_Label.setText("  User Login");
        Home_Label.setToolTipText("");
        Home_Label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Home_Label.setAutoscrolls(true);
        Home_Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home_Label.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Sign_In2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sign_In2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout Sign_In_PanelLayout = new javax.swing.GroupLayout(Sign_In_Panel);
        Sign_In_Panel.setLayout(Sign_In_PanelLayout);
        Sign_In_PanelLayout.setHorizontalGroup(
            Sign_In_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Sign_In_PanelLayout.setVerticalGroup(
            Sign_In_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sign_In_PanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sign_In_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sign_In_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_InputActionPerformed

    private void Sign_Up_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_Up_BtnActionPerformed
        // TODO add your handling code here:
        Sign_Up_Btn.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(true);
        signup=true;
        
        
    }//GEN-LAST:event_Sign_Up_BtnActionPerformed

    private void Enter_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_BtnActionPerformed
        // TODO add your handling code here:
        if(signup==false)
        {PreparedStatement ps;
        ResultSet rs;
        String sql="select * from user where user_name=? and password=?";
        try{
            Connection con=CovidManagement.connector();
            ps=con.prepareStatement("select * from user where user_name=? and password=?");   
            ps.setString(1,Username_Input.getText());
            ps.setString(2,Password_Input.getText());
            rs=ps.executeQuery();
            if(rs.next())
            {
                int k1 = new Random().nextInt(20);
                int k2 = new Random().nextInt(20);
                String ans = JOptionPane.showInputDialog(null, "Enter "+k1+"+"+k2+":");
                 if(ans != null){
                int a = Integer.parseInt(ans);
                if(a == (k1+k2)){
                JOptionPane.showMessageDialog(null, "Access Granted!");
                String t = Username_Input.getText();
                dispose();
                User uss = new User(t);
                uss.setVisible(true);
               }else{JOptionPane.showMessageDialog(null, "Access Denied!");}
            }
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Incorrect Credentials!Please try again!");
                Username_Input.setText("");
                Password_Input.setText("");
            }
            
        }catch(SQLException e){}
        }
        else{
        PreparedStatement ps; 
        try{
            Connection con=CovidManagement.connector();
            ps=con.prepareStatement("insert into user(user_name,password) values(?,?)");   
            ps.setString(1,Username_Input.getText());
            ps.setString(2,Password_Input.getText());            
            if(ps.execute())
            {
                JOptionPane.showMessageDialog(null,"Crediantials invalid!");
            }
            else JOptionPane.showMessageDialog(null,"Crediantials entered successfully!");
            }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"User name already exists!");
            }
            Sign_Up_Btn.setVisible(true);
            jLabel1.setVisible(false);
            jLabel2.setVisible(true);
            signup=false;
            Username_Input.setText("");
            Password_Input.setText("");
        }
    }//GEN-LAST:event_Enter_BtnActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        // TODO add your handling code here:
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserLogin u =new UserLogin();
                
                u.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JButton Enter_Btn;
    private javax.swing.JLabel Home_Label;
    private javax.swing.JLabel Home_Label1;
    private javax.swing.JPasswordField Password_Input;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JPanel Sign_In2;
    private javax.swing.JPanel Sign_In_Panel;
    private javax.swing.JButton Sign_Up_Btn;
    private javax.swing.JTextField Username_Input;
    private javax.swing.JLabel Username_Labell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
