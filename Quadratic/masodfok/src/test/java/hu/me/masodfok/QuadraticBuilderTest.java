package hu.me.masodfok;

import java.security.InvalidParameterException;
import java.util.List;

import org.junit.Test;

public class QuadraticBuilderTest {
	@Test
	public void testBuild(){			
		//GIVEN WHEN THEN
		Quadratic quadratic = new QuadraticBuilder()
				.setA(3)
				.setA(1)
				.setA(2)
				.build();
				
		assertInstanceOf(Quadratic.class, quadratic);		
	}
	
	
}
