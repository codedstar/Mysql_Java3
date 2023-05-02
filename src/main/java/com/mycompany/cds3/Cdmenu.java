/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cds3;

/**
 *
 * @author kwaku
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Cdmenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        Genre genre = new Genre();
        AdminGenre adminGenre = new AdminGenre();
        ArrayList<Genre> genreList = adminGenre.readGenreAll();

        do {
            System.out.println("1.- Insert Genre.");
            System.out.println("2.- Update Genre.");
            System.out.println("3.- Delete Genre.");
            System.out.println("4.- Get All Genre");
            System.out.println("5+.- Exit");

            option = input.nextInt();

            switch (option) {

                case 1 -> {
                    // Insert Genre method here...
                    // System.out.println("Insert Genre method here...");
                    System.out.println("Input Genre name");

                    // Consume newline left-over
                    input.nextLine();
                    String genreName = input.nextLine();
                    genre.setName(genreName);

                    try {
                        adminGenre.insertGenre(genre.getName());
                        System.out.println(genreName + " inserted.");
                    } catch (Error e) {
                        System.out.println("Error" + e.getMessage());
                    }

                    System.out.println();
                    displayGenres(genreList);
                    System.out.println();
                }

                case 2 -> {
                    // Update Genre method here...
                    // System.out.println("Update Genre method here...");
                    displayGenres(genreList);
                    System.out.println("Input Genre ID and Name");

                    int genreId = input.nextInt();

                    // genre.setID(genreId);
                    // Consume newline left-over
                    input.nextLine();
                    String genreName = input.nextLine();
                    Genre genre1 = new Genre(genreId, genreName);
                    adminGenre.updateGenre(genre1.getName(), genre1.getID());
                    displayGenres(genreList);
                }

                case 3 -> {
                    // Delete Genre method here...
                    // System.out.println("Delete Genre method here...");
                    displayGenres(genreList);
                    System.out.println("Input Genre ID to delete");

                    int genreId = input.nextInt();
                    genre.setID(genreId);
                    adminGenre.deleteGenre(genre.getID());
                    displayGenres(genreList);
                }

                case 4 ->
                    // Get All Genre method here...
                    // System.out.println("Get All Genre method here...");
                    displayGenres(genreList);

                default -> {
                    // close connection and exit
                    System.out.println("Exit");
                    return;
                }
            }
        } while (option != 0);

    }

    public static void displayGenres(ArrayList<Genre> genreList) {
        if (!genreList.isEmpty()) {
            System.out.println("The list has " + genreList.size() + " elements.");
            // for loop
            System.out.println("Genre ID " + " | " + "Genre Name ");
            for (Genre genre : genreList) {
                System.out.println(genre.getID() + "         | " + genre.getName());

            }
            System.out.println("\n");

        } else {
//         the list is empty
            System.out.println("Genre List is Empty at the moment.\n");
        }
    }

}
