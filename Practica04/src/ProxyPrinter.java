import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import java.io.Serializable;

/**
 * Proxy Printer
 */
public class ProxyPrinter implements Serializable, Permissions {

	// Atributos
	private Print printer = Print.getInstance();
	private boolean verifyPermissions;

	public void print() {

	}

	/**
	 * Rechaza la solicitud en caso de que no cumpla con lo que se requiere para la
	 * impresion
	 * Blanco y negro: para casi todas las areas menos mercadotecnia
	 * Color: Para los de mercadotecnia
	 **/
	public void prayRequest() {
		printer.printBW();
	}

	/**
	 * Permite que se realice la impresion de color en la impresora de acuerdo a la
	 * solicitud que se tenga.
	 * Verificaremos si el cliente corresponde al area de trabajo que tiene acceso a
	 * la impresion de color
	 **/
	@Override
	public void allowColorPrints() {
		verifyPermissions = false;
		if (!verifyPermissions) {
			printer.printC();
		} else {
			System.out.println("Acceso denegado");
		}
	}

}
