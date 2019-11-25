package embotelladora;

import static org.junit.Assert.*;

import org.junit.Test;


public class EmbotelladoraTest {
	
	@Test
	public void Test5litros() throws NoSolution {
		assertEquals("esperamos en la salida 5 botellas pequeñas para: (5,0,5)", 5, Embotelladora.calculaBotellasPequenas(5,0,5));
	}
	
	@Test
	public void Test5000litros() throws NoSolution {
		assertEquals("esperamos en la salida 4995 botellas pequeñas para: (5000,1,5000)", 4995, Embotelladora.calculaBotellasPequenas(5000,1,5000));
	}
	
	@Test
	public void TestMenorNumeroBotellas1litro() throws NoSolution {
		assertEquals("esperamos en la salida 1 botella pequeña para: (5,1,6)", 1, Embotelladora.calculaBotellasPequenas(5,1,6));
	}
	
	@Test
	public void TestNadaQueEmbotellar() throws NoSolution {
		assertEquals("esperamos en la salida 0 botellas pequeñas para: (5,1,0)", 0, Embotelladora.calculaBotellasPequenas(5,1,0));
	}
	
	@Test
	public void TestNadaEmbotellarYnoBotellas() throws NoSolution {
		assertEquals("esperamos en la salida 0 botellas pequeñas para: (0,0,0)", 0, Embotelladora.calculaBotellasPequenas(0,0,0));
	}
	
	@Test
	public void TestNoPosibleEmbotellarTodoLiquido() throws NoSolution {
		try {
			assertEquals("esperamos en la salida 0 botellas pequeñas para: (1,0,5)", 1, Embotelladora.calculaBotellasPequenas(1,0,5));
		}catch(Exception e) {
			return;
		}
		fail("Imposible embotellar todo el liquido, numero de botellas insuficientes");
	}
	
}
