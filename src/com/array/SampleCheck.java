package com.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SampleCheck {

	public static void main(String[] args) {
		int[] intArray = new int[] { 2, 7, 6, 90, 3, 9 };
		int index = lSearch(intArray, 900);
		System.out.println("1. index = " + (index > 0 ? index : "value is not there"));
		allMethods(intArray, 900);
		System.out.println(" ******************** ");
		int binary_index = lSearch_binarySearch(intArray, 900);
		System.out.println("2. binary_index = " + (binary_index > 0 ? index : "value is not there"));

		System.out.println(" ******************** ");
		int index2 = lSearch(intArray, 90);
		System.out.println("3. index = " + (index2 > 0 ? index2 : "value is not there"));
		
		int binary_index2 = lSearch_binarySearch(intArray, 90);
		System.out.println("4. binary_index2 = " + (binary_index2 > 0 ? binary_index2 : "value is not there"));

		
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

	public static int lSearch_binarySearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;
		Arrays.sort(arr);

		while (left <= right) {
			int middle = (left + right) / 2;
			int middle_element = arr[middle];

			if (target == middle_element)
				return middle;
			else if (target > middle_element)
				left = middle + 1;
			else // if(target < middle_element)
				right = middle - 1;
		}

		return -1;
	
	}

	public static void allMethods(int[] array, int target) {

		// https://stackoverflow.com/questions/31422025/arrays-aslistint-not-working
		boolean isAvailable = Arrays.asList(array).contains(target);
		System.out.println("is Available = " + isAvailable);

		// Java 8 Streams

		boolean isMatch = IntStream.of(array)
				.anyMatch(x -> x == target);
		System.out.println("isMatch = " + isMatch);

		boolean isMatch2 = Arrays.stream(array)
				.anyMatch(x -> x == target);
		System.out.println("isMatch2 = " + isMatch2);

	}

}
