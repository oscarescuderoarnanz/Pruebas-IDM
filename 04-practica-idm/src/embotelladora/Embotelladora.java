package embotelladora;

public class Embotelladora {
	// Parámetros: pequenas: número de botellas en almacén de 1L
	//			   grandes : número de botellas en almacén de 5L
	//			   total: número total de litros que hay que embotellar
	// Devuelve:número de botellas pequeñas necesarias para embotellar el total de lı́quido, teniendo
	//          en cuenta que hay que minimizar el número de botellas pequeñas: primero
	//          se rellenan las grandes
	// Eleva la excepción NoSolution si no es posible embotellar todo el lı́quido
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int num_litros_max = (pequenas * 1) + (grandes * 5);
		int litros_restantes;
		int num_g_out = 0;
		int num_p_out = 0;
		
		if (pequenas < 0 || grandes < 0 || total < 0) {
			throw new NoSolution("Parametros incorrectos");
		}
		if (num_litros_max < total) {
			throw new NoSolution("Imposible embotellar todo el liquido, numero de botellas insuficientes");
		}
		
		num_g_out = total / 5;
		if (num_g_out <= grandes) {
			grandes -= num_g_out;
			if (grandes > 0) {
				num_g_out += 1;
				grandes -= 1;
				litros_restantes = 0;
				
				System.out.println("Botellas grandes embotelladas= " + num_g_out);
				System.out.println("Botellas grandes almacen= " + grandes);
				System.out.println("Botellas pequeñas embotelladas= " + 0);
				System.out.println("Botellas pequeñas almacen= " + pequenas);
				System.out.println("Litros restantes por embotellar= " + litros_restantes);
				return 0;
			}
		}else {
			num_g_out = grandes;
			grandes -= grandes;
		}
		litros_restantes = total - (num_g_out * 5);
		
		num_p_out = litros_restantes;
		litros_restantes = 0;
		
		System.out.println("Botellas grandes embotelladas= " + num_g_out);
		System.out.println("Botellas grandes almacen= " + grandes);
		System.out.println("Botellas pequeñas embotelladas= " + num_p_out);
		System.out.println("Botellas pequeñas almacen= " + pequenas);
		System.out.println("Litros restantes por embotellar= " + litros_restantes);
		
		return num_p_out;
	}
	
	public static void main(String[] args) throws NoSolution {
		calculaBotellasPequenas(3,3,13);
    }
}
