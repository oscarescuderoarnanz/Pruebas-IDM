package Calculo_años_bisiestos;

import java.security.InvalidParameterException;

public class Bisiestos {
	
	// Devuelve true si año es bisiesto, false en caso contrario
	// Eleva la excepcion InvalidParameter si año no es un parametro valido
	public static boolean esBisiesto(int ano) throws InvalidParameterException {
		if(ano <= 0) {
			throw new InvalidParameterException("Parametro no valido");
		}
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))){
			System.out.println("El año es bisiesto");
			return true;
		}else{
			System.out.println("El año no es bisiesto");
			return false;
		}
	}
	public static void main (String []argv) {
		int c = -4;
		esBisiesto(c);
	}

}
