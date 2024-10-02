package src;

import src.singleton.RequestPrint;

/**
 * Client
 */
public class Client {

	// Atributos
	private String name;
	private String rfc;
	private String area;
	private int floor;

	// Constructor
	public Client(String name, String rfc, String area, int floor) {
		this.name = name;
		this.rfc = rfc;
		this.area = area;
		this.floor = floor;
	}

	/**
	 * 
	 */
	public void requestPrinting(String impression) {
		
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setRFC(String rfc) {
		this.rfc = rfc;
	}

	public void setPiso(int floor) {
		this.floor = floor;
	}

	// Getters
	public String getRFC() {
		return rfc;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public int getFloor() {
		return floor;
	}

	@Override
	public String toString() {
		return "Empleado: " + this.name + "\nRFC: " + this.rfc + "\nArea: " + this.area + "\nPiso: " + this.floor;
	}

}