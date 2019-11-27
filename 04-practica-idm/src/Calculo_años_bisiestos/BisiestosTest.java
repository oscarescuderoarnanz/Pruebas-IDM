package Calculo_años_bisiestos;

import static org.junit.Assert.*;
import org.junit.Test;

public class BisiestosTest {

	@Test
	public void testAnyoBisiesto2000() throws InvalidParameter {
		int anyo = 2000;
		assertEquals("esperamos la salida true, para 2000", true, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoBisiesto1044() throws InvalidParameter {
		int anyo = 1044;
		assertEquals("esperamos la salida true, para 1044", true, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoNoBisiesto1999() throws InvalidParameter {
		int anyo = 1999;
		assertEquals("1999, esperamos no bisiesto", false, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoNoBisiesto1000() throws InvalidParameter {
		int anyo = 1000;
		assertEquals("1000, esperamos no bisiesto", false, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoErroneo() throws InvalidParameter {
		int anyo = -2;
		try {
			Bisiestos.esBisiesto(anyo);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testAnyoCero() throws InvalidParameter {
		int anyo = 0;
		try {
			Bisiestos.esBisiesto(anyo);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
}
