package com.java18fetures.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java18fetures.pojo.Employee;

public class Java8OracleExm {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
//		getEmployees(list);
//		getUppercase(list);
//		getUppercaseFemaleNames(list);

		buildStream();
		builSorteddStream();

	}

	public static List<Employee> getEmployees(List<Employee> list) {
		list.add(new Employee("x", "Female", 4));
		list.add(new Employee("xe", "Female", 14));
		list.add(new Employee("ex", "Female", 27));
		list.add(new Employee("abc", "Female", 38));
		list.add(new Employee("abc", "Female", 38));
		list.add(new Employee("hello", "Male", 38));

		return list;
	}

	// get an uppercase names for age > 18 : females

	public static void getUppercase(List<Employee> list) {
		System.out.println("List : " + list);
		List<String> upperCaseNames = list.stream().filter(e -> e.getAge() > 18)
				.map(emp -> emp.getName())
				.map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(" Print Upper Case Name : " + upperCaseNames);
	}

	// get an uppercase names for age > 18 : female names

	public static void getUppercaseFemaleNames(List<Employee> list) {
		System.out.println("Print Female Names in Uppercase");
		List<String> names = list.stream().
				filter(e -> (e.getAge() > 18 && e.getGender().equals("Female")))
				.map(emp -> emp.getName()).map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(" Print Upper Case Name : " + names);

	}

	public static void comparatorEx() {
		List<String> list = Arrays.asList("a", "g", "h", "b", "e", "c");

	}

	public static void buildStream() {
		Stream<String> stream = Stream.of("a", "h", "t", "w", "m");
		stream.forEach(System.out::println);

		Collection<String> c1 = Arrays.asList("a", "h", "t", "w", "m");
		c1.stream().forEach(System.out::println);

		List<String> l1 = Arrays.asList("a", "h", "t", "w", "m");
		l1.stream().forEach(System.out::println);
	}

	public static void builSorteddStream() {
		List<String> list = Arrays.asList("banana", "apple", "mango", "grapes", "coconut");

		System.out.println("Sorting in natural order");

		List<String> natualOrder = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		printStream(natualOrder);
		System.out.println("option 2");

		List<String> streamOrder = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		printStream(streamOrder);

		System.out.println("Sorting in reverse order");

		List<String> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		printStream(reverseOrder);

		List<String> lambdaReverseOrder = list.stream().sorted((o1, o2) -> o2.compareTo(o1))
				.collect(Collectors.toList());
		printStream(lambdaReverseOrder);

	}

	public static void printStream(List<String> list) {
		list.forEach(System.out::println);
	}

}
