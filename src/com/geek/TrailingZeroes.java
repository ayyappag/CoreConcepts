package com.geek;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1

public class TrailingZeroes {

	// trailing-zeroes-in-factorial
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = trailingZeroes(n);
		System.out.println("count=" + count);

		int c = 0;
		while (n >= 5) {
			c += n / 5;
			n /= 5;
		}
		System.out.println("c == " + c);

	}

	public static int trailingZeroes(int N) {
		if (N < 5)
			return 0;
		return (N / 5) + trailingZeroes(N / 5);
	}

}
