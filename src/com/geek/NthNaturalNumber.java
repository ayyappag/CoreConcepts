package com.geek;

// https://practice.geeksforgeeks.org/problems/nth-natural-number/1

/*Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9 .


Example 1:

Input:
N = 8
Output:
8
Explanation:
After removing natural numbers which contains
digit 9, first 8 numbers are 1,2,3,4,5,6,7,8
and 8th number is 8.

Example 2:

Input:
N = 9
Output:
10
Explanation:
After removing natural numbers which contains
digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10
and 9th number is 10.

*/

public class NthNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = findNthNaturalNUmber(9);
		System.out.println("nth natural=" + i);

	}

	public static long findNthNaturalNUmber(int n) {

		long sum = 0, i = 0;
		while (n != 0) {
			System.out.println("=%="+(n % 9));
			System.out.println("=/="+(n / 9));
			sum += Math.pow(10, i++) * (n % 9);
			n /= 9;
		}
		return sum;
	}
}
