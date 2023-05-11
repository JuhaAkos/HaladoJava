package hu.me.java.my_app;

import java.security.InvalidParameterException;

public class Calculator {
	public Integer add(Integer a, Integer b) {
		
		return a+b;
	}
	
	public void assertParameter(Integer a, Integer b){
		if (a==null || b==null) {
			throw new InvalidParameterException();
		}
	}
}
