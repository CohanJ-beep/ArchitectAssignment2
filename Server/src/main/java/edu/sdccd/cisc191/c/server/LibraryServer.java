package edu.sdccd.cisc191.c.server;

import edu.sdccd.cisc191.c.common.Book;
import edu.sdccd.cisc191.c.common.SerializationUtil;
import java.io.IOException;

public class LibraryServer {
    private BookManager bookManager;

    public LibraryServer() {
        bookManager = new BookManager();
    }

    public void addBook(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        bookManager.add(book);
    }

    public Book findBook(String isbn) {
        return bookManager.find(isbn);
    }

    public void printAllBooks() {
        bookManager.printAll();
    }

    public void saveLibrary(String filename) {
        try {
            SerializationUtil.serialize(bookManager, filename);
            System.out.println("Library saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadLibrary(String filename) {
        try {
            bookManager = (BookManager) SerializationUtil.deserialize(filename);
            System.out.println("Library loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void removeBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            bookManager.remove(book);
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found with ISBN: " + isbn);
        }
    }
}
