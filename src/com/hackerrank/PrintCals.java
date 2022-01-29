package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.hackerrank.com/challenges/java-loops-i/problem?h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_v%5B%5D=zen&h_v%5B%5D=zen&isFullScreen=true

public class PrintCals {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
	}

}
