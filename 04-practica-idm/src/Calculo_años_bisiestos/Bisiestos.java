package Calculo_años_bisiestos;

public class Bisiestos {
	
	// Devuelve true si año es bisiesto, false en caso contrario
	// Eleva la excepcion InvalidParameter si año no es un parametro valido
	public static boolean esBisiesto(int ano) throws InvalidParameter {
		if(ano <= 0) {
			throw new InvalidParameter("Parametro no valido");
		}
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))){
			System.out.println("El año es bisiesto");
			return true;
		}else{
			System.out.println("El año no es bisiesto");
			return false;
		}
	}
	public static void main (String []argv) throws InvalidParameter {
		int c = -4;
		esBisiesto(c);
	}

}
