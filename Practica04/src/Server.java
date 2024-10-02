package src;

import java.util.LinkedList;
import java.util.Queue;
import src.singleton.RequestPrint;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.rmi.*;
import java.rmi.server.*;

/**
 * Server
 */
public class Server<T extends Serializable> {

	/*
	 * Es la cola que va a estar almacenando las solicitudes de impresion de los
	 * empleados
	 */
	// por ver si se requiere algo mas
	private Queue<RequestPrint> cola = new LinkedList<>();
	public Socket socket;
	public ObjectOutputStream out;
	public ObjectInputStream in;
	public Object sending;
	public Object receiving;

	public Server(Socket socket) {
		if (socket == null) {
			return;
		}
		this.socket = socket;
		try {
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
		} catch (IOException o) {
			o.printStackTrace();
		}

	}

	public T receiveRequest() {

		T value = null;

		synchronized (receiving) {

			try {
				value = (T) in.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return value;
	}

	/**
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException {
		try {
			if (socket != null)
				socket.close();
			if (out != null)
				out.close();
			if (in != null)
				in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}