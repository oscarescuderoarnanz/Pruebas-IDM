package descuento_blackfriday;

public class InvalidParameter extends Exception {
	
	public static final long serialVersionUID = 700L;

	public InvalidParameter(String mensaje) {
		super(mensaje);
	}
}