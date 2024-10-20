package edu.sdccd.cisc191.c.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The LibraryManagementGUI class is responsible for creating the JavaFX GUI for the library management system.
 */
public class LibraryManagementGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // This is the start method where you set up your GUI
        VBox root = new VBox();

        // Text fields for book details
        TextField titleField = new TextField();
        titleField.setPromptText("Title");
        TextField authorField = new TextField();
        authorField.setPromptText("Author");
        TextField isbnField = new TextField();
        isbnField.setPromptText("ISBN");

        // Buttons for library operations
        Button addBookButton = new Button("Add Book");
        Button searchBookButton = new Button("Search Book");
        Button displayBooksButton = new Button("Display All Books");

        // Add components to the layout
        root.getChildren().addAll(titleField, authorField, isbnField, addBookButton, searchBookButton, displayBooksButton);

        // Event handlers for buttons
        addBookButton.setOnAction(e -> {
            String title = titleField.getText();
            String author = authorField.getText();
            String isbn = isbnField.getText();
            System.out.println("Book added: " + title + ", " + author + ", " + isbn);
        });

        searchBookButton.setOnAction(e -> {
            String isbn = isbnField.getText();
            System.out.println("Searching for book with ISBN: " + isbn);
        });

        displayBooksButton.setOnAction(e -> {
            System.out.println("Displaying all books");
        });

        // Set up the scene and stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Library Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // This launches the JavaFX application
    }
}


