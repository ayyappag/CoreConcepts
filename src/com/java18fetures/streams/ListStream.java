package com.java18fetures.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4);
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		list.stream().distinct().forEach(System.out::print);
		list2.forEach(System.out::print);
		Employee e1 = new Employee(1, 123);
		Employee e2 = new Employee(2, 123);
		Employee e3 = new Employee(1, 123);
		Map<Employee, String> m = new HashMap<Employee, String>();
		m.put(e1, "e1");
		m.put(e2, "e2");
		System.out.println(m.get(e3));

	}
}
