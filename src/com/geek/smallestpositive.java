package com.geek;

import java.util.Arrays;
import java.util.Collections;


//https://practice.geeksforgeeks.org/problems/b6b608d4eb1c45f2b5cace77c4914f302ff0f80d/1/ 
public class smallestpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int arr[] = {1, 1, 1};
		System.out.println(smallestpositive(arr, n));
	}

	public static int smallestpositive(int[] arr, int n) {
		//Arrays.sort(arr);
		int res = 1;
		for (int x : arr) {
			if (x <= res) {
				res += x;
				System.out.println("res"+res);
			} else {
				break;
			}
		}

		return res;
	}

}
