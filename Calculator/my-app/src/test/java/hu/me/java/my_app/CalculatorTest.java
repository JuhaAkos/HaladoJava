package hu.me.java.my_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {	
	
	@Test
	public Integer testAdd(Integer operator1, Integer operator2) {
		return operator1 + operator2;
	}
	
	@Test
	public void testAd_validParameter(){
		Calculator calculator = new Calculator();
		
		Integer result = calculator.add(5,3);
		
		assertEquals(8,result);
	}
	
	@Test
	public void testAd_invalidParameter(){
		Calculator calculator = new Calculator();
		
		try {
			Integer result = calculator.add(5,null);
			full("no exception");
		}
		catch ();
		
		
		assertEquals(8,result);
	}

}
