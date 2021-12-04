package com.java18fetures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(40);
		list.add(21);
		list.add(30);
		list.add(35);
		list.add(90);

		list.forEach(System.out::print);
		System.out.println(list);
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println(" Implementation of Map function");
		
		List<Integer> updateMarks = list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(" update all numbers with 5 -> " +updateMarks);
		
		System.out.println(" condition based map");
		
		List<Integer> condList = list.stream().filter(i->i%2==0).map(i->i+5).collect(Collectors.toList());
		System.out.println("add 5 to the even numbers" + condList);
					
		
		
	}

}
