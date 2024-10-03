package src.ui;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import src.Client;
import src.Server;
import src.ProxyPrinter;
import java.net.UnknownHostException;

/**
 * Simulation E
 * 
 */
public class SimulationE {

	public static void main(String[] args) {
		if ("server".equals(args[0])) {
			startServer();
		} else if ("client".equals(args[0])) {
			startClient();
		}
	}

	/**
	 * Inicializa el server para administrar las solicitudes
	 */
	public static void startServer() {
		System.out.println("Iniciando el servidor...");
		String archivo = "Soy un archivo";
		try {
			ServerSocket server = new ServerSocket(8080);
			while (true) {
				Socket s = server.accept();
				Server rmp = new Server(s);
				ProxyPrinter printer = (ProxyPrinter) rmp.receiveRequest();
				System.out.println("Verificando el tipo de impresion");
				printer.allowColorPrints();
				System.out.print("Impresion verificada");
				rmp.send(archivo);
				System.out.println("Se ha enviado");
				rmp.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Da inicio a la solicitud de impresion al cliente
	 */
	public static void startClient() {
		System.out.println("Cliente que solicita la impresion");
		String archivo = "Archivo a imprimir";
		String archivo2 = "Archivo a imprimir a color";
		try {
			Socket s = new Socket("localhost", 8080);
			Server rmp = new Server(s);
			Client c = new Client("Samuel", "SBKBKDGDK0886", "Mercadotecnia", 4);
			Client r = new Client("Rodrigo", "RDHBVHNON07656", "Desarrollo", 4);
			c.requestPrinting(archivo2);
			c.requestPrinting(archivo);
			System.out.println("Los empleados solicitaron una impresion");
			ProxyPrinter printer = new ProxyPrinter();
			System.out.println("Enviando la solicitud al servidor");
			printer.print();
			rmp.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
