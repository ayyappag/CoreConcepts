package com.core.access;

public class TestOn {

	public static void main(String[] args) {
		String a = " abcdcba ";
		int x = 2;
		a = a.trim();
		if (a.length() < 8) {
			x = a.indexOf('c', 3);
		}
		System.out.println(x);
	}
}
