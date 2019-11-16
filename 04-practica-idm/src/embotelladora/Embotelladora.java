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
		System.out.println("pep");
		return 0;
	}
	
	public static void Main(String[] args) {
		try {
			calculaBotellasPequenas(1,1,1);
		} catch (NoSolution e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
