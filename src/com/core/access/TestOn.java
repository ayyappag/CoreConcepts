package com.core.access;

public class TestOn {

	public static void main(String[] args) {
		String a = " abcdcba ";
		int x = 2;
		int firstIndex,lastIndex;
		a = a.trim();
		if (a.length() < 8) {
			x = a.indexOf('c', 3);			
		}
		System.out.println(x);
		System.out.println("first index of c : " + a.indexOf('c'));
		System.out.println("last index of c :" + a.lastIndexOf('c'));
	}
}
