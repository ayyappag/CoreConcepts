package com.java18fetures.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Map18 {

	public static void main(String[] args) {
		String input = "Geeks for Geek";
		Map<String, Integer> map = new HashMap<>();
		map.put("test", 1);

		Map<String, Integer> lengthMap = Arrays.stream(input.split(" "))
				.collect(Collectors.toMap(value -> value, value -> value.length()));

		System.out.println(lengthMap);
		System.out.println(map);
		converttoMap();
		removeTest();

	}

	private static void converttoMap() {
		List<String> al = Arrays.asList("a", "b", "f");

		AtomicInteger index = new AtomicInteger();

		Map<Integer, String> map = al.stream()
				.collect(Collectors.toMap(value -> index.getAndIncrement(), value -> value));

		System.out.println(map);

	}

	private static void removeTest() {

		List<String> al = Arrays.asList("a", "b", "f");
		System.out.println(al.size());

		al.stream().filter(a -> {
			al.remove(a);
			return true;
		});

		System.out.println(al.size());

	}

}
