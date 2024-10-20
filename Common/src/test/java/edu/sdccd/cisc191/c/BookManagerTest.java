package edu.sdccd.cisc191.c;

import static org.junit.jupiter.api.Assertions.*;

import edu.sdccd.cisc191.c.server.BookManager;
import org.junit.jupiter.api.Test;
import edu.sdccd.cisc191.c.common.Book;
public class BookManagerTest {
    @Test
    public void testAddBook() {
        BookManager manager = new BookManager();
        book = new Book("Test Title", "Test Author");
        manager.addBook(book);
        assertEquals(book, manager.getBook("Test Title"));
    }

    @Test
    public void testRemoveBook() {
        BookManager manager = new BookManager();
        Book book = new Book("Test Title", "Test Author");
        manager.addBook(book);
        manager.removeBook("Test Title");
        assertNull(manager.getBook("Test Title"));
    }
}
