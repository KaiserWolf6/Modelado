import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;

import java.io.Serializable;

public class ProxyPrinter implements Serializable, Permissions{

	private Print printer = Print.getInstance();
	private boolean verifyPermissions;

	public void print() {
		
	}

	public void prayRequest() {
		
	}

	/**
	 * Permite que se realice la impresion de color en la impresora de acuerdo a la solicitud
	 * que se tenga.
	 * Verificaremos si el cliente corresponde al area de trabajo que tiene acceso a la impresion de color
	 **/ 	
	@Override
	public void allowColorPrints() {
		verifyPermissions = false;
		RequestPrint request = new RequestPrint();
		if (request == null) {
			System.out.println("No hay solicitud de impresion a color");
		} else {
			request.processRequest();
			verifyPermissions = true;
		}
	}

}
