package edu.sdccd.cisc191.c.server;
import edu.sdccd.cisc191.c.CustomerRequest;
import edu.sdccd.cisc191.c.CustomerResponse;
import edu.sdccd.cisc191.c.server.operations.*;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private static int[] array = new int[10];

    public void start(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            CustomerRequest request = CustomerRequest.fromJSON(inputLine);
            CustomerResponse response = new CustomerResponse(request.getId(), "Jane", "Doe");
            out.println(CustomerResponse.toJSON(response));
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.start(4444);
            server.consoleMenu();
            server.stop();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void consoleMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Get at Index");
            System.out.println("2. Set at Index");
            System.out.println("3. Find Index Of");
            System.out.println("4. Print All");
            System.out.println("5. Delete at Index");
            System.out.println("6. Expand");
            System.out.println("7. Shrink");
            System.out.println("8. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    new GetAtIndex(array, index).performOperation();
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    new SetAtIndex(array, index, value).performOperation();
                    break;
                // Add cases for other operations
                case 3:
                    // Implement findIndexOf
                    System.out.print("Enter value to find: ");
                    value = scanner.nextInt();
                    new FindIndexOf(array, value).performOperation();
                    break;
                case 4:
                    new PrintAll(array).performOperation();
                    break;
                case 5:
                    // Implement deleteAtIndex
                    System.out.print("Enter index to delete: ");
                    index = scanner.nextInt();
                    new DeleteAtIndex(array, index).performOperation();
                    break;
                case 6:
                    System.out.print("Enter value to add: ");
                    value = scanner.nextInt();
                    new Expand(array, value).performOperation();
                    break;
                case 7:
                    new Shrink(array).performOperation();
                    break;
                case 8:
                    return;
            }
        }
    }
}
