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
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    
    String cid="",usn="",uid="";
    public User(String s) {
        initComponents();
        this.getContentPane().setBackground(new Color(0,204,204));
        usn=s;
        Home_Label1.setText(Home_Label1.getText()+" "+s+"!");
        Vaccine_Panel.setVisible(false);
        Centre_Panel.setVisible(false);
        Slot_Panel.setVisible(false);
        PreparedStatement pst; 
        try{
            Connection con=CovidManagement.connector();
            pst=con.prepareStatement("select id from user where user_name=?");
            pst.setString(1,usn );
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                uid=String.valueOf(rs.getInt("id"));
            }
        }catch(SQLException e  ){}
        availDate(1);
        availDate(2);
        
    }
    public void availDate(int skip){
        Date currentDate = new Date();
        long ONE_DAY_MILLI_SECONDS = skip*24*60*60*1000;
        long nextDay = currentDate.getTime()+ONE_DAY_MILLI_SECONDS;
        Date nextDate = new Date(nextDay);
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String nextDateStr = form.format(nextDate);
        Date_Combo.addItem(nextDateStr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home_Label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Vaccine_Panel = new javax.swing.JPanel();
        Pincode_Label = new javax.swing.JLabel();
        Pincode_Input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Type_Box = new javax.swing.JComboBox<>();
        Data_Enter = new javax.swing.JButton();
        Error_Label = new javax.swing.JLabel();
        Back_Btn2 = new javax.swing.JButton();
        Slot_Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Date_Combo = new javax.swing.JComboBox<>();
        Time_Combo = new javax.swing.JComboBox<>();
        ack_btn = new javax.swing.JButton();
        Centre_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Centre_Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        Home_Label1.setBackground(new java.awt.Color(0, 255, 255));
        Home_Label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home_Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home_Label1.setText("Welcome");
        Home_Label1.setToolTipText("");
        Home_Label1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Home_Label1.setAutoscrolls(true);
        Home_Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home_Label1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select Your Service:");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Vaccine Booking", "Bed Booking" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Vaccine_Panel.setBackground(new java.awt.Color(0, 204, 204));

        Pincode_Label.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Pincode_Label.setText("Enter Pincode");

        Pincode_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pincode_InputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Select Type:");

        Type_Box.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Covaxin", "Covishield" }));

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

        Error_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Back_Btn2.setBackground(new java.awt.Color(255, 255, 255));
        Back_Btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back_Btn2.setText("Back");
        Back_Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Btn2ActionPerformed(evt);
            }
        });

        Slot_Panel.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Slots Available:");

        Date_Combo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Date_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date" }));
        Date_Combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date_ComboMouseClicked(evt);
            }
        });
        Date_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_ComboActionPerformed(evt);
            }
        });

        Time_Combo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Time_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "10-12", "1-3", "3-5" }));
        Time_Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Time_ComboItemStateChanged(evt);
            }
        });
        Time_Combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Time_ComboMouseClicked(evt);
            }
        });
        Time_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time_ComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Slot_PanelLayout = new javax.swing.GroupLayout(Slot_Panel);
        Slot_Panel.setLayout(Slot_PanelLayout);
        Slot_PanelLayout.setHorizontalGroup(
            Slot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Slot_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Date_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Time_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Slot_PanelLayout.setVerticalGroup(
            Slot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Slot_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Slot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Slot_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Time_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        ack_btn.setBackground(new java.awt.Color(255, 255, 255));
        ack_btn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ack_btn.setText("Recent Booking");
        ack_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ack_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Vaccine_PanelLayout = new javax.swing.GroupLayout(Vaccine_Panel);
        Vaccine_Panel.setLayout(Vaccine_PanelLayout);
        Vaccine_PanelLayout.setHorizontalGroup(
            Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                        .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pincode_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(Pincode_Input))
                        .addGap(29, 29, 29)
                        .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                                .addComponent(Type_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                        .addComponent(Slot_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(Error_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ack_btn))
                    .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Data_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Vaccine_PanelLayout.setVerticalGroup(
            Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vaccine_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pincode_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pincode_Input)
                    .addComponent(Type_Box, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Data_Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Error_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Vaccine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ack_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Centre_Panel.setBackground(new java.awt.Color(0, 204, 204));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Centre_Table.setBackground(new java.awt.Color(204, 255, 255));
        Centre_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Centre_ID", "Name", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Centre_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Centre_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Centre_Table);

        javax.swing.GroupLayout Centre_PanelLayout = new javax.swing.GroupLayout(Centre_Panel);
        Centre_Panel.setLayout(Centre_PanelLayout);
        Centre_PanelLayout.setHorizontalGroup(
            Centre_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Centre_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Centre_PanelLayout.setVerticalGroup(
            Centre_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Centre_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Home_Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(Centre_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vaccine_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Centre_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Vaccine_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int selectedValue=jComboBox2.getSelectedIndex();
        if(selectedValue==1) 
        { 
            ack_btn.setVisible(true);
            Vaccine_Panel.setVisible(true);
        }
        else if(selectedValue==2)
        {
            dispose();
            Bed_Booking b=new Bed_Booking(usn);
            b.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void Pincode_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pincode_InputActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Pincode_InputActionPerformed

    private void Data_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_EnterActionPerformed
        // TODO add your handling code here:
        int selectedValue=Type_Box.getSelectedIndex();
        Connection con=CovidManagement.connector();
        DefaultTableModel tbl = (DefaultTableModel)Centre_Table.getModel();
        if(selectedValue==1)
        {
            try{
                String sql="Select * from vaccine_centre where pincode=? and type=?";
                Statement st=con.createStatement();
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,Pincode_Input.getText());
                ps.setString(2,"Covaxin");
                ResultSet rs=ps.executeQuery();
                String id = "", name = "", available = "";
                while(rs.next()){
                    id = String.valueOf(rs.getInt("centre_id"));
                    name = rs.getString("cname");
                    available = String.valueOf(rs.getInt("d_count"));
                }
                if(id!="")
                {
                   String tbData[] = {id,name,available};
                   tbl.setRowCount(0);
                   tbl.addRow(tbData);
                   Centre_Panel.setVisible(true);
                }
                else JOptionPane.showMessageDialog(null,"No records found!");
                
                
            }catch(Exception e){}
            
        }
        else if(selectedValue==2)
        {
            try{
                String sql="Select * from vaccine_centre where pincode=? and type=?";
                Statement st=con.createStatement();
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,Pincode_Input.getText());
                ps.setString(2,"Covishield");
                ResultSet rs=ps.executeQuery();
                String id = "", name = "", available = "";
                tbl.setRowCount(0);
                while(rs.next()){
                    id = String.valueOf(rs.getInt("centre_id"));
                    name = rs.getString("cname");
                    available = String.valueOf(rs.getInt("d_count"));
                    if(id!="")
                {
                   String tbData[] = {id,name,available};
                   
                   tbl.addRow(tbData);
                   Centre_Panel.setVisible(true);
                }
                else JOptionPane.showMessageDialog(null,"No records found!");
                }
                
                
            }catch(Exception e){}
            
        }   
    }//GEN-LAST:event_Data_EnterActionPerformed

    private void Data_EnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_EnterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Data_EnterMouseClicked

    private void Back_Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Btn2ActionPerformed
        // TODO add your handling code here:
        Vaccine_Panel.setVisible(false);
        Centre_Panel.setVisible(false);
        jComboBox2.setSelectedIndex(0);
        Slot_Panel.setVisible(false);
        Pincode_Input.setText("");
        Type_Box.setSelectedIndex(0);
        Date_Combo.setSelectedIndex(0);
        Time_Combo.setSelectedIndex(0);
    }//GEN-LAST:event_Back_Btn2ActionPerformed

    private void Centre_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Centre_TableMouseClicked
        // TODO add your handling code here:
        try{
            int row=Centre_Table.getSelectedRow();
            String Table_Click=(Centre_Table.getModel().getValueAt(row, 0).toString());
            cid=Table_Click;
            Slot_Panel.setVisible(true);
            Time_Combo.setVisible(false);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_Centre_TableMouseClicked

    private void Date_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_ComboActionPerformed
        // TODO add your handling code here:
        Time_Combo.setVisible(true);
    }//GEN-LAST:event_Date_ComboActionPerformed

    private void Date_ComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Date_ComboMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Date_ComboMouseClicked

    private void Time_ComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time_ComboMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Time_ComboMouseClicked

    private void Time_ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Time_ComboItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Time_ComboItemStateChanged

    private void Time_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time_ComboActionPerformed
        // TODO add your handling code here:
        if(Time_Combo.getSelectedIndex()!=0)
        {
        if(JOptionPane.showConfirmDialog(null, "Confirm Booking")==0)
        {
           PreparedStatement ps,pst; 
        try{
            Connection con=CovidManagement.connector();
            ResultSet rs;
            ps=con.prepareStatement("insert into vaccine values(?,?,?,?,?)");   
            ps.setString(1,uid);
            ps.setString(2,Type_Box.getSelectedItem().toString());
            ps.setString(3,Date_Combo.getSelectedItem().toString());
            ps.setString(4,Time_Combo.getSelectedItem().toString());
            ps.setString(5, cid);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Slot Booked");
            dispose();
            Slot_book sb=new Slot_book(uid,cid,usn,1);
            sb.setVisible(true);
            }catch(SQLException e){}
        }
        }
    }//GEN-LAST:event_Time_ComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure, you want to logout?")==0)
        {
            dispose();
            Home h = new Home();
            h.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ack_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ack_btnActionPerformed
        // TODO add your handling code here:
        PreparedStatement pst; 
        try{
            Connection con=CovidManagement.connector();
            ResultSet rs;
            pst=con.prepareStatement("select centre_id from vaccine where user_id=?");
            pst.setString(1,uid );
            rs=pst.executeQuery();
            while(rs.next())
            {
                cid=String.valueOf(rs.getInt("centre_id"));
            }
        }catch(SQLException e){}
        dispose();
        Slot_book sb=new Slot_book(uid,cid,usn,0);
        sb.setVisible(true);
    }//GEN-LAST:event_ack_btnActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn2;
    private javax.swing.JPanel Centre_Panel;
    private javax.swing.JTable Centre_Table;
    private javax.swing.JButton Data_Enter;
    private javax.swing.JComboBox<String> Date_Combo;
    private javax.swing.JLabel Error_Label;
    private javax.swing.JLabel Home_Label1;
    private javax.swing.JTextField Pincode_Input;
    private javax.swing.JLabel Pincode_Label;
    private javax.swing.JPanel Slot_Panel;
    private javax.swing.JComboBox<String> Time_Combo;
    private javax.swing.JComboBox<String> Type_Box;
    private javax.swing.JPanel Vaccine_Panel;
    private javax.swing.JButton ack_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}