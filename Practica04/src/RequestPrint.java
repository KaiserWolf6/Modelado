public class RequestPrint {
	
	private Cliente cliente;
	/*Tipo de impresion que se requiere*/
	private String typePrint;

	public RequestPrint() {
		this.cliente = new Cliente();
		this.typePrint = "";
	}

	public void processRequest(String typePrint) {
		Cliente c = new Cliente();
		if (typePrint == null) {
			return null
		} else if (typePrint.equalsIgnoreCase("color")) {
			if (c.getArea().equalsIgnoreCase("mercadotecnia")) {
				System.out.println("El cliente es de mercadotecnica, imprimira a color");
			} else if (!c.getArea().equalsIgnoreCase("mercadotecnia")) {
				System.out.println("El cliente no es de mercadotecnica, no se puede imprimir a color");
			}
		} else if (typePrint.equalsIgnoreCase("Blanco y negro")) {
			if (!c.getArea().equalsIgnoreCase("mercadotecnia")) {
				System.out.println("El cliente va a imprimir a color");
			} else if (c.getArea().equalsIgnoreCase("mercadotecnia")) {
				System.out.println("El cliente es de mercadotecnica, no se puede imprimir a blanco y negro");
			}
		} else {
			System.out.println("No se puede proceder la solicitud de impresion");
		}
	}

}
