package com.java18fetures.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import com.java18fetures.pojo.Employee;;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Test c = new Test();
		c.getEmployees(list);
		// c.collectedbyName(list);
		System.out.println(list);
	}

	private void byGroup(List<Employee> list) {
		Map<Integer, List<Employee>> personsByAge = list.stream().
				collect(Collectors.groupingBy(emp -> emp.getAge()));

		personsByAge.forEach((age, emp) -> System.out.format("Age %s %s ", age, emp));

	}

	private void collectedbyName(List<Employee> list) {
		List<Employee> filtered = list.stream().filter(emp -> emp.getName().startsWith("x"))
				.collect(Collectors.toList());
		filtered.forEach(System.out::println);

	}

	private List<Employee> getEmployees(List<Employee> list) {
		list.add(new Employee("x", 1800, 24));
		list.add(new Employee("xe", 2400, 34));
		list.add(new Employee("ex", 3200, 27));
		list.add(new Employee("abc", 1500, 38));
		return list;
	}
}
