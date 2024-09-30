public class Print  {
	
	private static Print instance;

	public static Print getInstance() {
		if (instance == null) {
			instance = new Print();
		}
		return instance;
	}

	public void printBW() {
		System.out.println("Esta imprimiendo a blanco y negro...");
	}

	public void printC() {
		System.out.println("Esta imprimiendo a color...");
	}

}