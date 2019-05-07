/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.User_GUI;
import com.restaurant.User_Classes.Bill;
import com.restaurant.helper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ScrollBar;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author Mayar khaled
 */

public class menu_form extends javax.swing.JFrame  {

    /**
     * Creates new form menu_form
     */
       public menu_form(int m)
    {
        Timer time=new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                        jPanel1.removeAll();
                      bill2 b=new bill2();
                      jPanel1.setLayout(new java.awt.FlowLayout());
                            jPanel1.add(b);
                          jPanel1.setVisible(true);
                        jPanel1.revalidate();
                        
            }
        }, 1000,1000);
        initComponents();
        
         mainMenu menu = new mainMenu("5m Restaurent",true);
             menu.View_menu();
        
        this.setTitle(menu.getRestaurantName());
        for (Map.Entry<String, List> mymap : menu.category.entrySet()) {         
                        JPanel panal = new JPanel();
                         JLabel label = new JLabel("");
               // label.setIcon(new ImageIcon("E:\\imageDB\\menumenucopy.jpg"));
                
                panal.add(label);
//                        ScrollBar vScrollBar1 = new ScrollBar();
                      panal.setLayout(new BoxLayout(panal,BoxLayout.PAGE_AXIS));
                    // panal.add(new JScrollPane(), BorderLayout.CENTER);
                    JScrollPane pane = new JScrollPane(panal);
                        List<item_panal> newlist = new ArrayList();
                    newlist = mymap.getValue();
                     
                    for (int i=0;i<newlist.size();i++) {
                        panal.add(newlist.get(i));
                    }
                   
               /*
                 label.setBounds(0, 0, 817, 658);
                 pane.add(label);*/
                     jTabbedPane1.addTab(mymap.getKey(),pane);  
                  
                   }
    }
    public menu_form() {
                Timer time=new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(jPanel1.isVisible())
                {
                        jPanel1.removeAll();
                      bill2 b=new bill2();
                      jPanel1.setLayout(new java.awt.FlowLayout());
                            jPanel1.add(b);
                          jPanel1.setVisible(true);
                        jPanel1.revalidate();
                }      
            }
        }, 1000,1000);
        initComponents();

          mainMenu menu = new mainMenu("5m Restaurent ");
        menu.View_menu();
        this.setTitle(menu.getRestaurantName());
        for (Map.Entry<String, List> mymap : menu.category.entrySet()) {         
                        JPanel panal = new JPanel();
//                        ScrollBar vScrollBar1 = new ScrollBar();
                      panal.setLayout(new BoxLayout(panal,BoxLayout.PAGE_AXIS));
                    // panal.add(new JScrollPane(), BorderLayout.CENTER);
                    JScrollPane pane = new JScrollPane(panal);
                        List<item_panal> newlist = new ArrayList();
                    newlist = mymap.getValue();
                     
                    for (int i=0;i<newlist.size();i++) {
                        panal.add(newlist.get(i));
                    }
                    JLabel label = new JLabel("");
                label.setIcon(new ImageIcon("E:\\imageDB\\menumenucopy.jpg"));/*
                 label.setBounds(0, 0, 817, 658);
                 pane.add(label);*/
                     jTabbedPane1.addTab(mymap.getKey(),pane);  
                  
                   }
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }


     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        messege_complain m=new messege_complain();        
        m.setLocation(new Point(100, 100));
         m.show();
    
    }//GEN-LAST:event_jButton1ActionPerformed
public ImageIcon converThisByteArrayToImageIcon(byte[]b)
{
	return new ImageIcon(b);
}
private BufferedImage createImageFromBytes(byte[] imageData) {
    ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
    try {
        return ImageIO.read(bais);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

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
            java.util.logging.Logger.getLogger(menu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }
}
