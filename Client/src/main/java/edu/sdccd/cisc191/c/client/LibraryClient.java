package edu.sdccd.cisc191.c.client;

import edu.sdccd.cisc191.c.common.Book;
import edu.sdccd.cisc191.c.server.LibraryServer;

public class LibraryClient {
    private LibraryServer libraryServer = new LibraryServer();

    public void addBook(String title, String author, String isbn) {
        libraryServer.addBook(title, author, isbn);
    }

    public void removeBook(String isbn) {
        libraryServer.removeBook(isbn);
    }

    public void listBooks() {
        libraryServer.printAllBooks();
    }
}
