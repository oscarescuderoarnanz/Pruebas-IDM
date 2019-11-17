package numeros_romanos_to_b10;

import static org.junit.Assert.*;
import java.security.InvalidParameterException;
import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void testEntradaInvalida() {
		String s = "pepe";
		try {
			romanNumber.convierte(s);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntradaVacia() {
		String s = "";
		try {
			romanNumber.convierte(s);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntradaEspacio() {
		String s = " ";
		try {
			romanNumber.convierte(s);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntrada2Valores() {
		String s = "XC";
		assertEquals("Entrada valida XC", 90, romanNumber.convierte(s));
	}
	
	@Test
	public void testEntradaDescendente() {
		String s = "CXVIII";
		assertEquals("Entrada valida CXVIII", 118, romanNumber.convierte(s));
	}
	
	@Test
	public void testEntrada1Valor() {
		String s = "C";
		assertEquals("Entrada valida C", 100, romanNumber.convierte(s));
	}
	
	@Test
	public void testEntradaAscendente() {
		String s = "IIIV";
		assertEquals("Entrada valida C", 2, romanNumber.convierte(s));
	}
}
