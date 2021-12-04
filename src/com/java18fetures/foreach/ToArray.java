package com.java18fetures.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToArray {

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
		System.out.println(list.toArray());

		List<String> testArrays = Arrays.asList("1", "2", "3");
		System.out.println(" size = " + testArrays.size());
		//testArrays.add("4");
		System.out.println(" size == " + testArrays.size());

		Integer[] array = list.stream().toArray(Integer[]::new);
		Stream.of(array).forEach(System.out::print); 
		
		System.out.println(" String joiner ************ ");

	}
}
