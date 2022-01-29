package com.hackerrank;

import java.util.Scanner;


// https://www.hackerrank.com/challenges/java-loops/problem?h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_v%5B%5D=zen&h_v%5B%5D=zen&isFullScreen=true&h_r=next-challenge&h_v=zen


public class NumberSeries {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int calc = a;
			String ab = "";
			for (int j = 0; j < n; j++) {
				calc += (Math.pow(2, j) * b);
				ab = ab.concat(Integer.toString(calc)).concat(" ");
			}
			System.out.println(ab);

		}
		in.close();
	}
}
