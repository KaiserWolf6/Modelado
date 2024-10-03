package src;

/**
 * Interfaz de Permissions el cual nos dara el acceso o permiso a realizar una impresion a color, de acuerdo a lo que se pide
 * 
 */
public interface Permissions {

	/**
	 * Permite que se realice la impresion de color en la impresora de acuerdo a la
	 * solicitud que se tenga.
	 * Verificaremos si el cliente corresponde al area de trabajo que tiene acceso a
	 * la impresion de color
	 **/	
	void allowColorPrints();

}
