/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cds3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author kwaku
 */

//        String url = "jdbc:mysql://localhost:3306/music";
//        String username = "root";
//        String password = "root";


public class AdminGenre {
    
    dbConn conn = new dbConn();
    PreparedStatement pStmt;
   
    public String insertGenre(String genreName){
        try{
            // PreparedStatement way
            String query = "INSERT INTO genre(name) VALUES(?)";
            pStmt = conn.connect().prepareStatement(query);
            pStmt.setString(1, genreName);

            int pStmtRowsAffected = pStmt.executeUpdate();
            return pStmtRowsAffected + " row(s) inserted.";
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }finally {
//            try { rs.close(); } catch (Exception e) { /* Ignored */ }
            try { pStmt.close(); } catch (Exception e) { /* Ignored */ }
            try { conn.connect().close(); } catch (Exception e) { /* Ignored */ }
        }

    }
    
    public String readGenre(int id){
        try{
            // PreparedStatement way
            String query = "SELECT * FROM genre where (`id_genre` = ?) ";
            pStmt = conn.connect().prepareStatement(query);
            pStmt.setInt(1, id);
            
            ResultSet rs;            
            String genID, genName, text = "";

            
            rs = pStmt.executeQuery();
            while (rs.next()) {               // Position the cursor                  4 
            genID = rs.getString(1);        // Retrieve the first column value
            genName = rs.getString(2);      // Retrieve the first column value
            text = ("Genre id = " + genID +
             "\nGenre name = " + genName);
                                            // Print the column values
          }
            return text;
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }finally {
//            try { rs.close(); } catch (Exception e) { /* Ignored */ }
            try { pStmt.close(); } catch (Exception e) { /* Ignored */ }
            try { conn.connect().close(); } catch (Exception e) { /* Ignored */ }
        }
    }
    
    public String readGenreAll(){
        try{
            // PreparedStatement way
            String query = "SELECT * FROM genre ";
            pStmt = conn.connect().prepareStatement(query);
//            pStmt.setInt(1, id);
            
            ResultSet rs;            
            String genID, genName, text = ("Genre id | Genre name\n");

            
            rs = pStmt.executeQuery();
            while (rs.next()) {               // Position the cursor                  4 
            genID = rs.getString(1);        // Retrieve the first column value
            genName = rs.getString(2);      // Retrieve the first column value
            text += (genID +
             "      |  " + genName + "\n");
                                            // Print the column values
          }
            return text;
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }finally {
//            try { rs.close(); } catch (Exception e) { /* Ignored */ }
            try { pStmt.close(); } catch (Exception e) { /* Ignored */ }
            try { conn.connect().close(); } catch (Exception e) { /* Ignored */ }
        }
    }
    
    public String updateGenre(String genreName, int id){
        try{
            // PreparedStatement way
            String query = "UPDATE `music`.`genre` SET `name` = ? WHERE (`id_genre` = ?)";
            pStmt = conn.connect().prepareStatement(query);
            pStmt.setString(1, genreName);
            pStmt.setInt(2, id);

            int rowsUpdated = pStmt.executeUpdate();
            return rowsUpdated + " row(s) updated successfully.";

            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }finally {
//            try { rs.close(); } catch (Exception e) { /* Ignored */ }
            try { pStmt.close(); } catch (Exception e) { /* Ignored */ }
            try { conn.connect().close(); } catch (Exception e) { /* Ignored */ }
        }
    }
        
    public String deleteGenre(int id){
        try{
            // PreparedStatement way
            String query = "DELETE FROM `music`.`genre` WHERE (`id_genre` = ?)";
            pStmt = conn.connect().prepareStatement(query);
            pStmt.setInt(1, id);
            int rowsDeleted = pStmt.executeUpdate();
            return rowsDeleted + " row(s) deleted successfully.";
            
        }catch(SQLException exception){
             return "Error" + exception.getMessage();
        }finally {
//            try { rs.close(); } catch (Exception e) { /* Ignored */ }
            try { pStmt.close(); } catch (Exception e) { /* Ignored */ }
            try { conn.connect().close(); } catch (Exception e) { /* Ignored */ }
        }
    }
}
