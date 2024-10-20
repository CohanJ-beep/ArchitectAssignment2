package edu.sdccd.cisc191.c;

import static org.junit.jupiter.api.Assertions.*;

import edu.sdccd.cisc191.c.client.Client;
import edu.sdccd.cisc191.c.server.Server;
import edu.sdccd.cisc191.c.CustomerRequest;
import edu.sdccd.cisc191.c.CustomerResponse;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class ClientServerTest {
    @Test
    public void testClientServerCommunication() throws Exception {
        Server server = new Server(12345);
        new Thread(() -> {
            try {
                server.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        Client client = new Client();
        client.startConnection("localhost", 12345);
        CustomerRequest request = new CustomerRequest(1);
        CustomerResponse response = client.sendRequest(request);
        assertEquals("Expected Response Message", response.getMessage());

        client.stopConnection();
        server.stop();
    }
}
