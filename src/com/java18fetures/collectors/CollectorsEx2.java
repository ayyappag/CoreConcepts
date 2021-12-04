package com.java18fetures.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.java18fetures.pojo.Employee;

public class CollectorsEx2 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		CollectorsEx2 c = new CollectorsEx2();
		/*
		 * c.getEmployees(list); c.collectedbyName(list); c.byGroupName(list);
		 * c.summarizingInt(list);
		 */

		String a = "%|48";
		int i = a.indexOf('|');
		System.out.println(a.substring(0, a.indexOf('|')));
		System.out.println(a.substring(a.indexOf('|') + 1));
		String[] temp = a.split("|");
		System.out.println(temp);
		c.getEmployees(list);
		c.intStreamEx(list);
		c.duplciate();
	}

	private void byGroupName(List<Employee> list) {
		System.out.println("byGroup");
		Map<Integer, List<Employee>> personsByAge = list.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));

		personsByAge.forEach((age, emp) -> System.out.format("Age %s %s -> ", age, emp));
		System.out.println("byGroup");
		System.out.println(personsByAge);
		System.out.println("***************");
	}

	private void collectedbyName(List<Employee> list) {
		System.out.println("collectedbyName");
		List<Employee> filtered = list.stream().filter(emp -> emp.getName().startsWith("x"))
				.collect(Collectors.toList());
		filtered.forEach(System.out::println);
		System.out.println("***************");

	}

	private void summarizingInt(List<Employee> list) {
		System.out.println("summarizingInt");
		IntSummaryStatistics ageSummary = list.stream().collect(Collectors.summarizingInt(p -> p.getAge()));
		System.out.println("ageSummary = " + ageSummary);
		System.out.println("***************");

	}

	private List<Employee> getEmployees(List<Employee> list) {
		list.add(new Employee("x", 1800, 24));
		list.add(new Employee("xe", 2400, 34));
		list.add(new Employee("ex", 3200, 27));
		list.add(new Employee("abc", 1500, 38));
		list.add(new Employee("abc", 1500, 38));

		return list;
	}

	private void duplciate() {
		List<Integer> list = Arrays.asList(1,4,4,5);
		List<String> list2 = Arrays.asList("a","b","b");
		list.stream().
		filter(i -> Collections.frequency(list, i)>1)
		.collect(Collectors.toSet()).forEach(System.out::println);
		int count = list2.stream().
				filter(i -> Collections.frequency(list2, i)>1)
				.collect(Collectors.toSet()).size();
				System.out.println("count => " + count);
				if(count !=0)
					System.out.println("hello wrolld");
				;
				String a ="";
	}

	private void intStreamEx(List<Employee> e) {
		Supplier<IntStream> intStream = () -> e.stream().mapToInt(a -> a.getSal());
		System.out.println(intStream.get().min().orElse(1));
		System.out.println(intStream.get().max().orElse(1));

	}
}
