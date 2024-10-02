package src.singleton;

import src.Client;

/**
 * Request Print
 */
public class RequestPrint {

	private Client cliente;
	/** Tipo de impresion que se requiere */
	private String typePrint;
	private String impression;

	public RequestPrint(Client client, String typePrint, String impression) {
		this.cliente = client;
		this.typePrint = typePrint.toUpperCase();
		this.impression = impression;
	}

	/**
	 * Procesa la solicitud del cliente que pidio una impresion recopilando toda la
	 * informacion
	 **/
	public String processRequest() {

		if (this.typePrint == null) {
			return cliente.requestPrinting() + "\n No se especifico el tipo de impresión.";
		}

		boolean color = this.cliente.getArea().equals("Mercadotecnia");

		switch (typePrint) {
			case "COLOR" -> {
				if (color) {
					return "El cliente " + this.cliente.getName() + " imprimira a color.";
				}
				return "No puedes imprimir a color.";
			}

			case "BLANCO Y NEGRO" -> {
				if (color) {
					return "No puedes imprimir a Blanco y Negro";
				}
				return "El cliente " + this.cliente.getName() + " imprimira a blanco y negro.";
			}

			default -> {
				return "Tipo de impresión no valida.";
			}
		}

		/*
		 * if (typePrint == null) {
		 * System.out.println("No ingreso el tipo de impresion que quiere el cliente");
		 * } else if (typePrint.equalsIgnoreCase("color")) {
		 * if (cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
		 * System.out.println("El cliente es de mercadotecnica, imprimira a color");
		 * } else if (!cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
		 * System.out.
		 * println("El cliente no es de mercadotecnica, no se puede imprimir a color");
		 * } else {
		 * System.out.
		 * println("No perteneces al area de trabajo correspondiente para hacer impresion a color"
		 * );
		 * }
		 * } else if (typePrint.equalsIgnoreCase("Blanco y negro")) {
		 * if (!cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
		 * System.out.println("El cliente va a imprimir a color");
		 * } else if (cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
		 * System.out.
		 * println("El cliente es de mercadotecnica, no se puede imprimir a blanco y negro"
		 * );
		 * }
		 * } else {
		 * System.out.println("No se puede proceder la solicitud de impresion");
		 * }
		 */
	}

}
