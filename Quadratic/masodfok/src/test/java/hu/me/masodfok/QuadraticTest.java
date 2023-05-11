package hu.me.masodfok;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class QuadraticTest {	
	@Test
	public void testInvalidArgument(){		
		//assertThrows(InvalidArgumentException);
		//assertThrows(IllegalArgumentException.class () -> masodfoku.calculate(0,3,4));
		//GIVEN WHEN THEN
		assertThrows(
				InvalidParameterException.class, 
				() -> new Quadratic(0, 3, 4));				
	}
	
	@Test
	public void testNoSolution(){	
		//GIVEN
		//assertThrows(InvalidArgumentException);
		Quadratic quadratic = new Quadratic(0, 3, 4);
		
		//WHEN THEN
		//assertThrows(IllegalArgumentException.class () -> masodfoku.calculate(0,3,4));
		assertThrows(
				NoSolutionException.class, 
				() -> quadratic.solve());				
	}
	
	@Test
	void oneSolution() throws NoSolutionException {
		//GIVEN
		Quadratic quadratic = new Quadratic(1,2,3);
		
		//WHEN
		List<Double> solution = quadratic.solve();		
		
		//THEN
		assertAll(
				() -> assertEquals(1, solution.size()),
				() -> assertEquals(-1, solution.get(0))
				);
		
	}
	
	@Test
	void twoSolutions() throws NoSolutionException {
		//GIVEN
		Quadratic quadratic = new Quadratic( 2, 3, 4); //values?
		
		//WHEN
		List<Double> solution = quadratic.solve();
		
		//THEN
		assertAll(
				() -> assertEquals(1, solution.size()),
				() -> assertEquals(-1, solution.get(0))
				);
		
	}
	
}
