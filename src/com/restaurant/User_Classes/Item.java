package com.restaurant.User_Classes;

import com.restaurant.Manger_Calsses.Pormotion;
import com.restaurant.helper;
import java.sql.SQLException;

public class Item {

    private Pormotion pormotion;
     
    private int item_id;
    
    private int quantity;
      
    private int intquantity_in_bill;
    
    private byte [] photo;

    private double price;

    private float rank;

    private String name;

    private String itemcode;
    public String categoryname;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Item(String i, String n, float r, double p, byte[] ph, int q, Pormotion po,String cat) 
    {
        this(i,n,r,p,ph,q,cat);
        pormotion=po;
    }
        public Item(String i, String n, float r, double p, byte[] ph, int q,String cat) 
    {
        itemcode=i;
        name=n;
        rank=r;
        price=p;
        photo=ph;
        quantity=q;
        categoryname=cat;
    }
    public Item()
    {
        pormotion=new Pormotion();
    }

    public void setPormotion(Pormotion pormotion) {
        this.pormotion = pormotion;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    

    public String getItemcode() {
        return itemcode;
    }

    public String getName() {
        return name;
    }

    public float getRank() {
        return rank;
    }

    public double getPrice() {
        return price;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public int getQuantity() {
        return quantity;
    }

    public Pormotion getPormotion() {
        return pormotion;
    }
        public int getIntquantity_in_bill() {
        return intquantity_in_bill;
    }

    public void setIntquantity_in_bill(int intquantity_in_bill) {
        this.intquantity_in_bill = intquantity_in_bill;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
    
    public void get_id_from_sql() throws SQLException {
        helper.startConnection();
        try{
           
           String query = "SELECT item_id FROM inv_items WHERE item_name='"+this.getName()+"'"; 
           helper.dBResult = helper.stmt.executeQuery(query);
            while(helper.dBResult.next())
                this.setItem_id(helper.dBResult.getInt("item_id"));;
           

                   /*   while(helper.dBResult.next())
            {
                if(helper.dBResult.getString("item_name")==this.getName())
                    this.item_id=helper.dBResult.getInt("item_id");
            }*/
        }
           catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            helper.close();
        }
                      
    }
}
