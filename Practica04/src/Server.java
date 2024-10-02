
import java.util.Queue;
import java.rmi.*;
import java.rmi.server.*;

/**
 * Server
 */
public class Server {

	/*
	 * Es la cola que va a estar almacenando las solicitudes de impresion de los
	 * empleados
	 */
	// por ver si se requiere algo mas
	private Queue<RequestPrint> cola = new Queue<RequestPrint>();

	public void receiveRequest() {

	}

}