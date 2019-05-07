package com.restaurant.Manger_Calsses;

import com.restaurant.User_Classes.Item;

public class InventoryItem extends Item {

    private int sold;

    private int avilable;

    /**
     *
     * @param itemcode
     * @param name
     * @param rank
     * @param price
     * @param photo
     * @param quantity
     * @param pormotion
     * @param sold
     * @param avilable
     */
    public InventoryItem(String itemcode, String name, float rank, double price, byte[] photo, int quantity, Pormotion pormotion,String catName)
    {
        super(itemcode, name, rank, price, photo, quantity, pormotion,catName );
        this.sold=0;
        this.avilable=quantity;
    }
     public InventoryItem(String itemcode, String name, float rank, double price, byte[] photo, int quantity, String catName)
    {
        super(itemcode, name, rank, price, photo, quantity,catName );
        this.sold=0;
        this.avilable=quantity;
    }
     public InventoryItem(){};

    public void setSold(int sold) {
        this.sold=sold;
    }

    public int getSold() {
       return sold;
    }

    public void setAvilable(int avilable) {
        this.avilable=avilable;
    }

    public int getAvilable() {
        return avilable;
    }
}
