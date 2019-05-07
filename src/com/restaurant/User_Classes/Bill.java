package com.restaurant.User_Classes;

import com.restaurant.helper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Bill {
     
    private static double TotalCasheAfterPormortion=0;

    private static double TotalCashe=0;

    private static int Delivery_id;
    
    private static List<Item> item =new ArrayList<>();
    
      private static boolean  check;

    public Bill(){
       // this.item=item;
        //this.DeliveryCharges=0;
        //this.TotalCashe=0;
        //this.TotalCasheAfterPormortion=0;
        this.check=true;
    }
           public static void setItem(List<Item> item) {
        Bill.item = item;
    }
       

    public static List<Item> getItem() {
        return item;
    }

    public static double getTotalCasheAfterPormortion() {
        return TotalCasheAfterPormortion;
    }

    public static void setTotalCasheAfterPormortion(double TotalCasheAfterPormortion) {
        Bill.TotalCasheAfterPormortion = TotalCasheAfterPormortion;
    }

    public static double getTotalCashe() {
        return TotalCashe;
    }

    public static void setTotalCashe(double TotalCashe) {
        Bill.TotalCashe = TotalCashe;
    }

    public static int getDelivery_id() {
        return Delivery_id;
    }

    public static void setDelivery_id(int Delivery_id) {
        Bill.Delivery_id = Delivery_id;
    }

    public static boolean isCheck() {
        return check;
    }

    public static void setCheck(boolean check) {
        Bill.check = check;
    }
    
    public void Total_Cashe()
    {
        double discount=0;
        for(int i=0;i<item.size();i++)
        {
            discount=((item.get(i).getPormotion().getDiscount()/item.get(i).getPrice())*100)*item.get(i).getIntquantity_in_bill();
            TotalCasheAfterPormortion+=(item.get(i).getPrice()*item.get(i).getIntquantity_in_bill())-discount;
            TotalCashe+=item.get(i).getPrice()*item.get(i).getIntquantity_in_bill();
        }
    }
    public void MakeDiscount() {
        if(TotalCasheAfterPormortion>1000)
        {
           TotalCasheAfterPormortion-=(20/TotalCasheAfterPormortion)*100; 
        }
        if(check)
        {
            TotalCasheAfterPormortion-=(30/TotalCasheAfterPormortion)*100;
        }
             
    }
        public void set_in_list(Item i)
    {
        item.add(i);
    }

   
        
        
        public void delete_from_list(String name){
        for(int i=0;i<item.size();i++){
            if(item.get(i).getName()==name){
                if(item.get(i).getIntquantity_in_bill()>1){
                  int j=item.get(i).getIntquantity_in_bill()-1;
               item.get(i).setIntquantity_in_bill(j);
}
                else
                item.remove(i);
            }
        }
    }
        
        
            public boolean found(String name)
    {
        boolean check=true;
               for(int i=0;i<item.size();i++){
            if(item.get(i).getName()==name){
                check=false;
            int j=item.get(i).getIntquantity_in_bill()+1;
               item.get(i).setIntquantity_in_bill(j);
            }
        }
               return check;
    }
            
            
          public void clear()
          {
             item.clear();
             
          }
    
          
          
   public static void dlivery_boy(){
               helper.startConnection();
            try{
                
                String query="SELECT d_id FROM deliver_boy WHERE d_status=1 ORDER BY RAND() LIMIT 1";
                helper.dBResult = helper.stmt.executeQuery(query);
               
                while(helper.dBResult.next())
                    Bill.setDelivery_id(helper.dBResult.getInt("d_id"));
                 
               }
              catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            helper.close();
        }
   }


}
