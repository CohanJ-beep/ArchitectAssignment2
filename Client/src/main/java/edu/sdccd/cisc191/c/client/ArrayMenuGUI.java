package edu.sdccd.cisc191.c.client;

import edu.sdccd.cisc191.c.server.ArrayMenu;
import edu.sdccd.cisc191.c.server.ArrayOperations;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ArrayMenuGUI extends Application {
    private Stage primaryStage;
    private Scene scene;
    private ArrayMenu arrayMenu;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.arrayMenu = new ArrayMenu();

        VBox root = new VBox();
        Button getAtIndexButton = new Button("Get at Index");
        Button setAtIndexButton = new Button("Set at Index");
        // Add more buttons for other operations

        root.getChildren().addAll(getAtIndexButton, setAtIndexButton);
        // Add event handlers for buttons

        this.scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Array Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public ArrayMenu getArrayMenu() {
        return arrayMenu;
    }

    public Scene getScene() {
        return scene;
    }

    public Stage getStage() {
        return primaryStage;
    }

    public class ArrayMenu {
        private ArrayOperations arrayOperations;

        public ArrayMenu() {
            this.arrayOperations = new ArrayOperations();
        }

        public ArrayOperations getArrayMenu() {
            return this.arrayOperations;
        }
    }
}
