package descuento_blackfriday;

import static org.junit.Assert.*;


import org.junit.Test;

public class DescuentoBlackFridayTest {

	@Test
	public void test(){
		assertEquals("precio original 3.0", 3.0, DescuentoBlackFriday.PrecioFinal(3.0, 10.0));
	}

}
