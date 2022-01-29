package com.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SampleCheck {

	public static void main(String[] args) {
		int[] intArray = new int[] { 2, 7, 6, 90, 3, 9 };
		int index = lSearch(intArray, 900);
		System.out.println("index = " + (index > 0 ? index : "value is not there"));
		allMethods(intArray, 900);
		System.out.println(" ******************** ");
		int index2 = lSearch(intArray, 90);
		System.out.println("index = " + (index2 > 0 ? index2 : "value is not there"));
		allMethods(intArray, 90);
		allMethods(intArray, 9);

	}

	// Linear Search
	public static int lSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target)
				return i;
		}
		return -1;
	}

	public static void allMethods(int[] array, int target) {
		
		// https://stackoverflow.com/questions/31422025/arrays-aslistint-not-working
		boolean isAvailable = Arrays.asList(array).contains(target);
		System.out.println("is Available = " + isAvailable);

		// Java 8 Streams

		boolean isMatch = IntStream.of(array).anyMatch(x -> x == target);
		System.out.println("isMatch = " + isMatch);
		
		boolean isMatch2 = Arrays.stream(array).anyMatch(x -> x == target);
		System.out.println("isMatch2 = " + isMatch2);
		
	}
	
	// binary search pending 
}
