package com.restaurant.Manger_Calsses;

import com.restaurant.helper;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DeliveryBoy {

    private int id;

    private String name;

    private String phone;
    
    private int hours;

    private String from;

    private String to;

    private int avilability;

    public DeliveryBoy( String n, String p,int hours,String f,String t, int a) {
        this.name=n;
        this.phone=p;
        this.hours=hours;
        this.from=f;
        this.to=t;
        this.avilability=a;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getAvilability() {
        return avilability;
    }

    public void setAvilability(int avilability) {
        this.avilability = avilability;
    }
    
    public void add_Deliveryboy(){
                    helper.startConnection();
            
           
           
        try {

               String insert_into_deliver_boy="insert into deliver_boy(d_name,d_hours,d_status,start_work,end_work,phone) values (?,?,?,?,?,?)";
               PreparedStatement st2=helper.getConn().prepareStatement(insert_into_deliver_boy);
            
               st2.setString(1, name);
               st2.setInt(2,hours);
               st2.setInt(3, avilability);
               st2.setString(4, from);
               st2.setString(5,  to);
               st2.setString(6, phone);
               st2.executeUpdate();
}
            
            
       
         catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            helper.close();
        }
    }

}
