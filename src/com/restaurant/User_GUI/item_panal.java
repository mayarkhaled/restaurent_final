/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.User_GUI;

import com.restaurant.User_Classes.Bill;
import com.restaurant.User_Classes.Item;
import com.restaurant.helper;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import keeptoo.KButton;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

/**
 *
 * @author Mayar khaled
 */
public class item_panal extends javax.swing.JPanel {

    /**
     * Creates new form item_
     */
   
    public item_panal() {
        
          JLabel label = new JLabel("");
        initComponents();
        jComboBox1.removeAll();
        jComboBox1.addItem("1");
        jComboBox1.addItem("2");
        jComboBox1.addItem("3");
        jComboBox1.addItem("4");
        jComboBox1.addItem("5");
        
        item_panal.this.setOpaque(false);
      label.setIcon(new ImageIcon("E:\\imageDB\\menumenucopy.jpg"));
        label.setBounds(0, 0, 817, 658);
        this.add(label);
      
        /*mahmoud*/
       a_lable.setVisible(false);
       s_lable.setVisible(false);
       availablelable.setVisible(false);
       soldlable.setVisible(false);
    }

     public JLabel gets_lable() {
        return s_lable;
    }
     public JLabel geta_lable() {
        return a_lable;
    }
     public JLabel getavailablelable() {
        return availablelable;
    }
     public JLabel getsoldlable() {
        return soldlable;
    }
    public KButton getorderB() {
        return orderB;
    }

    public void setavailablelable(String av) {
        availablelable.setText(av);
    }
     public void setsoldlable(String s) {
        soldlable.setText(s);
    }
     
    /*mamoud*/
     
     
    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

   public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(String s) {
        this.jLabel3.setText(s);
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(ImageIcon i) {
        
       ImageIcon img;
        img = new ImageIcon(i.getImage().getScaledInstance(340, 250, Image.SCALE_SMOOTH));
       this.jLabel1.setIcon(img);
    }
    public void setDLabel1(int h,int w)
    {
        this.setSize(h,w);
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public void setjLabel5(String s) {
        this.jLabel5.setText(s);
    }

    

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(String s) {
        this.jLabel7.setText(s);
    }

  
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        animationClass1 = new AppPackage.AnimationClass();
        orderB = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        a_lable = new javax.swing.JLabel();
        availablelable = new javax.swing.JLabel();
        soldlable = new javax.swing.JLabel();
        s_lable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(400, 377));

        orderB.setBorder(null);
        orderB.setText("Add");
        orderB.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        orderB.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        orderB.setkBorderRadius(30);
        orderB.setkEndColor(new java.awt.Color(255, 0, 51));
        orderB.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        orderB.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        orderB.setkHoverStartColor(new java.awt.Color(153, 0, 0));
        orderB.setkIndicatorThickness(0);
        orderB.setkPressedColor(new java.awt.Color(102, 0, 0));
        orderB.setkSelectedColor(new java.awt.Color(153, 0, 0));
        orderB.setkStartColor(new java.awt.Color(102, 0, 0));
        orderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Rate : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Price : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setName("item_price"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setName("item_name"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name : ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images.jpg"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setName("rank"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("EGP");

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("OFFER");

        a_lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        a_lable.setText("Available :");

        availablelable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        availablelable.setText("a");
        availablelable.setName("rank"); // NOI18N

        soldlable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        soldlable.setText("s");
        soldlable.setName("rank"); // NOI18N

        s_lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        s_lable.setText("Sold :");

        jLabel8.setText("Rate this");

        jButton1.setText("RATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s_lable)
                                    .addComponent(a_lable))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soldlable)
                                    .addComponent(availablelable))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel7))
                                            .addComponent(jLabel9))))
                                .addGap(4, 4, 4)
                                .addComponent(s_lable)
                                .addGap(3, 3, 3)
                                .addComponent(a_lable))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(soldlable)
                                .addGap(20, 20, 20)
                                .addComponent(availablelable))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(orderB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void orderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBActionPerformed
        Bill o=new Bill();   
        
           if(o.found(jLabel3.getText()))
           {
            Item item_panal=new Item();
            item_panal.setName(jLabel3.getText());
            item_panal.setPrice(Double.parseDouble(jLabel5.getText()));
            item_panal.setIntquantity_in_bill(1);
            if(jLabel10.isVisible()){
                 String []pormotion=jLabel10.getText().split("%");
                System.out.print(pormotion[0]);
                  item_panal.getPormotion().setDiscount(Integer.parseInt(pormotion[0]));
               
            }
           else{
                item_panal.getPormotion().setDiscount(0);
                
            }
          
               o.set_in_list(item_panal);
          }
    }//GEN-LAST:event_orderBActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index = jComboBox1.getSelectedIndex();
        String rate = "";
        if(index==0)
        {
            rate = "1";
        }
        if(index==1)
        {
            rate = "2";
        }
        if(index==2)
        {
            rate = "3";
        }
        if(index==3)
        {
            rate = "4";
        }
        if(index==4)
        {
            rate = "5";
        }
        
          helper.startConnection();
          try{
        /*update inv_items set item_available where item_name =text */
         ResultSet Pr_Result = null;
          Statement stmt = null;
            String select = "select item_rank from inv_items where item_name = "+'"'+this.getjLabel3().getText()+'"';
            helper.dBResult = helper.stmt.executeQuery(select);
            String s="";
             if(helper.dBResult.next()){
              s = helper.dBResult.getString(1);
        }
          if(s==null)
          {
            String query = "update inv_items set item_rank = '"+rate+"' where item_name = "+'"'+this.getjLabel3().getText()+'"';  
             helper.stmt.executeUpdate(query);
          }
          else
          {
              String rank = s+","+rate;
              String query = "update inv_items set item_rank = '"+rank+"' where item_name = "+'"'+this.getjLabel3().getText()+'"';
           helper.stmt.executeUpdate(query);
          }
          
        }
        catch(Exception e)
        {
        
        }
        finally{
          helper.close();
                  }
        
    }//GEN-LAST:event_jButton1ActionPerformed
  
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a_lable;
    private AppPackage.AnimationClass animationClass1;
    private javax.swing.JLabel availablelable;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KButton orderB;
    private javax.swing.JLabel s_lable;
    private javax.swing.JLabel soldlable;
    // End of variables declaration//GEN-END:variables
}
