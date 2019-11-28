package numeros_romanos_to_b10;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void testEntradaInvalida() throws InvalidParameter {
		String s = "pepe";
		try {
			romanNumber.convierte(s);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntradaVacia() throws InvalidParameter {
		String s = "";
		try {
			romanNumber.convierte(s);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntradaEspacio() throws InvalidParameter {
		String s = " ";
		try {
			romanNumber.convierte(s);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntrada2Valores() throws InvalidParameter {
		String s = "XC";
		assertEquals("Entrada valida XC", 90, romanNumber.convierte(s));
	}
	
	@Test
	public void testEntradaDescendente() throws InvalidParameter {
		String s = "CXVIII";
		assertEquals("Entrada valida CXVIII", 118, romanNumber.convierte(s));
	}
	
	@Test
	public void testEntrada1Valor() throws InvalidParameter {
		String s = "C";
		assertEquals("Entrada valida C", 100, romanNumber.convierte(s));
	}
	
	@Test
	public void testEntradaAscendente() throws InvalidParameter {
		String s = "IV";
		assertEquals("Entrada valida IV", 4, romanNumber.convierte(s));
	}
}
