package src.singleton;

/**
 * Print
 */
public class Print {

	private static Print instance;

	private Print() {
	}

	public static Print getInstance() {
		if (instance == null) {
			instance = new Print();
		}
		return instance;
	}

	/**
	 * Imprime a blanco y negro el documento
	 **/
	public void printBW(String ibw) {
		System.out.println("Esta imprimiendo a blanco y negro...");
		System.out.println(ibw);
	}

	/**
	 * Imprime a color el documento
	 **/
	public void printC(String ic) {
		System.out.println("Esta imprimiendo a color...");
		System.out.println("\u001B[35m" + ic + "\u001B[0m");
	}

}
