/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Manger_GUI;

import com.restaurant.Manger_Calsses.DeliveryBoy;
import static com.restaurant.Manger_GUI.additemform.p;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author com
 */
public class add_dlievery extends javax.swing.JFrame {

    /**
     * Creates new form add_dlievery
     */
    public add_dlievery() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setSize(1092, 650);
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        back = new keeptoo.KButton();
        add = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 620));
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " ", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 350, 69, 22);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(320, 350, 69, 22);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " " }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(200, 440, 69, 22);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(320, 440, 69, 22);

        jTextField1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 120, 250, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 130, 60, 22);

        jTextField3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 190, 250, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 200, 70, 22);

        jTextField2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 260, 250, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Start work");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 350, 100, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hours");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 270, 70, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("End work");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 440, 100, 22);

        back.setBorder(null);
        back.setText("BACK");
        back.setkBackGroundColor(new java.awt.Color(0, 0, 0));
        back.setkBorderRadius(30);
        back.setkEndColor(new java.awt.Color(255, 51, 0));
        back.setkHoverEndColor(new java.awt.Color(102, 102, 0));
        back.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        back.setkHoverStartColor(new java.awt.Color(51, 0, 0));
        back.setkIndicatorThickness(0);
        back.setkSelectedColor(new java.awt.Color(153, 0, 0));
        back.setkStartColor(new java.awt.Color(0, 0, 0));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(980, 10, 90, 40);

        add.setBorder(null);
        add.setText("ADD");
        add.setkBackGroundColor(new java.awt.Color(0, 0, 0));
        add.setkBorderRadius(30);
        add.setkEndColor(new java.awt.Color(255, 51, 0));
        add.setkHoverEndColor(new java.awt.Color(102, 102, 0));
        add.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        add.setkHoverStartColor(new java.awt.Color(51, 0, 0));
        add.setkIndicatorThickness(0);
        add.setkSelectedColor(new java.awt.Color(153, 0, 0));
        add.setkStartColor(new java.awt.Color(0, 0, 0));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(310, 540, 400, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/food.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 620));
        jLabel1.setMinimumSize(new java.awt.Dimension(1080, 620));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 620));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        managerlayout m=new managerlayout();
        m.show();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         String start=jComboBox1.getSelectedItem()+":"+jComboBox2.getSelectedItem()+":"+"00";
        String end=jComboBox4.getSelectedItem()+":"+jComboBox5.getSelectedItem()+":"+"00";
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        
            DeliveryBoy d=new DeliveryBoy(jTextField1.getText(), jTextField2.getText(),Integer.parseInt(jTextField3.getText()) ,start,end,1);
            d.add_Deliveryboy();
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
        
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(add_dlievery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_dlievery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_dlievery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_dlievery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_dlievery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton add;
    private keeptoo.KButton back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
