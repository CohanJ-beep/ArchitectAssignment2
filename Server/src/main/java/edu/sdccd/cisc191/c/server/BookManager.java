package edu.sdccd.cisc191.c.server;

import edu.sdccd.cisc191.c.common.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public Book find(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public void remove(Book book) {
        books.remove(book);
    }

    public void printAll() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
