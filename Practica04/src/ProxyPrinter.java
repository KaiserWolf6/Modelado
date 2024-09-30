import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;

import java.io.Serializable;

public class ProxyPrinter implements Serializable, Permissions{

	private Print printer;
	private boolean verifyPermissions;

	public void print() {
		
	}

	public void prayRequest() {
		
	}

	@Override
	public void allowColorPrints() {
		
	}

}