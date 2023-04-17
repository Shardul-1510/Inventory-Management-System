/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.Database;

/**
 *
 * @author SHARDUL
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBC_connectivity {
    public static Statement getConnection()
    {
        Statement stmt= null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Inventory","root","");
        stmt=con.createStatement();
        return stmt;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC_connectivity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stmt;
    }

public static void updatedata(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
          try (
       Connection con = DriverManager
               .getConnection("jdbc:mysql://localhost:3306/db_inventory","root","")){
        Statement stmt=con.createStatement();
       String query= "Update tbl_employee set empname=Sam where id=1";
        
       stmt.executeUpdate(query);
       System.out.println("Data update successfully!!");
        }
          }
       
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }
}