package edu.sdccd.cisc191.c.client;

import edu.sdccd.cisc191.c.CustomerRequest;
import edu.sdccd.cisc191.c.CustomerResponse;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Application {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public CustomerResponse sendRequest(CustomerRequest request) throws Exception {
        out.println(CustomerRequest.toJSON(new CustomerRequest(1)));
        return CustomerResponse.fromJSON(in.readLine());
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    @Override
    public void start(Stage primaryStage) {
        LibraryManagementGUI libraryManagementGUI = new LibraryManagementGUI();
        libraryManagementGUI.start(primaryStage);
    }

    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.startConnection("127.0.0.1", 4444);
            CustomerRequest request = new CustomerRequest(1);
            CustomerResponse response = client.sendRequest(request);
            System.out.println(response.toString());
            client.stopConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Launch the JavaFX GUI
        launch(args);
    }
}

