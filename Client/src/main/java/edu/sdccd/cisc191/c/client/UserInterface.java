package edu.sdccd.cisc191.c.client;

import edu.sdccd.cisc191.c.server.LibraryServer;
import java.util.Scanner;

public class UserInterface {
    private LibraryServer libraryServer = new LibraryServer();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    libraryServer.addBook(title, author, isbn);
                    break;
                case 2:
                    System.out.print("Enter book ISBN to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    libraryServer.removeBook(isbnToRemove);
                    break;
                case 3:
                    libraryServer.printAllBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
