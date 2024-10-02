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

	// Atributos
	private Print printer;
	private boolean verifyPermissions;

	public ProxyPrinter() {
		printer = Print.getInstance();
	}

	public void print() {

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
