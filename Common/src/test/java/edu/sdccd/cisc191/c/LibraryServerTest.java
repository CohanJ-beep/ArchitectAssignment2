package edu.sdccd.cisc191.c;

import edu.sdccd.cisc191.c.common.Book;
import edu.sdccd.cisc191.c.server.LibraryServer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServerTest extends ApplicationTest {

    private LibraryServer libraryServer;
    private Book book;

    @Override
    public void start(Stage stage) {
        Button button = new Button("Click me");
        button.setOnAction(e -> System.out.println("Button clicked"));
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    @BeforeEach
    void setUp() {
        libraryServer = new LibraryServer();
        book = new Book("Mockito in Action", "John Doe", "1234567890");
    }

    @Test
    void testAddBook() {
        libraryServer.addBook(book.getTitle(), book.getAuthor(), book.getIsbn());
        Book foundBook = libraryServer.findBook(book.getIsbn());
        assertNotNull(foundBook);
        assertEquals(book.getTitle(), foundBook.getTitle());
        assertEquals(book.getAuthor(), foundBook.getAuthor());
    }

@Test
    void testFindBook() {
        libraryServer.addBook(book.getTitle(), book.getAuthor(), book.getIsbn());
        Book foundBook = libraryServer.findBook(book.getIsbn());
        assertNotNull(foundBook);
        assertEquals(book.getTitle(), foundBook.getTitle());
        assertEquals(book.getAuthor(), foundBook.getAuthor());
    }

    @Test
    void testPrintAllBooks() {
        libraryServer.addBook(book.getTitle(), book.getAuthor(), book.getIsbn());
        libraryServer.printAllBooks();
        // You can add assertions to check the output if needed
    }

    @Test
    void testSaveLibrary() {
        libraryServer.addBook(book.getTitle(), book.getAuthor(), book.getIsbn());
        libraryServer.saveLibrary("testLibrary.ser");
        File file = new File("testLibrary.ser");
        assertTrue(file.exists());
        file.delete(); // Clean up after test
    }

    @Test
    void testLoadLibrary() {
        libraryServer.addBook(book.getTitle(), book.getAuthor(), book.getIsbn());
        libraryServer.saveLibrary("testLibrary.ser");
        libraryServer.loadLibrary("testLibrary.ser");
        Book foundBook = libraryServer.findBook(book.getIsbn());
        assertNotNull(foundBook);
        assertEquals(book.getTitle(), foundBook.getTitle());
        assertEquals(book.getAuthor(), foundBook.getAuthor());
        new File("testLibrary.ser").delete(); // Clean up after test
    }

    @Test
    void testRemoveBook() {
        libraryServer.addBook(book.getTitle(), book.getAuthor(), book.getIsbn());
        libraryServer.removeBook(book.getIsbn());
        Book foundBook = libraryServer.findBook(book.getIsbn());
        assertNull(foundBook);
    }
}
