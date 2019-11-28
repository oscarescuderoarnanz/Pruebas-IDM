package descuento_blackfriday;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;

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
	public void TestDescuentoBlackFriday() throws InvalidParameter{
		Calendar c = Calendar.getInstance();
	    Date fecha = new Date();
	    int dia = c.get(Calendar.DATE); 
	    int mes = c.get(Calendar.MONTH);
	    
	    System.out.println (fecha);
	    if (dia == 29 && mes == 10) {
			assertEquals("precio final con descuento: 72", 72, DescuentoBlackFriday.PrecioFinal(80.0, 10.0),0.1);
	    }else {
	    	assertEquals("precio final sin descuento: 80",80, DescuentoBlackFriday.PrecioFinal(80.0, 10.0),0.1);
	    }
	}

}
