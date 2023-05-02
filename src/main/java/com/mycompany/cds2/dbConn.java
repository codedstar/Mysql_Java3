/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cds2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abdulmac
 */
public class dbConn {
    
    Connection conn;
    
//    public dbConn( String url,String username,String password){
//    public dbConn(){
//        this.url = "jdbc:mysql://localhost:3306/music";
//        this.username = "";
//        this.password = "";
//    }
    
//    create a class - env and add variables
//    final static String url = "db url";
//    final static String username = "db user";
//    final static String password = "db pass";
    
    public Connection connect(){

        try{
            conn = DriverManager.getConnection(env.url,env.username,env.password);
//            return "connection successful";
            
        }catch(SQLException exception){
//            return "Error" + exception.getMessage();
//            return exception;
            throw new Error(exception);
        }
        
        return conn;
        
    }
    
    
    
}
