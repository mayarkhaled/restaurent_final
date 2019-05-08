
package com.restaurant.Manger_GUI;

import com.restaurant.Login;
import com.restaurant.Manger_Calsses.Manager;
import com.restaurant.Manger_GUI.additemform;
import com.restaurant.User_Classes.Customer;
import com.restaurant.helper;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class managerlayout extends javax.swing.JFrame {

  
    public managerlayout() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        itemremoved.setVisible(false);
        itemremoved.setBackground(new java.awt.Color(0,0,0,1));
        updateditem.setVisible(false);
        updateditem.setBackground(new java.awt.Color(0,0,0,1));
        Quantity.setBackground(new java.awt.Color(0,0,0,1));
        hidE_announce_data();
        make_text_like_line();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removeitemB = new keeptoo.KButton();
        updataquntityB2 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        itemremoved = new javax.swing.JTextField();
        additemviewB14 = new keeptoo.KButton();
        mainmenucontrolerB = new keeptoo.KButton();
        updataquntityB = new keeptoo.KButton();
        add_announce = new keeptoo.KButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        updateditem = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        logoutB = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updataquntityB3 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1080, 620));
        getContentPane().setLayout(null);

        removeitemB.setBorder(null);
        removeitemB.setText("REMOVE ITEM");
        removeitemB.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        removeitemB.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        removeitemB.setkBorderRadius(30);
        removeitemB.setkEndColor(new java.awt.Color(255, 0, 51));
        removeitemB.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        removeitemB.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        removeitemB.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        removeitemB.setkIndicatorThickness(0);
        removeitemB.setkSelectedColor(new java.awt.Color(0, 0, 0));
        removeitemB.setkStartColor(new java.awt.Color(0, 0, 0));
        removeitemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeitemBActionPerformed(evt);
            }
        });
        getContentPane().add(removeitemB);
        removeitemB.setBounds(290, 350, 480, 45);

        updataquntityB2.setBorder(null);
        updataquntityB2.setText("Add Delivery Boy");
        updataquntityB2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        updataquntityB2.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        updataquntityB2.setkBorderRadius(30);
        updataquntityB2.setkEndColor(new java.awt.Color(255, 0, 51));
        updataquntityB2.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        updataquntityB2.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        updataquntityB2.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        updataquntityB2.setkIndicatorThickness(0);
        updataquntityB2.setkSelectedColor(new java.awt.Color(204, 0, 0));
        updataquntityB2.setkStartColor(new java.awt.Color(0, 0, 0));
        updataquntityB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updataquntityB2MouseClicked(evt);
            }
        });
        updataquntityB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updataquntityB2ActionPerformed(evt);
            }
        });
        getContentPane().add(updataquntityB2);
        updataquntityB2.setBounds(290, 470, 480, 45);

        jLabel2.setText("item name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 350, 70, 30);

        itemremoved.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        itemremoved.setOpaque(false);
        itemremoved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemremovedActionPerformed(evt);
            }
        });
        getContentPane().add(itemremoved);
        itemremoved.setBounds(500, 350, 160, 30);

        additemviewB14.setBorder(null);
        additemviewB14.setText("ADD ITEM");
        additemviewB14.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        additemviewB14.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        additemviewB14.setkBorderRadius(30);
        additemviewB14.setkEndColor(new java.awt.Color(255, 0, 51));
        additemviewB14.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        additemviewB14.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        additemviewB14.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        additemviewB14.setkIndicatorThickness(0);
        additemviewB14.setkSelectedColor(new java.awt.Color(0, 0, 0));
        additemviewB14.setkStartColor(new java.awt.Color(0, 0, 0));
        additemviewB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemviewB14ActionPerformed(evt);
            }
        });
        getContentPane().add(additemviewB14);
        additemviewB14.setBounds(290, 290, 480, 45);

        mainmenucontrolerB.setBorder(null);
        mainmenucontrolerB.setText("MAIN MENU");
        mainmenucontrolerB.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        mainmenucontrolerB.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        mainmenucontrolerB.setkBorderRadius(30);
        mainmenucontrolerB.setkEndColor(new java.awt.Color(255, 0, 51));
        mainmenucontrolerB.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        mainmenucontrolerB.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        mainmenucontrolerB.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        mainmenucontrolerB.setkIndicatorThickness(0);
        mainmenucontrolerB.setkSelectedColor(new java.awt.Color(0, 0, 0));
        mainmenucontrolerB.setkStartColor(new java.awt.Color(0, 0, 0));
        mainmenucontrolerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenucontrolerBActionPerformed(evt);
            }
        });
        getContentPane().add(mainmenucontrolerB);
        mainmenucontrolerB.setBounds(290, 230, 480, 45);

        updataquntityB.setBorder(null);
        updataquntityB.setText("Update Quantity");
        updataquntityB.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        updataquntityB.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        updataquntityB.setkBorderRadius(30);
        updataquntityB.setkEndColor(new java.awt.Color(255, 0, 51));
        updataquntityB.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        updataquntityB.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        updataquntityB.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        updataquntityB.setkIndicatorThickness(0);
        updataquntityB.setkSelectedColor(new java.awt.Color(0, 0, 0));
        updataquntityB.setkStartColor(new java.awt.Color(0, 0, 0));
        updataquntityB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updataquntityBActionPerformed(evt);
            }
        });
        getContentPane().add(updataquntityB);
        updataquntityB.setBounds(290, 410, 480, 45);

        add_announce.setBorder(null);
        add_announce.setText("Add Annoncument");
        add_announce.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        add_announce.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        add_announce.setkBorderRadius(30);
        add_announce.setkEndColor(new java.awt.Color(255, 0, 51));
        add_announce.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        add_announce.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        add_announce.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        add_announce.setkIndicatorThickness(0);
        add_announce.setkSelectedColor(new java.awt.Color(204, 0, 0));
        add_announce.setkStartColor(new java.awt.Color(0, 0, 0));
        add_announce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_announceMouseClicked(evt);
            }
        });
        add_announce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_announceActionPerformed(evt);
            }
        });
        getContentPane().add(add_announce);
        add_announce.setBounds(290, 530, 480, 45);

        jTextField1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jTextField1.setForeground(java.awt.Color.gray);
        jTextField1.setText("name");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setName("name"); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 540, 140, 30);

        jTextField3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jTextField3.setForeground(java.awt.Color.gray);
        jTextField3.setText("items");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(460, 540, 170, 30);

        jTextField2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jTextField2.setForeground(java.awt.Color.gray);
        jTextField2.setText("message");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(270, 540, 160, 30);

        jLabel4.setText("item name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 420, 70, 30);

        jTextField4.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jTextField4.setForeground(java.awt.Color.gray);
        jTextField4.setText("end time");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(660, 540, 160, 30);

        updateditem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        updateditem.setOpaque(false);
        updateditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateditemActionPerformed(evt);
            }
        });
        getContentPane().add(updateditem);
        updateditem.setBounds(440, 420, 140, 30);

        jTextField5.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jTextField5.setForeground(java.awt.Color.gray);
        jTextField5.setText("price");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(850, 540, 140, 30);

        Quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Quantity.setOpaque(false);
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        getContentPane().add(Quantity);
        Quantity.setBounds(650, 420, 70, 30);

        jLabel5.setText("Quantity :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 420, 70, 30);

        logoutB.setText("LOG OUT");
        logoutB.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        logoutB.setkBorderRadius(0);
        logoutB.setkEndColor(new java.awt.Color(255, 0, 51));
        logoutB.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        logoutB.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        logoutB.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        logoutB.setkIndicatorThickness(0);
        logoutB.setkSelectedColor(new java.awt.Color(0, 0, 0));
        logoutB.setkStartColor(new java.awt.Color(153, 0, 0));
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
            }
        });
        getContentPane().add(logoutB);
        logoutB.setBounds(1000, 0, 80, 40);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mr.Mahmoud");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 80, 200, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mccain-fries-and-appetizers.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1080, 620);

        updataquntityB3.setBorder(null);
        updataquntityB3.setText("Update Quantity");
        updataquntityB3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        updataquntityB3.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        updataquntityB3.setkBorderRadius(30);
        updataquntityB3.setkEndColor(new java.awt.Color(255, 0, 51));
        updataquntityB3.setkHoverEndColor(new java.awt.Color(51, 51, 51));
        updataquntityB3.setkHoverForeGround(new java.awt.Color(153, 0, 0));
        updataquntityB3.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        updataquntityB3.setkIndicatorThickness(0);
        updataquntityB3.setkSelectedColor(new java.awt.Color(0, 0, 0));
        updataquntityB3.setkStartColor(new java.awt.Color(0, 0, 0));
        updataquntityB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_announceActionPerformed(evt);
            }
        });
        getContentPane().add(updataquntityB3);
        updataquntityB3.setBounds(300, 410, 480, 45);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additemviewB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemviewB14ActionPerformed

        additemform add_i=new additemform();
        add_i.show();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_additemviewB14ActionPerformed

    private void mainmenucontrolerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenucontrolerBActionPerformed
        menucontrol mc=new menucontrol();
        mc.show();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_mainmenucontrolerBActionPerformed

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
        Login log =new Login();
        log.show();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
                
    }//GEN-LAST:event_logoutBActionPerformed

    private void updataquntityBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updataquntityBActionPerformed
      
            if(!updateditem.isVisible())
       {
           
           jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            Quantity.setVisible(true);
            Quantity.setText("");
            updateditem.setText("");
            itemremoved.setText("");
            updateditem.setVisible(true);
            itemremoved.setVisible(false);
            jLabel2.setVisible(false);
            removeitemB.setLocation(300, 350);
            updataquntityB.setLocation(300, 453);
       }
       else
       {
           Manager m=new Manager();

           m.updateInventoryItem(updateditem.getText(), Quantity.getText());
           
           updateditem.setVisible(false);
           
           updataquntityB.setLocation(300, 410);
       }
    }//GEN-LAST:event_updataquntityBActionPerformed

    private void itemremovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemremovedActionPerformed
        
    }//GEN-LAST:event_itemremovedActionPerformed

    private void removeitemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeitemBActionPerformed
       if(!itemremoved.isVisible())
       {
           jLabel2.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            Quantity.setVisible(false);
            updateditem.setVisible(false);
            itemremoved.setText("");
            itemremoved.setVisible(true);
            removeitemB.setLocation(300, 393);
            updataquntityB.setLocation(300, 453);
       }
       else
       {
           Manager m=new Manager();
           try {
               m.deleteInventoryItems(itemremoved.getText());
              
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, ex.getMessage());
           }
           finally
           {
               helper.close();
           }
           
           itemremoved.setVisible(false);
           removeitemB.setLocation(300, 350);   
           updataquntityB.setLocation(300, 410);
       }
    }//GEN-LAST:event_removeitemBActionPerformed

    private void updateditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateditemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateditemActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed
