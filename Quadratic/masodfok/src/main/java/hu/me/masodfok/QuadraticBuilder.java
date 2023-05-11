package hu.me.masodfok;

public class QuadraticBuilder {
	
	private double a;
	private double b;
	private double c;

	public QuadraticBuilder setA(double a) {
		this.a = a;
		return this;
	}
	public QuadraticBuilder setB(double b) {
		this.b = b;
		return this;
	}
	public QuadraticBuilder setC(double c) {
		this.c = c;
		return this;
	}
	
	public Quadratic build() {
		return new Quadratic(a, b, c);
	}
}
