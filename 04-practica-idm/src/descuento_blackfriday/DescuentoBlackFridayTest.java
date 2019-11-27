package descuento_blackfriday;

import static org.junit.Assert.*;
import org.junit.Test;

public class DescuentoBlackFridayTest {

	@Test
	public void TestSinDescuento() throws InvalidParameter{
		assertEquals("precio final 3.0", 3.0, DescuentoBlackFriday.PrecioFinal(3.0, 0.0), 0.01);
	}
	
	@Test
	public void TestSDescuentoNegativo() throws InvalidParameter{
		try {
			DescuentoBlackFriday.PrecioFinal(3.0, -3.0);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void TestPrecioOriginalNegativo() throws InvalidParameter{
		try {
			DescuentoBlackFriday.PrecioFinal(-83.0, 3.0);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	@Test
	public void TestDescuentoNegativo() throws InvalidParameter{
		try {
			DescuentoBlackFriday.PrecioFinal(83.0, -3.0);
		}catch (InvalidParameter e){
			return;
		}
		fail("InvalidParameterException expected");
	}

}
