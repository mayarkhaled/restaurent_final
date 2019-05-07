/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author Mayar khaled
 */
public final class helper {

    public static Connection getConn() {
        return conn;
    }
 
    public static Connection conn = null;
    public static Statement stmt = null;
    public static ResultSet dBResult = null;
    public static void startConnection(){
        try {
            String url = String.format("jdbc:mysql://%s/%s","remotemysql.com","oZaDX9hhLT");
             conn = DriverManager.getConnection(url,"oZaDX9hhLT","yvvbMj9Bfq");
             stmt = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("Start connection error "+ex.getMessage());
        }
    }
    //res = st.execute
    public static void close(){
 
        if (dBResult != null) {
            try {
                dBResult.close();
            } 
            catch (SQLException sqlEx) { 
            System.out.println("Close connection error "+sqlEx.getMessage());
            } // ignore
            dBResult = null;
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) { 
            System.out.println("Close connection error "+sqlEx.getMessage());
            } // ignore
            stmt = null;
        }
    }

    public static Object conn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 