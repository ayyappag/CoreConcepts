package com.geek;

public class SimpleFraction {

	public static void main(String[] args) {
		int numerator = 5, denominator = 3;
		
		method(numerator, denominator);
		System.out.println("genaral == " + (numerator/denominator));
	}

	public static void method(int x, int y) {
		double result = Math.floorDiv(x, y) ;// numerator/denominator;
		System.out.println("result == " + result);
	}

}
