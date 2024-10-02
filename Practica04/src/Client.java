
/**
 * Cliente
 * 
 * 
 */
public class Client {

	// Atributos
	private String name;
	private String rfc;
	private String area;
	private int piso;

	// Constructor
	public Client(String name, String rfc, String area, int piso) {
		this.name = name;
		this.rfc = rfc;
		this.area = area;
		this.piso = piso;
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

	public void setPiso(int piso) {
		this.piso = piso;
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

	public int getPiso() {
		return piso;
	}

	public void requestPrinting(String request) {
		System.out.println("El empleado " + name + " " + " del area: " + area + " quiere imprimir");
	}

}