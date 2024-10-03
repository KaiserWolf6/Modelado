package src.singleton;

import src.Client;

/**
 * Request Print
 */
public class RequestPrint {

	private Client cliente;
	/** Tipo de impresion que se requiere */
	private String typePrint;

	public RequestPrint(Client client, String typePrint) {
		this.cliente = client;
		this.typePrint = typePrint.toUpperCase();
	}

	/**
	 * Procesa la solicitud del cliente que pidio una impresion recopilando toda la
	 * informacion
	 **/
	public String processRequest() {

		if (typePrint == null) {
			return "No ingreso el tipo de impresion que quiere el cliente";
		} else if (typePrint.equalsIgnoreCase("color")) {
			if (cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
				return "El cliente es de mercadotecnica, imprimira a color";
			} else if (!cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
				return "El cliente no es de mercadotecnica, no se puede imprimir a color";
			} else {
				return "No perteneces al area de trabajo correspondiente para hacer impresion a color";
			}
		} else if (typePrint.equalsIgnoreCase("Blanco y negro")) {
			if (!cliente.getArea().equalsIgnoreCase("mercadotecnia")) {
				return "El cliente va a imprimir a color";
			} else {
				return "El cliente es de mercadotecnica, no se puede imprimir a blanco y negro";
			}
		} else {
			return "No se puede proceder la solicitud de impresion";
		}
	}

}
