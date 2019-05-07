package com.restaurant.User_GUI;

import com.restaurant.Manger_Calsses.Pormotion;
import com.restaurant.User_Classes.Item;
import com.restaurant.helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class mainMenu {

    private String restaurantName;
    //private List<String> category = new ArrayList<>();
    List<item_panal> list;
    protected Map<String,List>category;
    boolean check = false ;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    
    public mainMenu(String r) {
        restaurantName=r;
        this.category = new HashMap<>();
       
    }
    public mainMenu(String r , boolean check )
    {
         this.restaurantName=r;
         this.category = new HashMap<>();
         this.check = true;
         
    }

    public List<item_panal> getList() {
        return list;
    }

    public void setList(List<item_panal> list) {
        this.list = list;
    }
    public ImageIcon converThisByteArrayToImageIcon(byte[]b)
    {
            return new ImageIcon(b);
    }

    
    public void View_menu()
    {
           Set<String>carry_category = new HashSet();
               helper.startConnection();
                ResultSet Pr_Result = null;
                 Statement stmt = null;
         try {
          
            String query = "SELECT * FROM inv_items";
             
           helper.dBResult = helper.stmt.executeQuery(query);
           while(helper.dBResult.next())
            { 
                   Item item = new Item();
                 item_panal item_p = new item_panal();
                item.setName(helper.dBResult.getString("item_name")) ;
                 String rank = helper.dBResult.getString("item_rank");
                if(rank !=null){
                 String[] rank_arr = rank.split(","); 
                 System.out.println(rank_arr.length);
                
                 List<Float> list = new ArrayList<Float>();
                 for(int i=0;i<rank_arr.length;i++)
                 {
                     System.out.println(rank_arr[i]);
                     list.add(Float.parseFloat(rank_arr[i]));
                 }
                 Collections.sort(list);
                 int av = (list.size()-1)/2;
                 for(int j=0;j<list.size();j++)
                 {
                     if(j==av)
                         item.setRank(list.get(j));
                 }
                }
                 
               // item.setRank( helper.dBResult.getInt("item_rank"));
                item.setPrice( helper.dBResult.getDouble("item_price"));
                String price_string = Double.toString(item.getPrice());
                item.setCategoryname(helper.dBResult.getString("item_cat"));
                item.setPhoto(helper.dBResult.getBytes("item_photo")) ;
                int pormotion = helper.dBResult.getInt("pormotion_id");
                int quantity = helper.dBResult.getInt("item_available");
                if(quantity == 0)
                {
                    System.out.println("zero avilable ! ");
                    continue;
                }
                if( pormotion == 0 &&check)
                {
                    continue;
                }
               else if(pormotion == 0 && !check)
                {
                
                    item_p.getjLabel10().setVisible(false);
                   // item_p.getjLabel8().setVisible(false);
                }
                else
                {
                    stmt = helper.conn.createStatement();
                    Pormotion item_pormotion = new Pormotion();
                    String p_query ="select p_discount_precentage,p_start_time,p_end_time"
                            + " from promotion where p_id = "+pormotion;
                        Pr_Result = stmt.executeQuery(p_query);
                     int discount = 0;
                     String st_date = "";
                      String ed_date ="";
                     if(Pr_Result.next()){
                        discount = Pr_Result.getInt(1);
                         st_date = Pr_Result.getString(2);
                         ed_date = Pr_Result.getString(3);
                         }
                     item_pormotion.setId(pormotion);
                     item_pormotion.setDiscount(discount);
                     item_pormotion.setRelasedate(st_date);
                     item_pormotion.setExpiredate(ed_date);
                     item.setPormotion(item_pormotion);
                     //DAY
                      SimpleDateFormat formatter = new SimpleDateFormat("dd");  
                        Date date = new Date();  
                       int current_day = Integer.parseInt(formatter.format(date)); 
                        SimpleDateFormat formatter2 = new SimpleDateFormat("MM");  
                        Date date2 = new Date();  
                       int current_month = Integer.parseInt(formatter2.format(date2)); 
                       String e_d = ""+ed_date.charAt(0)+ed_date.charAt(1);
                       String e_m = ""+ed_date.charAt(3)+ed_date.charAt(4);
                       int ed_day = Integer.parseInt(e_d);
                       int ed_month = Integer.parseInt(e_m);
                       if(( current_month >ed_month)||(current_day>=ed_day && current_month ==ed_month))
                       {
                           item_p.getjLabel10().setVisible(false);
                           // item_p.getjLabel8().setVisible(false);
                           if(check)
                           {
                               continue;
                           }
                       }
                       else
                       {
                           item_p.getjLabel10().setText(String.valueOf(discount)+"% Off");
                          // item_p.getjLabel8().setText("Expires at "+ed_date);
                       }
                }
               
                  item_p.setjLabel1((converThisByteArrayToImageIcon(item.getPhoto())));
                item_p.setjLabel3(item.getName());
                item_p.setjLabel5(price_string);
                item_p.setjLabel7(String.valueOf(item.getRank()));
                //System.out.println(item.categoryname);
                if(carry_category.contains(item.categoryname))
                { 
                   category.get(item.categoryname).add(item_p); 
                }
                else if(!carry_category.contains(item.categoryname)||carry_category.isEmpty())
                { 
                 carry_category.add(item.categoryname);
                 category.put(item.categoryname, new ArrayList()); 
                  category.get(item.categoryname).add(item_p);
                }
                
            }
            
           
         }
         catch(NumberFormatException | SQLException ex)
         {
             System.out.println(ex.getMessage());
         }
         finally{
         helper.close();
         Pr_Result = null;
         stmt = null;
         }
    }
    
    
}
