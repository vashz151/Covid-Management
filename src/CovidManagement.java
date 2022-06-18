/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Komal
 */
import java.sql.*;
import javax.swing.*;
public class CovidManagement {
    public static void main(String[] args) {
        connector();
        Home hom=new Home();
        hom.setVisible(true);
    }
    static Connection connector()
    {
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=vashz151");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
