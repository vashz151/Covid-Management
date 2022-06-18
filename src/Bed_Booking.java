
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Komal
 */
public class Bed_Booking extends javax.swing.JFrame {

    /**
     * Creates new form Bed_Booking
     */
    String usname="",reg="",bed="",type="";
    public Bed_Booking(String s) {
        initComponents();
        usname=s;
        Home_Label1.setText(Home_Label1.getText()+" "+s+"!");
        Type_Panel.setVisible(false);
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
        Das_Btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Home_Label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hospital_Table = new javax.swing.JTable();
        Bed_Panel = new javax.swing.JPanel();
        Pincode_Label1 = new javax.swing.JLabel();
        Pincode_Input1 = new javax.swing.JTextField();
        Error_Label = new javax.swing.JLabel();
        Data_Enter = new javax.swing.JButton();
        Type_Panel = new javax.swing.JPanel();
        Continue = new javax.swing.JButton();
        Bed_Type_cb = new javax.swing.JComboBox<>();
        Bed_Count = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        Das_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Das_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Das_Btn.setText("Dashboard");
        Das_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Das_BtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Home_Label1.setBackground(new java.awt.Color(0, 255, 255));
        Home_Label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Home_Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home_Label1.setText("  Signed in as  ");
        Home_Label1.setToolTipText("");
        Home_Label1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Home_Label1.setAutoscrolls(true);
        Home_Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home_Label1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Hospital_Table.setBackground(new java.awt.Color(204, 255, 255));
        Hospital_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Hospital_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg_no", "Name", "Pincode", "Available Beds"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Hospital_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hospital_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Hospital_Table);

        Bed_Panel.setBackground(new java.awt.Color(204, 255, 255));

        Pincode_Label1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Pincode_Label1.setText("Enter Pincode");

        Pincode_Input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pincode_Input1ActionPerformed(evt);
            }
        });

        Error_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Data_Enter.setBackground(new java.awt.Color(255, 255, 255));
        Data_Enter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Data_Enter.setText("Search");
        Data_Enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Data_EnterMouseClicked(evt);
            }
        });
        Data_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_EnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bed_PanelLayout = new javax.swing.GroupLayout(Bed_Panel);
        Bed_Panel.setLayout(Bed_PanelLayout);
        Bed_PanelLayout.setHorizontalGroup(
            Bed_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bed_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bed_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bed_PanelLayout.createSequentialGroup()
                        .addComponent(Pincode_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Pincode_Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Bed_PanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Data_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(416, 416, 416)
                        .addComponent(Error_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Bed_PanelLayout.setVerticalGroup(
            Bed_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bed_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bed_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pincode_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pincode_Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Bed_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bed_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Error_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(Bed_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Data_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Type_Panel.setBackground(new java.awt.Color(204, 255, 255));

        Continue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        Bed_Type_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bed_Type_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bed Type", "Normal", "Non-O2", "O2", "ICU", "COVID" }));
        Bed_Type_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bed_Type_cbActionPerformed(evt);
            }
        });

        Bed_Count.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Type_PanelLayout = new javax.swing.GroupLayout(Type_Panel);
        Type_Panel.setLayout(Type_PanelLayout);
        Type_PanelLayout.setHorizontalGroup(
            Type_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Type_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bed_Type_cb, 0, 161, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Bed_Count, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Type_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        Type_PanelLayout.setVerticalGroup(
            Type_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Type_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Type_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bed_Type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bed_Count, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Das_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Type_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bed_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Home_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Bed_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(Type_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Das_Btn)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Das_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Das_BtnActionPerformed
        // TODO add your handling code here:
        dispose();
        User u=new User(usname);
        u.setVisible(true);
    }//GEN-LAST:event_Das_BtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure, you want to logout?")==0)
        {
            dispose();
            Home h = new Home();
            h.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Pincode_Input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pincode_Input1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Pincode_Input1ActionPerformed

    private void Data_EnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_EnterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Data_EnterMouseClicked

    private void Data_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_EnterActionPerformed
        // TODO add your handling code here:
       String pincode = Pincode_Input1.getText();
        if(pincode != ""){
            Connection con = CovidManagement.connector();
            try {
                String sql = "SELECT * FROM hospital WHERE pincode=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, pincode);
                ResultSet rs = ps.executeQuery();
                String reg_no = "", name = "", available = "";
                DefaultTableModel tbl = (DefaultTableModel)Hospital_Table.getModel();
                tbl.setRowCount(0);
                while(rs.next()){
                    reg_no = String.valueOf(rs.getInt("reg_no"));
                    name = rs.getString("hname");
                    available = String.valueOf(rs.getInt("available_beds"));
                    String tbData[] = {reg_no,name,pincode,available};
                    tbl.addRow(tbData);
                } 
                if(reg_no==""){
                    JOptionPane.showMessageDialog(null, "No records found!");
                }
                
            }catch (Exception ex) {
                
            }
        }
        else{JOptionPane.showMessageDialog(null, "Enter a pincode!");}

    }//GEN-LAST:event_Data_EnterActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        // TODO add your handling code here:
        dispose();
        Patient p=new Patient(usname,bed,reg,type);
        p.setVisible(true);
    }//GEN-LAST:event_ContinueActionPerformed

    private void Hospital_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hospital_TableMouseClicked
        // TODO add your handling code here:
         try{
            int row=Hospital_Table.getSelectedRow();
            String Table_Click=(Hospital_Table.getModel().getValueAt(row, 0).toString());
            reg=Table_Click;
            Type_Panel.setVisible(true);
            Continue.setVisible(false);
            Bed_Type_cb.setSelectedIndex(0);
            Bed_Count.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_Hospital_TableMouseClicked

    private void Bed_Type_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bed_Type_cbActionPerformed
        // TODO add your handling code here:
        if(Bed_Type_cb.getSelectedIndex()!=0){
            Connection con = CovidManagement.connector();
            try {
                String sql = "SELECT * FROM beds WHERE reg_no=? and type=? and status='A'";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, reg);
                ps.setString(2, Bed_Type_cb.getSelectedItem().toString());
                ResultSet rs = ps.executeQuery();
                int count = 0;
                while(rs.next()){
                    count++;
                    bed=String.valueOf(rs.getString("bed_no"));
                } 
                if(count==0){
                    JOptionPane.showMessageDialog(null, "No beds of selected type available!");
                    Continue.setVisible(false);
                    Bed_Count.setText("0");
                }
                else{
                    Continue.setVisible(true); 
                    Bed_Count.setText(String.valueOf(count));
                    type=Bed_Type_cb.getSelectedItem().toString();
                }
                
            } catch (Exception ex) {
            
            }
        }
    }//GEN-LAST:event_Bed_Type_cbActionPerformed

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
            java.util.logging.Logger.getLogger(Bed_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bed_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bed_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bed_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bed_Count;
    private javax.swing.JPanel Bed_Panel;
    private javax.swing.JComboBox<String> Bed_Type_cb;
    private javax.swing.JButton Continue;
    private javax.swing.JButton Das_Btn;
    private javax.swing.JButton Data_Enter;
    private javax.swing.JLabel Error_Label;
    private javax.swing.JLabel Home_Label1;
    private javax.swing.JTable Hospital_Table;
    private javax.swing.JTextField Pincode_Input1;
    private javax.swing.JLabel Pincode_Label1;
    private javax.swing.JPanel Type_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
