package descuento_blackfriday;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class DescuentoBlackFridayTest {

	@Test
	public void TestSinDescuento(){
		assertEquals("precio final 3.0", 3.0, DescuentoBlackFriday.PrecioFinal(3.0, 0.0), 0.01);
	}
	
	@Test
	public void TestSDescuentoNegativo(){
		try {
			DescuentoBlackFriday.PrecioFinal(3.0, -3.0);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void TestPrecioOriginalNegativo(){
		try {
			DescuentoBlackFriday.PrecioFinal(-83.0, 3.0);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void TestDescuentoNegativo(){
		try {
			DescuentoBlackFriday.PrecioFinal(83.0, -3.0);
		}catch (InvalidParameterException e){
			return;
		}
		fail("InvalidParameterException expected");
	}

}
