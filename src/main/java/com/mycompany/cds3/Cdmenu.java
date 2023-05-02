/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cds3;

/**
 *
 * @author kwaku
 */
import java.util.Scanner;

public class Cdmenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        Genre genre = new Genre();
        AdminGenre adminGenre = new AdminGenre();

        do {
            System.out.println("1.- Insert Genre.");
            System.out.println("2.- Update Genre.");
            System.out.println("3.- Delete Genre.");
            System.out.println("4.- Get All Genre");
            System.out.println("5+.- Exit");

            option = input.nextInt();

            switch (option) {

                case 1 ->  {
                    // Insert Genre method here...
                    // System.out.println("Insert Genre method here...");
                    System.out.println("Input Genre name");

                    // Consume newline left-over
                    input.nextLine();
                    String genreName = input.nextLine();
                    genre.setName(genreName);
                    try{
                        adminGenre.insertGenre(genre.getName());
                        System.out.println(genreName + " inserted.");
                    }
                    catch(Error e){
                        System.out.println("Error" + e.getMessage());
                    }
                 
                    System.out.println();
                    System.out.println(adminGenre.readGenreAll());
                    System.out.println();
                }

                case 2 ->  {
                    // Update Genre method here...
                    // System.out.println("Update Genre method here...");
                    System.out.println(adminGenre.readGenreAll());
                    System.out.println("Input Genre ID and Name");

                    int genreId = input.nextInt();

                    // genre.setID(genreId);
                    // Consume newline left-over
                    input.nextLine();
                    String genreName = input.nextLine();
                    Genre genre1 = new Genre(genreId, genreName);
                    adminGenre.updateGenre(genre1.getName(), genre1.getID());
                    System.out.println(adminGenre.readGenreAll());
                }

                case 3 ->  {
                    // Delete Genre method here...
                    // System.out.println("Delete Genre method here...");
                    System.out.println(adminGenre.readGenreAll());
                    System.out.println("Input Genre ID to delete");

                    int genreId = input.nextInt();
                    genre.setID(genreId);
                    adminGenre.deleteGenre(genre.getID());
                    System.out.println(adminGenre.readGenreAll());
                }

                case 4 -> // Get All Genre method here...
                    // System.out.println("Get All Genre method here...");

                    System.out.println(adminGenre.readGenreAll());

                default -> {
                    // close connection and exit
                    System.out.println("Exit");
                    return;
                }
            }
        } while (option != 0);

    }

}
