package src.singleton;

import src.Client;

/**
 * La clase RequestPrint es la solicitud de impresion que se manda al servidor, este contiene el cliente que
 * manda la solicitud, el tipo de impresion que se va hacer y la impresion que se va a realizar.
 */
public class RequestPrint {

	/** El cliente que manda la solicitud de impresion*/
	private Client cliente;
	/** Tipo de impresion que se requiere */
	private String typePrint;
<<<<<<< HEAD

	public RequestPrint(Client client, String typePrint) {
=======
	/** La impresion que se mando en la solicitud */
	private String impression;

	/**
 	 * Es el Constructor de la clase RequestPrint
   	 * @param client es el cliente que manda la solicitud de impresion
     	 * @param typePrint es el tipo de impresion que se le pide a la impresora
         * @param impression es la impresion que se va hacer
   	 **/
	public RequestPrint(Client client, String typePrint, String impression) {
>>>>>>> 61c3d43c7a036789fbcff339ff9dfdb3c1577cc4
		this.cliente = client;
		this.typePrint = typePrint.toUpperCase();
	}

	/**
	 * Procesa la solicitud del cliente que pidio una impresion recopilando toda la
	 * informacion
  	 * @return regresa una cadena el cual obtiene el tipo de impresion que va hacer la impresora
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
