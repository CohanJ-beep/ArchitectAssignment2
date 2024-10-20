package edu.sdccd.cisc191.c.server;

import edu.sdccd.cisc191.c.common.Book;

public class LibraryController {
    private LibraryServer libraryServer;

    public LibraryController(LibraryServer libraryService) {
        this.libraryServer = libraryService;
    }

    public void addBook(String title, String author, String isbn) {
        libraryServer.addBook(title, author, isbn);
    }

    public Book findBook(String isbn) {
        return libraryServer.findBook(isbn);
    }

    public void displayBooks() {
        libraryServer.printAllBooks();
    }
}


