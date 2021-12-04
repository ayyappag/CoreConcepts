package com.java18fetures.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSort {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(14);
		list.add(31);
		list.add(19);
		list.add(61);
		list.add(13);
		list.add(11);

		System.out.println(list);
		List<Integer> ascsortedList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(ascsortedList);
		List<Integer> descsortedList = list.stream().
				sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(descsortedList);

		int minValue = list.stream().sorted().collect(Collectors.toList()).get(0);
		System.out.println(" Minimum value 1  = " + minValue);
		minValue = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(" Minimum value 2 = " + minValue);
		
		int maxValue = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList()).get(0);
		System.out.println(" Maximum value 1  = " + maxValue);
		
		maxValue = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(" Maximum value 2  = " + maxValue);
		
		
		System.out.println(" ");
		
		
		
		

	}

}
