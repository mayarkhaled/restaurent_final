package com.restaurant.User_Classes;

import com.restaurant.User_GUI.Main_page;
import com.restaurant.User_GUI.log_reg;
import com.restaurant.helper;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;

public class Customer extends User {
    private static int id;

    private static String address;
    
    private static byte [] photo;

    private static boolean discounted=false;
    
    private static List<order>cus_order = new ArrayList<>();

    public static Icon getphoto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public Customer(){
    }   
    public Customer( String address,String username, String phone, String password) {
        Customer.address=address;
        setUsername(username);
        setPhone(phone);
        setPassword(password);
        discounted=true;
    }
    public void Register(){
     helper.startConnection();
     String query="INSERT  INTO customer (c_name,c_mobile,c_address,c_password) VALUES(?,?,?,?);";
     PreparedStatement pdt = null;
        try {
             pdt = helper.getConn().prepareStatement(query);
            pdt.setString(1, getUsername());
            pdt.setString(2, getPhone());
            pdt.setString(3, address);
            pdt.setString(4, getPassword());
            pdt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
     discounted=true;
     helper.close();
      
    }
    public boolean isexist(){
        helper.startConnection();
        String query1="SELECT * FROM customer";
        
        try {
            helper.dBResult = helper.stmt.executeQuery(query1);
             while(helper.dBResult.next()){
                if(helper.dBResult.getString("c_name").equals(getUsername())) {
                    id=helper.dBResult.getInt("c_id");
                    return true;
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        helper.close();
        return false;   
    }
    public void logout() {
        log_reg form = new log_reg();
        form.setVisible(true);
        
        
    }

    public String login(String username, String password) {
         helper.startConnection();
        String query="SELECT * FROM customer";
        try {
            helper.dBResult = helper.stmt.executeQuery(query);
             while(helper.dBResult.next()){
                if(helper.dBResult.getString("c_name").equals(username)&&helper.dBResult.getString("c_password").equals(password)) {
                 
                        Customer.id=helper.dBResult.getInt("c_id");
                        Customer.super.setUsername(helper.dBResult.getString("c_name"));
                        Customer.super.setPassword(helper.dBResult.getString("c_password"));
                        Customer.super.setPhone(helper.dBResult.getString("c_name"));
                        Customer.address=helper.dBResult.getString("c_address");
                        Customer.photo=helper.dBResult.getBytes("cus_pic");
                        return "true";
                    
                }
                else if (helper.dBResult.getString("c_name").equals(username)&&!helper.dBResult.getString("c_password").equals(password)){
                
                    return "pass";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        helper.close();
        return "false";   
        
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Customer.address = address;
    }

    public static int getId() {
        return id;
    }

    public void update(String datacolname,String newdata){
        try {
            Customer _c =new Customer();
            helper.startConnection();
            String query = "UPDATE customer SET "+datacolname+"='"+newdata+"' WHERE c_id='"+Customer.getId()+"'";
            PreparedStatement pdt = helper.getConn().prepareStatement(query); 
            pdt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        helper.close();
    }
    public void updatephot(){
         try {
             Customer c=new Customer();
             helper.startConnection();
             String query="UPDATE customer SET cus_pic =?  WHERE c_id='"+Customer.getId()+"'";
             PreparedStatement pdt=helper.getConn().prepareStatement(query);
             pdt.setBytes(1, c.getPhoto());
             pdt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        helper.close();
    }
    public void viewMainMenu() {
    }

    public void makeOrder() {
    }

    public boolean haveDiscount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void cancelOrder() {
    }

    public Item ReturnWithComplain(Item i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int makeRate(int itemId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void String(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public byte[] getPhoto() {
        return photo;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
     
}
