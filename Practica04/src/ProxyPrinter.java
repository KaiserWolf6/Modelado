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

	public void print() {
		allowColorPrints();		
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
			printer.printC(archivo);
		} else {
			printer.printBW(archivo);
		}
	}

}