private void hidE_announce_data()
{
    
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
         jTextField4.setVisible(false);
          jTextField5.setVisible(false);
}
private void show_announce_data()
{
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
         jTextField4.setVisible(true);
          jTextField5.setVisible(true);
}
private void make_text_like_line()
{
    jTextField1.setBackground(new java.awt.Color(0,0,0,1));
    jTextField2.setBackground(new java.awt.Color(0,0,0,1));
    jTextField3.setBackground(new java.awt.Color(0,0,0,1));
    jTextField4.setBackground(new java.awt.Color(0,0,0,1));
    jTextField5.setBackground(new java.awt.Color(0,0,0,1));
}
private void fill_text()
{
  /*   jTextField1.setText("name");
     jTextField2.setText("message");
     jTextField3.setText("items");
     jTextField4.setText("end time");
     jTextField5.setText("price");
*/
}
    private void add_announceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_announceActionPerformed
      
       if(!jTextField1.isVisible())
       {
           show_announce_data();
           //290,530
           add_announce.setLocation(290, 530+43);
       }
       else
       {
           hidE_announce_data();
           fill_text();
           add_announce.setLocation(290, 530);
           String ann_name = jTextField1.getText();
           String ann_message = jTextField2.getText();
           String items_name = jTextField3.getText();
           SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");  
           Date date = new Date();  
           String current_day = formatter.format(date);
           String end_date =  jTextField4.getText();
           double price = Double.parseDouble(jTextField5.getText().trim());  
           Manager m=new Manager();
           m.publishAnnouncementOffers(ann_name, ann_message,current_day,end_date,price,items_name);
         
       }
      
    }//GEN-LAST:event_add_announceActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void add_announceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_announceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_add_announceMouseClicked

    private void updataquntityB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updataquntityB2ActionPerformed
add_dlievery a=new add_dlievery();
a.show();
    }//GEN-LAST:event_updataquntityB2ActionPerformed

    private void updataquntityB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updataquntityB2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updataquntityB2MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        fill_text();
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        fill_text();
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        fill_text();
        jTextField3.setText("");

    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        fill_text();
        jTextField4.setText("");

    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        fill_text();
        jTextField5.setText("");
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(managerlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerlayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Quantity;
    private keeptoo.KButton add_announce;
    private keeptoo.KButton additemviewB14;
    private javax.swing.JTextField itemremoved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private keeptoo.KButton logoutB;
    private keeptoo.KButton mainmenucontrolerB;
    private keeptoo.KButton removeitemB;
    private keeptoo.KButton updataquntityB;
    private keeptoo.KButton updataquntityB2;
    private keeptoo.KButton updataquntityB3;
    private javax.swing.JTextField updateditem;
    // End of variables declaration//GEN-END:variables
}
