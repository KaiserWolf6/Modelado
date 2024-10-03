package src;

import java.rmi.*;
import java.rmi.server.*;
import src.singleton.Print;
import java.net.*;
import java.io.*;
import java.io.Serializable;

/**
 * Proxy Printer
 */
public class ProxyPrinter implements Serializable, Permissions {

	/*Es la impresora unica*/
	private Print printer;
	/*Nos permitira verificar si se tiene los permisos para hacer una impresion a color*/
	private boolean verifyPermissions;
	/*Archivo que se va a imprimir*/
	private String archivo;

	/*Constructor de la clase ProxyPrinter*/
	public ProxyPrinter() {
		printer = Print.getInstance();
	}

<<<<<<< HEAD
	public void print(String d) {
		printer.printC(d);
=======
	public void print() {
		allowColorPrints();		
>>>>>>> 61c3d43c7a036789fbcff339ff9dfdb3c1577cc4
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
<<<<<<< HEAD
			printer.printC("S");
=======
			printer.printC(archivo);
>>>>>>> 61c3d43c7a036789fbcff339ff9dfdb3c1577cc4
		} else {
			printer.printBW(archivo);
		}
	}

}
