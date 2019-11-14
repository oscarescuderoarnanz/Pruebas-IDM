package Calculo_años_bisiestos;

import static org.junit.Assert.*;
import java.security.InvalidParameterException;

import org.junit.Test;

public class BisiestosTest {

	@Test
	public void testAnyoBisiesto() {
		int anyo = 2000;
		assertEquals("", true, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoErronea() {
		int anyo = -2;
		try {
			Bisiestos.esBisiesto(anyo);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testAnyoNoBisiesto() {
		int anyo = 1999;
		assertEquals("", false, Bisiestos.esBisiesto(anyo));
	}
}
