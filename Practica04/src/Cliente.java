public class Cliente  {
	
	private String name;
	private String rfc;
	private String area;
	private int piso;

	public Cliente(String name, String rfc, String area, int piso) {
		this.name = name;
		this.rfc = rfc;
		this.area = area; 
		this.piso = piso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRFC() {
		return rfc;
	}

	public void setRFC(String rfc) {
		this.rfc = rfc;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public void requestPrinting() {
		System.out.println("El empleado " + name + " " + "del area: " + area + "quiere imprimir");
	}

}