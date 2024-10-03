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
    	System.out.println("Iniciando el servidor...");
    	

    	try {
    		ServerSocket server = new ServerSocket(8080);
    		while (true) {
    			Socket s = server.accept();
    			RemoteMesaggePassing rmp = new RemoteMesaggePassing(s);
    			ProxyPrinter printer = (ProxyPrinter)rmp.receive();
    			rmp.close();
    		}
    	} catch(IOException e) {
    		e.printStackTrace()
    	}
    }

    /**
     * 
     */
    public static void startClient() {
        System.out.println("Cliente que solicita la impresion");
        String archivo = "Archivo a imprimir";
        String archivo2 = "Archivo a imprimir a color";
        try {
            Socket s = new Socket("localhost", 8080);
            RemoteMesaggePassing rmp = new RemoteMesaggePassing(s);
            Client c = new Client("Samuel", "SBKBKDGDK0886", "Mercadotecnia", 4);
            Client r = new Client("Rodrigo", "RDHBVHNON07656", "Desarrollo", 4);
            c.requestPrinting(archivo2);
            c.requestPrinting(archivo);
            System.out.println("Los empleados solicitaron una impresion");
            rmp.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if ("server".equals(args[0])) {
            startServer();
        } else if ("client".equals(args[0])) {
            startClient();
        }
    }

}
