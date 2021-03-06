
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Komal
 */
public class Admin_Duty extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Duty
     */
    int ad;
    String log_id="";
    String selected_bed="";
    public Admin_Duty(int var,String id) {
        initComponents();
        ad=var;
        log_id=id;
        Date currentDate = new Date();
        long date = currentDate.getTime();
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date_Label.setText(form.format(date));
        Duty_Panel.setVisible(true);
        if(ad==1) dis_hos();
        else if(ad==2) dis_vac();
        
    }
    public void dis_hos()
    {
         try{
            Connection con = CovidManagement.connector();
            PreparedStatement  pst=con.prepareStatement("select hname from hospital where reg_no=?");
            pst.setString(1,log_id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                Name_Label.setText(" "+String.valueOf(rs.getString("hname")));
            }
         }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
       
            Connection con = CovidManagement.connector();
            try {
                String sql = "SELECT * FROM beds WHERE status='NA' and reg_no=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, log_id);
                ResultSet rs = ps.executeQuery();
                String bed_no = "", type = "";
                DefaultTableModel tbl = (DefaultTableModel)Avail_Table.getModel();
                tbl.setRowCount(0);
                while(rs.next()){
                    bed_no = String.valueOf(rs.getInt("bed_no"));
                    type = rs.getString("type");
                    String tbData[] = {bed_no, type};
                    tbl.addRow(tbData);
                }
                selected_bed=bed_no;
                Avail_Table.setVisible(true);
                if(bed_no==""){
                    JOptionPane.showMessageDialog(null, "All bed are avaialable!"); 
                    Update_Btn.setVisible(false);
                }             
            } catch (SQLException ex) {
            } 
    }
    public void dis_vac()
    {
        try{
            Connection con = CovidManagement.connector();
            PreparedStatement pst=con.prepareStatement("select cname from vaccine_centre where centre_id=?");
            pst.setString(1,log_id);
            ResultSet rs=pst.executeQuery();
            String doses = "";
            while(rs.next())
            {
                doses = JOptionPane.showInputDialog(null, String.valueOf(rs.getString("cname"))+"\n"+"Updated vaccine doses: ");
            }
            if(doses != null){
            pst=con.prepareStatement("update vaccine_centre set d_count =? where centre_id=?");
            pst.setString(1,doses);
            pst.setString(2,log_id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Doses updated as "+doses+" successfully!");
            }
            dispose();
            Home h = new Home();
            h.setVisible(true);
         }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Duty_Panel = new javax.swing.JPanel();
        Date_Label = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Avail_Table = new javax.swing.JTable();
        BedUp_Label = new javax.swing.JLabel();
        Update_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Duty_Panel.setBackground(new java.awt.Color(204, 255, 204));
        Duty_Panel.setPreferredSize(new java.awt.Dimension(585, 302));

        Date_Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Name_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Avail_Table.setBackground(new java.awt.Color(204, 255, 255));
        Avail_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bed_no", "Bed Type"
            }
        ));
        Avail_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Avail_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Avail_Table);

        BedUp_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Update_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Update_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Update_Btn.setText("Update");
        Update_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Duty_PanelLayout = new javax.swing.GroupLayout(Duty_Panel);
        Duty_Panel.setLayout(Duty_PanelLayout);
        Duty_PanelLayout.setHorizontalGroup(
            Duty_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Duty_PanelLayout.createSequentialGroup()
                .addComponent(Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Duty_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Duty_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Duty_PanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Duty_PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(Duty_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BedUp_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Duty_PanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Update_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
        );
        Duty_PanelLayout.setVerticalGroup(
            Duty_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Duty_PanelLayout.createSequentialGroup()
                .addGroup(Duty_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Duty_PanelLayout.createSequentialGroup()
                        .addGroup(Duty_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(Date_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Duty_PanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BedUp_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Duty_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Duty_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure, you want to logout?")==0)
        {
            dispose();
            Home h = new Home();
            h.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Avail_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Avail_TableMouseClicked
        // TODO add your handling code here:
        try{
            int row=Avail_Table.getSelectedRow();
            selected_bed=(Avail_Table.getModel().getValueAt(row,0).toString());
             BedUp_Label.setText("Update status of bed:" +selected_bed);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Avail_TableMouseClicked

    private void Update_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_BtnActionPerformed
        // TODO add your handling code here:
        Connection con = CovidManagement.connector();
        String sql = "update beds set user='', status='A' where reg_no=? and bed_no=?;";
        PreparedStatement ps = null;
    try{
        ps = con.prepareStatement(sql);
        ps.setString(1, log_id);
        ps.setString(2, selected_bed);
        ps.executeUpdate();
    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
   
    JOptionPane.showMessageDialog(null, "Status of bed."+selected_bed+" updated as available successfully!");
    sql="Update hospital set available_beds=available_beds+1 where reg_no=?";
    try{
        ps = con.prepareStatement(sql);
        ps.setString(1, log_id);
        ps.executeUpdate();
    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    dis_hos();
    }//GEN-LAST:event_Update_BtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Avail_Table;
    private javax.swing.JLabel BedUp_Label;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JPanel Duty_Panel;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JButton Update_Btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
