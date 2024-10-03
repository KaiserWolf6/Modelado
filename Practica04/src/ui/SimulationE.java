package src.ui;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Simulation E
 * 
 */
public class SimulationE {

    /**
     * StartServer
     */
    public static void startServer() {

        try {
            ServerSocket socket = new ServerSocket(8080);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    /**
     * 
     */
    public static void startClient() {
    }

    public static void main(String[] args) {

        if (args[0] == "server") {
            startServer();
        } else if (args[0] == "client") {
            startClient();
        }

    }

}
