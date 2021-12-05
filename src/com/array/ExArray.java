package com.array;

import java.util.Arrays;

public class ExArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseArray();

	}

	public static void reverseArray() {

		int a[] = { 1, 2, 3, 3 };
		int[] b = new int[a.length];

		for (int i = 0, j = b.length - 1; i < a.length; i++, j--) {
			b[i] = a[j];
		}
		System.out.println("a" + a + " b " + b);
		Arrays.stream(a).forEach(e -> System.out.print(e + ","));
		Arrays.stream(b).forEach(e -> System.out.print(e + ","));

		System.out.println("Sum of array : " + Arrays.stream(a).sum());
		System.out.println("Count or length of array : " + Arrays.stream(a).count());
	}

}
