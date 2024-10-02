
/**
 * Print
 */
public class Print {

	/*Constructor privado de la clase Print que es instance*/	
	private static Print instance;

	/**
	 * Obtenemos la unica instancia de la clase Print que es nuestra impresora
	 * Si no hay una instancia, se crea una nueva, en caso que ya exista, simplemente la llamamos
	 * @return regresa la instancia unica de Print
	 **/ 
	public static Print getInstance() {
		if (instance == null) {
			instance = new Print();
		}
		return instance;
	}

	/**
	 * Imprime a blanco y negro el documento
	 **/
	public void printBW() {
		RequestPrint rp = new RequestPrint();
		rp.processRequest();
		System.out.println("Esta imprimiendo a blanco y negro...");
	}

	/**
	 * Imprime a color el documento
	 **/
	public void printC() {
		RequestPrint rp = new RequestPrint();
		rp.processRequest();
		System.out.println("Esta imprimiendo a color...");
	}

}
