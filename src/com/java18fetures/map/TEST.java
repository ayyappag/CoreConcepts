package com.java18fetures.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TEST {

	public static void main(String[] args) {
		basicMap();
		basicIntStream();
		findFirst();
		mapToObject();
	}

	private static void basicMap() {
		System.out.println(" ************************ ");
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList.stream().filter(a -> a.startsWith("a")).sorted()
								.map(String::toUpperCase).collect(Collectors.toList())
								.forEach(System.out::println);
		System.out.println(" ************************ ");

	}

	private static void basicIntStream() {
		System.out.println(" ************************ ");
		
		System.out.println("IntStream.range example");
		IntStream.range(0, 10).
							map(a -> (a + 2)).
							forEach(System.out::println);
		
		System.out.println("IntStream.of example");
		IntStream.of(0, 10).
							map(a -> (a + 2)).
							forEach(System.out::println);
		System.out.println(" ************************ ");
		
	}
	
	private static void findFirst() {
		System.out.println(" ************************ ");
		List<String> list =Arrays.asList("str","tes","dgdg","dsgrd");
		String first = list.stream().findFirst().get();
		System.out.println(" first = " + first);
		
		list.stream().sorted().findFirst().ifPresent(System.out::println);
		
		System.out.println(" ************************ ");
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);  // 5.0
		
		System.out.println(" ************************ ");

		
	}
	
	private static void mapToObject() {
		
		Stream.of("a1","a22","a44").
									map(s->s.substring(1)).
									mapToInt(Integer::parseInt).
									sorted().
									forEach(System.out::println);
		
		List<Integer> al = new ArrayList<>();
		
		IntStream.range(1, 4)
	    .mapToObj(i -> al.add(i))
	    .forEach(System.out::print);
		System.out.println(" list size == " + al.size());

	}
}
