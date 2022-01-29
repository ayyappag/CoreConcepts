package com.array;

//Time Complexity : O(n)

public class LeftRotateArray {

	/* Function to left rotate arr[] of size n by d */
	static void leftRotate(int arr[], int d) {

		if (d == 0)
			return;

		int n = arr.length;
		// in case the rotating factor is
		// greater than array length
		d = d % n;
		reverseArray(arr, 0, d - 1);
		 printArray(arr);
		System.out.println("*");
		reverseArray(arr, d, n - 1);
		 printArray(arr);
		System.out.println("**");
		reverseArray(arr, 0, n - 1);
		 printArray(arr);
		System.out.println("***");
	}

	/* Function to reverse arr[] from index start to end */
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) { // swapping the values
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	// test
	static void rotating(int arr[], int rotation) {

		/*
		 * for (int i = 0, j = arr.length - 1, d = 0; (i < j && d <= rotation); i++,
		 * j--, d++) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
		 * 
		 * }
		 */

		int i = 0, j = arr.length - 1, d = 0;
		while ((i != j) && (d < 2)) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;d++;
		}
	}

	/* UTILITY FUNCTIONS */
	/* function to print an array */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;

		 leftRotate(arr, d); // Rotate array by d -- 3 4 5 6 7 1 2

	//	rotating(arr, d); // -- 7 6 5 4 3 2 1
		printArray(arr);
	}

}
