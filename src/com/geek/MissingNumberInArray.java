package com.geek;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		Integer a[] = { 1, 2, 3, 5 }; // // cannot use int[] here for converting to List by using Arrays.asList
		// int i = working(a, length);
		int i = test(a, length);
		System.out.println("completed" + i);
		sc.close();

	}

	public static int working(Integer[] a, int length) {
		int sum = calculateSum(a, a.length);

		int k = (length * (length + 1) / 2) - sum; // return int((n * (n + 1)) / 2) - sum(array)

		return k;
	}

	public static int test(Integer[] a, int length) {
		List<Integer> list = Arrays.asList(a);

		for (int i = 0; i < a.length; i++) {
			if (a.length <= length) {
				boolean istrue = list.contains(a[i]);
				if (!istrue) {
					System.out.println(i + " = value = " + a[i]);
					return a[i];
				}
			}
		}
		return 0;

	}

	private static int calculateSum(Integer[] a, int n) {

		// base or terminating condition
		if (n <= 0) {
			return 0;
		}

		// Calling method recursively
		return calculateSum(a, n - 1) + a[n - 1];
	}

}
