package com.geek;

//Subarray with given sum 
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class RecursiveSum {

	public static void main(String[] args) {
		// RecursiveSum a = new RecursiveSum();
		 
		int n = 10, value = 15;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int start = 0;
		while (start <= a.length) {
			sum(a, start, value);
			start++;
		}

	}

	public static void sum(int[] a, int startPosition, int value) {
		int sum = 0;
		for (int i = startPosition; i < a.length; i++) {
			sum += a[i];
			if (sum == value) {
				System.out.println("Start -> End Positions =>>"+startPosition + ":" + i);
				return;
			} else if (sum > value) {
				return;
			}

		}

	}

}
