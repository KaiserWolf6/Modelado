public class RequestPrint {
	
	private Cliente cliente;
	/*Tipo de impresion que se requiere*/
	private String typePrint;

	public RequestPrint() {
		this.cliente = new Cliente();
		this.typePrint = "";
	}

	public void processRequest(String typePrint) {
		if (typePrint == null) {
			return null
		} else if (typePrint.equalsIgnoreCase("color")) {
			
		}
	}

}