package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConvertion {

	public static void main(String[] args) {

		NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat ind = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		double points = 12324.134;
		System.out.println(nF.format(points));
		
	}
}
