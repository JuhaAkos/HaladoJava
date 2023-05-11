package hu.me.masodfok;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Quadratic {
	private double a;
	private double b;
	private double c;
	
	public Quadratic(double a, double b, double c) {
		if (a==0) {
			throw new InvalidParameterException("A cannot be zero");
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private double determinant() {
		return b * b-4 * a * c;
	}
	
	public List<Double> solve() throws NoSolutionException {
		double determinant = determinant();
		List<Double> solution = new ArrayList<>();
		
		if (determinant < 0) {
			throw new NoSolutionException();
			
		} else if (determinant == 0) {
			solution = oneSolution();
			
		} else {
			solution = twoSolutions(determinant);
		}	
			
		return solution;
	}
	
	private List<Double> oneSolution() {
		List<Double> rv  = new ArrayList<>();		
		rv.add(-b / (2*a));
		
		return rv;
	}
	
	private List<Double> twoSolutions(double determinant) {
		List<Double> rv  = new ArrayList<>();		
		rv.add((-b + Math.sqrt(determinant))/ (2*a));
		rv.add((-b - Math.sqrt(determinant))/ (2*a));
		
		return rv;
	}
}
