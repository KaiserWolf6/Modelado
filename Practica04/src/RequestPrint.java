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
		System.out.println("El cliente:" + cliente.getName() + " " + "solicito una impresion" + typePrint + " " + "el cliente es del piso: " cliente.getPiso() + "Area de Trabajo: " + cliente.getArea());
	}


}
