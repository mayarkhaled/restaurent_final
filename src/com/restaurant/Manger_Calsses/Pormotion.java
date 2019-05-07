package com.restaurant.Manger_Calsses;

public class Pormotion {

    private int id;

    private int discount;

    private String relasedate;

    private String expiredate;

    public void setId(int id) {
        this.id = id;
    }

    public Pormotion() {
    }
    

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setRelasedate(String relasedate) {
        this.relasedate = relasedate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public String getRelasedate() {
        return relasedate;
    }

    public String getExpiredate() {
        return expiredate;
    }

    public  Pormotion(int i, int d, String r, String e) {
        id=i;
        discount=d;
        relasedate=r;
        expiredate=e;
    }
    
}
