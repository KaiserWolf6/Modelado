package src;

import src.singleton.RequestPrint;

/**
 * Client
 */
public class Client {

	/* Atributo del nombre del cliente */
	private String name;
	/* Atributo del rfc del cliente */
	private String rfc;
	/* Atributo del area del cliente */
	private String area;
	/* Atributo del piso donde trabaja del cliente */
	private int floor;

	/**
	 * Constructor de la clase Cliente
	 * 
	 * @param name  es el nombre del cliente
	 * @param rfc   es el rfc del cliente
	 * @param area  es el area donde trabaja el cliente
	 * @param floor es el numero de piso donde se localiza el cliente
	 **/
	public Client(String name, String rfc, String area, int floor) {
		this.name = name;
		this.rfc = rfc;
		this.area = area;
		this.floor = floor;
	}

	/**
	 * Manda una solicitud de impresion el cliente a la impresora
	 * 
	 * @param request es la solicitud de impresion que manda el cliente a la
	 *                impresora
	 **/
	public void requestPrinting(String request) {
		System.out.println("El empleado " + name + " " + " del area: " + area + " quiere imprimir");
	}

	/**
	 * Sobreescribe o escribe el nombre del cliente
	 * 
	 * @param name es el nombre que se le va asignar al cliente
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sobreescribe o escribe el area del trabajo del cliente
	 * 
	 * @param area es el area que se le va asignar al cliente
	 **/
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * Sobreescribe o escribe el rfc del cliente
	 * 
	 * @param rfc es el rfc que se va a poner al cliente
	 **/
	public void setRFC(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * Sobreescribe o escribe el piso donde trabaja del cliente
	 * 
	 * @param piso es el piso que se le va asignar al cliente
	 **/
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * Regresa el nombre del cliente
	 * 
	 * @return regresa una cadena que es el rfc del cliente
	 **/
	public String getRFC() {
		return rfc;
	}

	/**
	 * Regresa el nombre del cliente
	 * 
	 * @return regresa una cadena que es el nombre del cliente
	 **/
	public String getName() {
		return name;
	}

	/**
	 * Regresa el nombre del cliente
	 * 
	 * @return regresa una cadena que es el area de trabajo del cliente
	 **/
	public String getArea() {
		return area;
	}

	/**
	 * Regresa el nombre del cliente
	 * 
	 * @return regresa una cadena que es el piso del cliente
	 **/
	public int getFloor() {
		return this.floor;
	}

	@Override
	public String toString() {
		return "Empleado: " + this.name + "\nRFC: " + this.rfc + "\nArea: " + this.area + "\nPiso: " + this.floor;
	}

}
