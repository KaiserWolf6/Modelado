public class RequestPrint {
	
	private Cliente cliente;
	/*Tipo de impresion que se requiere*/
	private String typePrint;

	public RequestPrint() {
		this.cliente = new Cliente();
		this.typePrint = "";
	}

	/**
	 * Procesa la solicitud del cliente que pidio una impresion recopilando toda la informacion
	 **/ 
	public void processRequest() {
		cliente.requestPrinting();
		if (typePrint == null) {
			System.out.println("No ingreso el tipo de impresion que quiere el cliente");
		} else if (typePrint.equalsIgnoreCase("color")) {
			if (c.getArea().equalsIgnoreCase("mercadotecnia")) {
				System.out.println("El cliente es de mercadotecnica, imprimira a color");
			} else if (!c.getArea().equalsIgnoreCase("mercadotecnia")) {
				System.out.println("El cliente no es de mercadotecnica, no se puede imprimir a color");
			} else {
				System.out.println("No perteneces al area de trabajo correspondiente para hacer impresion a color");
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
