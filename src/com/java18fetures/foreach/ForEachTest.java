package com.java18fetures.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {

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

		list.forEach(System.out::println);
		System.out.println("************");
		list.stream().forEach(System.out::println);

		System.out.println(" Consumer example ");

		Consumer<Integer> c = i -> {
			System.out.println(" == " + i * i);
		};
		list.stream().forEach(c);

		System.out.println(" Consumer example 2 ");

		list.stream().forEach(i -> {
			System.out.println(" == " + i * i);
		});

	}

}
