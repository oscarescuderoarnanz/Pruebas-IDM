package numeros_romanos_to_b10;

public class romanNumber {

	// Parametro: s es un numero romano
	// Devuelve : el numeros en base 10
	// Eleva la excepcion InvalidParameter si s no es un numero romano
	public static int convierte(String romanNumber) throws InvalidParameter{
		boolean first = true;
		int decimalNumber = 0;
		int valor = 0;
		int valor_before = 0;
		String RN = romanNumber.toUpperCase();
		char Rom[]= {' ','I','V','X','L','C','D','M'}; 
	    int value[] = {0,1,5,10,50,100,500,1000};
	    int index = 0;
	    int index_before = 0;
		
		for(int i = RN.length()-1; i >= 0; i--) {
			char convertToDecimal = romanNumber.charAt(i);
			char convertToDecimal_before = ' ';
			
			if(i != 0) {
				convertToDecimal_before = romanNumber.charAt(i-1);
			}
			
			if(convertToDecimal == ' ') {
				return decimalNumber;
			}else {
				if(first == true) { //Si es el primer elemento
					for(int j = 0; j < Rom.length-1;j++) {
						if(convertToDecimal == Rom[j]) {
							index = j;
							first = false;
							break;
						}
					}
					decimalNumber += value[index];
				}
				
			}
			if(convertToDecimal_before != ' ') {
				//Sacamos los valores
				
				for(int j = 0; j < Rom.length-1;j++) {
					if(convertToDecimal == Rom[j]) {
						index = j;
					}
					if(convertToDecimal_before == Rom[j]) {
						index_before = j;
					}
				}
				valor = value[index];
				valor_before = value[index_before];
				
				if(valor <= valor_before) {
					decimalNumber += valor_before;
				}else {
					decimalNumber -= valor_before;
				}
			}
			
		}
		return decimalNumber;
	}
	

	public static void main(String[] args) throws InvalidParameter {
		// TODO Auto-generated method stub
		System.out.println(convierte("IV"));
	}

}
