package hu.me.generictest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class valueTest {
	
	@Test
	public void testInteger(){
		value testValue = new value<Integer>(1);		
		assertEquals(1, testValue.getId());
	}
	
	@Test
	public void testString(){
		value testValue = new value<String>("testData");		
		assertEquals("testData", testValue.getId());
	}
	
}
