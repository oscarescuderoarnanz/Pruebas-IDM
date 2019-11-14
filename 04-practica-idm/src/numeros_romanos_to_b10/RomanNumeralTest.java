package numeros_romanos_to_b10;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

import Calculo_años_bisiestos.Bisiestos;


public class RomanNumeralTest {


	@Test
	public void testEntradaInvalido() {
		String s = "pepe";
		try {
			RomanNumeral.convierte(s);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testEntradaValida() {
		String s = "XC";
		assertEquals("Entrada valida XC", 90, RomanNumeral.convierte(s));
	}

}
