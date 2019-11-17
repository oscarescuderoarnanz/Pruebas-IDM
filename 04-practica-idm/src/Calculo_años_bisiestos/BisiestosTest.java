package Calculo_años_bisiestos;

import static org.junit.Assert.*;
import java.security.InvalidParameterException;

import org.junit.Test;

public class BisiestosTest {

	@Test
	public void testAnyoBisiesto2000() {
		int anyo = 2000;
		assertEquals("esperamos la salida true, para 2000", true, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoBisiesto1044() {
		int anyo = 1044;
		assertEquals("esperamos la salida true, para 1044", true, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoNoBisiesto1999() {
		int anyo = 1999;
		assertEquals("1999, esperamos no bisiesto", false, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoNoBisiesto1000() {
		int anyo = 1000;
		assertEquals("1000, esperamos no bisiesto", false, Bisiestos.esBisiesto(anyo));
	}
	
	@Test
	public void testAnyoErroneo() {
		int anyo = -2;
		try {
			Bisiestos.esBisiesto(anyo);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void testAnyoCero() {
		int anyo = 0;
		try {
			Bisiestos.esBisiesto(anyo);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
}
