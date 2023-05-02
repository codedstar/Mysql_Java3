/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cds2;

/**
 *
 * @author kwaku
 */

import java.util.Scanner;
//import java.util.;

public class Cdmenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        
        Genre genre = new Genre();
            
        AdminGenre adminGenre = new AdminGenre();
      
        do {
            // System.out.println("Menu:");
            System.out.println("1.- Insert Genre.");
            System.out.println("2.- Update Genre.");
            System.out.println("3.- Delete Genre.");
            System.out.println("4.- Get All Genre");
            System.out.println("5+.- Exit");
            
            option = input.nextInt();
//            }catch(java.util.InputMismatchException ex){}
            
            
            
        
            if (option == 1) {
            // Insert Genre method here...
            //            System.out.println("Insert Genre method here...");
            input.nextLine();  // Consume newline left-over
            String genreName = input.nextLine();
            genre.setName(genreName);
            System.out.println(adminGenre.insertGenre(genre.getName()));

            }else if (option == 2) {
//             Update Genre method here...
//            System.out.println("Update Genre method here...");
            int genreId = input.nextInt();
//            genre.setID(genreId);
            input.nextLine();  // Consume newline left-over
            String genreName = input.nextLine();
            Genre genre1 = new Genre(genreId, genreName);
            System.out.println(adminGenre.updateGenre(genre1.getName(), genre1.getID()));

            }else if (option == 3) {
            // Delete Genre method here...
//            System.out.println("Delete Genre method here...");
            int genreId = input.nextInt();
            genre.setID(genreId);
            System.out.println(adminGenre.deleteGenre(genre.getID()));

            }else if (option == 4) {
            // Get All Genre method here...
//            System.out.println("Get All Genre method here...");
             System.out.println(adminGenre.readGenreAll());

            }
            else {
            // close connection and exit
            System.out.println("Exit");
             return;
            }
        } while (option != 0);
     
    }

    
}
