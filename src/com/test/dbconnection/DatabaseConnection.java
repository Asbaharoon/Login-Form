/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Ahsan
 */
public class DatabaseConnection {
    
    private static Connection con = null;
    
    static{
        
         try {

            Class.forName("org.sqlite.JDBC");
       
            // DriverManager.getConnection("jdbc:sqlite:src/com/test/db/BookStore.db");
            con = DriverManager.getConnection("jdbc:sqlite:src/com/test/sqlitedatabase/Database.db");

            System.out.println("Sqlite Connection Has ESTABLISHED!\n");

        } catch (Exception e) {

            System.out.println("Failed Connection!\n");

            e.printStackTrace();
        }
    
    }
    
    private  DatabaseConnection(){
    
    }
    
    public static Connection getDBConnection(){
    
        return con;
    }
}
