package edu.sdccd.cisc191.c.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket; 

public class ClientHandler extends Thread {
    private Socket clientSocket;
    private LibraryController libraryController;

    public ClientHandler(Socket clientSocket, LibraryController libraryController) {
        this.clientSocket = clientSocket;
        this.libraryController = libraryController;
    }

    @Override
    public void run() {
        try (InputStream input = clientSocket.getInputStream();
             OutputStream output = clientSocket.getOutputStream()) {
            // Handle client requests and responses
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

