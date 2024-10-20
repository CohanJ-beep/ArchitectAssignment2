package edu.sdccd.cisc191.c.client.javafxapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyApplication extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Initial Text");
        label.setId("myLabel");
        Button button = new Button("Click me");
        button.setId("myButton");
        button.setOnAction(e -> label.setText("Expected Text"));

        VBox root = new VBox(button, label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

