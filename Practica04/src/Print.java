public class Print  {
	
	private static Print instance;

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
