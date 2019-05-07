package com.restaurant.Manger_Calsses;

import com.restaurant.User_Classes.User;
import com.restaurant.User_Classes.Item;
import com.restaurant.Manger_Calsses.Pormotion;
import com.restaurant.Manger_Calsses.InventoryItem;
import com.restaurant.User_Classes.Customer;
import com.restaurant.User_GUI.item_panal;
import com.restaurant.helper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

import javax.swing.JOptionPane;


public class Manager extends User {

    //public ArrayList<InventoryItem> New_items=new ArrayList<InventoryItem>();
    private String username="mahmoudjoe" ;
    private String password="5m" ;
    private String name ="mahmoud" ;
    private String phone="01244744723" ;
    public Manager() {
    }

    public String login(String username,String password)
    {
       String stat="true";
        if(!(this.username.equals(username))&&this.password.equals(password))
            stat="user";
        else if((this.username.equals(username))&&!(this.password.equals(password)))
            stat="pass";
        else if(!(this.username.equals(username))&&!(this.password.equals(password)))
            stat="pass+user";
        else if((username.equals(""))||password.equals(""))
            stat="empty";
    return stat;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    
    


public void addInventoryItems(String state,InventoryItem it) 
    {

            helper.startConnection();
            
            System.out.println("connect succes");
           
        try {
            if(state.equals("withpormotion"))
            {
               String insert_into_pormotion="insert into promotion(p_id,p_discount_precentage,p_start_time,p_end_time) values (?,?,?,?)";
               PreparedStatement st2=helper.getConn().prepareStatement(insert_into_pormotion);
            
               st2.setInt(1, it.getPormotion().getId());
               st2.setInt(2, it.getPormotion().getDiscount());
               st2.setString(3, it.getPormotion().getRelasedate());
               st2.setString(4, it.getPormotion().getExpiredate());
               st2.executeUpdate();
               
            String insert_into_inv_item="insert into inv_items(item_id,item_name,item_rank,item_price,pormotion_id,item_sold,item_available,item_cat,item_photo) values (?,?,?,?,?,?,?,?,?)"; 
            PreparedStatement st=helper.getConn().prepareStatement(insert_into_inv_item); 
            st.setInt(1, Integer.parseInt(it.getItemcode()));
            st.setString(2, it.getName());
            st.setFloat(3, it.getRank());
            st.setDouble(4, it.getPrice());
            
            st.setInt(5, it.getPormotion().getId());
            st.setInt(6, it.getSold());
            st.setInt(7, it.getAvilable());
            st.setString(8, it.categoryname);
            st.setBytes(9, it.getPhoto());
           
            st.executeUpdate();
            }
            
            
            else if(state.equals("withoutpormotion"))
            {     
            String insert_into_inv_item="insert into inv_items(item_id,item_name,item_rank,item_price,item_sold,item_available,item_cat,item_photo) values (?,?,?,?,?,?,?,?)"; 
            PreparedStatement st=helper.getConn().prepareStatement(insert_into_inv_item); 
            st.setInt(1, Integer.parseInt(it.getItemcode()));
            st.setString(2, it.getName());
            st.setFloat(3, it.getRank());
            st.setDouble(4, it.getPrice());
            //st.setInt(5, 0);
            st.setInt(5, it.getSold());
            st.setInt(6, it.getAvilable());
            st.setString(7, it.categoryname);
            st.setBytes(8, it.getPhoto());
           
            st.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            helper.close();
        }
        
    }
    public void deleteInventoryItems(String r) throws Exception
    {
        helper.startConnection();
        String removed=r;
        
        String remove = "DELETE FROM `inv_items` WHERE item_name = "+removed;
        PreparedStatement st = helper.getConn().prepareStatement(remove);
        st.executeUpdate();
       
    }
    public ImageIcon converThisByteArrayToImageIcon(byte[]b)
    {
            return new ImageIcon(b);
    }

    //mayar
    public void updateInventoryItem(String n,String q)
    {
                try{
            String name = n;
            String quantity_st = q;
            int res = -1;
            int quantity = Integer.parseInt(quantity_st);
        helper.startConnection();
        /*update inv_items set item_available where item_name =text */
        String select_q = "Select item_available from inv_items where item_name = "+'"'+name+'"';
        helper.dBResult = helper.stmt.executeQuery(select_q);
        if(helper.dBResult.next()){
       res = helper.dBResult.getInt(1);
        res+=quantity;
        }
        System.out.println(res);
        if(res==-1)
        {
           JOptionPane optionPane = new JOptionPane("add correct name ", JOptionPane.ERROR_MESSAGE);    
           JDialog dialog = optionPane.createDialog("Failure");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            return;
        }
        String query = "update inv_items set item_available = "+res+" where item_name = "+'"'+name+'"';
            int executeUpdate = helper.stmt.executeUpdate(query);
        System.out.println("DONE");
        }
        catch(SQLException ex)
        {
            System.out.println("executing error "+ex.getMessage());
        }
        catch(NullPointerException ex)
        {
            System.out.println("Enter all info "+ex.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            helper.close();
        }
    }

    
    
   public Map<String,List>category;
public void viewinventoryitems()
{
    
    this.category = new HashMap<>();
       Set<String>carry_category = new HashSet();
               helper.startConnection();
                ResultSet Pr_Result = null;
                 Statement stmt = null;
         try {
          
            String query = "SELECT * FROM inv_items";
             
           helper.dBResult = helper.stmt.executeQuery(query);
           while(helper.dBResult.next())
            { 
                   InventoryItem item = new InventoryItem();
                 item_panal item_p = new item_panal();
      /*mahmoud*/           
                 item_p.geta_lable().setVisible(true);
                 item_p.gets_lable().setVisible(true);
                 item_p.getavailablelable().setVisible(true);
                 item_p.getsoldlable().setVisible(true);
                 item_p.getorderB().setVisible(false);
      /*mahmoud*/           
                 
                item.setName(helper.dBResult.getString("item_name")) ;
                item.setRank( helper.dBResult.getInt("item_rank"));
                item.setPrice( helper.dBResult.getDouble("item_price"));
                String price_string = Double.toString(item.getPrice());
  /*mahmoud*/   item.setSold(helper.dBResult.getInt("item_sold"));
  /*mahmoud*/   item.setAvilable(helper.dBResult.getInt("item_available"));
                item.setCategoryname(helper.dBResult.getString("item_cat"));
                item.setPhoto(helper.dBResult.getBytes("item_photo")) ;
                int pormotion = helper.dBResult.getInt("pormotion_id");
                if( pormotion == 0 )
                {
                    item_p.getjLabel10().setVisible(false);
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
                           
                       }
                       else
                       {
                           item_p.getjLabel10().setText(String.valueOf(discount)+"% Off");
                       }
                }
               
                  item_p.setjLabel1((converThisByteArrayToImageIcon(item.getPhoto())));
                item_p.setjLabel3(item.getName());
                item_p.setjLabel5(price_string);
                item_p.setjLabel7(String.valueOf(item.getRank()));
    /*mahmoud*/            
                item_p.setavailablelable(String.valueOf(item.getAvilable()));
                item_p.setsoldlable(String.valueOf(item.getSold()));
    /*mahmoud*/            
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
    public void reset()
    {
        helper.startConnection();
        try{
        String reset_Q="DELETE * FROM inv_items";
        PreparedStatement st=helper.getConn().prepareStatement(reset_Q);
        st.executeUpdate();
        }
        catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        finally
        {
            helper.close();
        }
    }

    public void addInventoryItems(String ann_name, String ann_message, String current_day, String end_date, String price, String items_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void publishAnnouncementOffers(String ann_name,String ann_message,String current_day,String end_date,double price,String items_name) 
    {
      //  String[]items_names_list =items_name.split(",") ;
         helper.startConnection();
     String query="INSERT  INTO announcement (ann_name,ann_message,ann_st_date,ann_end_date,ann_price,ann_items_names) VALUES(?,?,?,?,?,?);";
     PreparedStatement pdt = null;
      try {
             pdt = helper.getConn().prepareStatement(query);
            pdt.setString(1, ann_name);
            pdt.setString(2, ann_message);
            pdt.setString(3, current_day);
            pdt.setString(4, end_date);
            pdt.setDouble(5, price);
            pdt.setString(6, items_name);
            pdt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
      finally{
     helper.close();
      }
    }



    public void ShowAvilableDliverboy() {}
    
}
