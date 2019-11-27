package descuento_blackfriday;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;

public class DescuentoBlackFriday {
	// Parámetros: precioOriginal es el precio de un producto marcado
	//			   en la etiqueta
	//             porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	// Devuelve: el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
	//           un descuento de porcentajeDescuento
	// Eleva la excepción InvalidParameter si precioOriginal es negativo
	public static double PrecioFinal(double precioOriginal, double porcentajeDbescuento) throws InvalidParameterException{
	    Calendar c = Calendar.getInstance();
	    Date fecha = new Date();
	    int dia = c.get(Calendar.DATE); 
	    int mes = c.get(Calendar.MONTH);
	    
	    System.out.println (fecha);
	    
		if(precioOriginal < 0) {
			throw new InvalidParameterException("precioOriginal menor que 0");
		}
		if(porcentajeDbescuento < 0 || porcentajeDbescuento > 100) {
			throw new InvalidParameterException("porcentajeDbescuento erroneo");
		}
		
		if (dia == 29 && mes == 10) {
			System.out.println("Es el BlackFriday");
			return precioOriginal * ((100 - porcentajeDbescuento) / 100);
		} else {
			System.out.println("No es el BlackFriday");
			return precioOriginal;
		}
		
	}
	
	public static void main(String[] args) throws InvalidParameterException{
		System.out.println(PrecioFinal(3.0,0.0));
    }
}
