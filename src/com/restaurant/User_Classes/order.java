package com.restaurant.User_Classes;

import com.restaurant.helper;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class order {
    private int id;
    private Bill bill;
   
    private String time;

    private int RecivedStatus;

    private String ComplainMessage;

    public order(String ComplainMessage,Bill bill) {
       this.bill=bill;
       Calendar cal = Calendar.getInstance(); 
       cal.getTime(); 
       SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
       this.time=(sdf.format(cal.getTime()));
       this.RecivedStatus=1;
       this.ComplainMessage=ComplainMessage;
    }

    public Bill getBill() {
        return bill;
}

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRecivedStatus() {
        return RecivedStatus;
    }

    public void setRecivedStatus(int RecivedStatus) {
        this.RecivedStatus = RecivedStatus;
    }

    public String getComplainMessage() {
        return ComplainMessage;
    }

    public void setComplainMessage(String ComplainMessage) {
        this.ComplainMessage = ComplainMessage;
    }
    public void order_id(){
           helper.startConnection();
        try{
          
           String query = "SELECT o_id FROM `Order` WHERE o_time='"+time+"'AND customer_id='"+2+"'"; 
           helper.dBResult = helper.stmt.executeQuery(query);
            while(helper.dBResult.next())
                id=(helper.dBResult.getInt("o_id"));
          
        }
           catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            helper.close();
        }
       
    }
    
            public void add_order(){
                
                
                    helper.startConnection();
            
           
           
        try {

               String insert_into_Order="INSERT INTO `Order` (o_time,o_recived_statues,o_complain,customer_id) VALUES (?,?,?,?)";
               
               PreparedStatement st2=helper.getConn().prepareStatement(insert_into_Order);
               st2.setString(1, time);
               st2.setInt(2,RecivedStatus);
               st2.setString(3, ComplainMessage);
               st2.setInt(4,2);
               st2.executeUpdate();
               this.order_id();
               System.out.print(id);
               
               String insert_into_Bill="insert into bill(total_price_before,total_price_after,order_id,delivery_boy_id) values(?,?,?,?)";
               st2=helper.getConn().prepareStatement(insert_into_Bill);
               st2.setDouble(1, bill. getTotalCashe());
               st2.setDouble(2, bill.getTotalCasheAfterPormortion());
               
               st2.setInt(3, id);
               st2.setInt(4, bill.getDelivery_id());
               st2.executeUpdate();
               
               
               for(int i=0;i<bill.getItem().size();i++)
               {
                 bill.getItem().get(i).get_id_from_sql();
               String insert_into_inv_items_order="insert into Inv_items_Order(inv_items_id,Order_id,quantity_of_item_in_bill) values(?,?,?)";
               st2=helper.getConn().prepareStatement(insert_into_inv_items_order);
               st2.setInt(1, bill.getItem().get(i).getItem_id());
               
               st2.setInt(2, id);
               st2.setInt(3, bill.getItem().get(i).getIntquantity_in_bill());
              
               st2.executeUpdate();
        }
}
            
            
       
         catch (SQLException ex) {
             
            System.out.println(ex.getMessage());
        }
        finally{
            helper.close();
        }
    }
    
}
