package com.array;

import java.util.Arrays;

public class TwoArray {
	
	public static void main(String[] args) {
		int[] a= {1,23,5,9,2};
		int[] b= {0,8,3};
		int[] temp =  sort(a,b);
		System.out.println(Arrays.toString(temp));
	}

	private static int[] sort(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] temp = new int[a.length+b.length];
		
		for(int i =0,j=0;i<a.length-1&&j<b.length-1;) {
			if(a[i]<b[j]) {
				temp[i] = a[i];
				i++;
			}else {
				temp[i] = b[j];
				j--;
			}
		}
		return temp;		
	}

}
