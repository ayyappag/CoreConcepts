package com.java18fetures.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
		c.getEmployees(list); // building employees list
		c.byGroupName(list);
		c.collectedbyName(list);
		c.summarizingInt(list);
		c.intStreamEx(list);
		c.duplciate();

		sortedByEmpSal(list);
		sortedByEmpSalLambda(list);
	}

	private List<Employee> getEmployees(List<Employee> list) {
		list.add(new Employee("x", 1800, 24));
		list.add(new Employee("xe", 2400, 34));
		list.add(new Employee("ex", 3200, 27));
		list.add(new Employee("test", 1600, 38));
		list.add(new Employee("abc", 1500, 38));

		return list;
	}

	private void byGroupName(List<Employee> list) {
		System.out.println("byGroup 11");
		Map<Integer, List<Employee>> personsByAge = list.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));

		personsByAge.forEach((age, emp) -> System.out.format("Age %s %s -> ", age, emp));
		System.out.println();
		System.out.println("byGroup 22");
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
		System.out.println("ageSummary = " + ageSummary); // IntSummaryStatistics{count=5, sum=161, min=24,
															// average=32.200000, max=38}
		System.out.println("Get average : " + ageSummary.getAverage());
		System.out.println("***************");

	}

	private void duplciate() {
		List<Integer> list = Arrays.asList(1, 4, 4, 5);
		List<String> list2 = Arrays.asList("a", "b", "b");
		list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);
		int count = list2.stream().filter(i -> Collections.frequency(list2, i) > 1).collect(Collectors.toSet()).size();
		System.out.println("count => " + count);
		if (count != 0)
			System.out.println("hello wrolld");
		;
		String a = "";
	}

	private void intStreamEx(List<Employee> e) {
		Supplier<IntStream> intStream = () -> e.stream().mapToInt(a -> a.getSal());
		System.out.println(intStream.get().min().orElse(1));
		System.out.println(intStream.get().max().orElse(1));

	}

	public static void sortedByEmpSal(List<Employee> list) {

		List<Employee> sortedList = list.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) o1.getSal() - o2.getSal();
			}

		}).collect(Collectors.toList());
		sortedList.forEach(System.out::println);

	}

	public static void sortedByEmpSalLambda(List<Employee> list) {
		System.out.println(" sorted by sal with lambda expression");
		list.stream().sorted((e1, e2) -> e1.getSal() - e2.getSal()).forEach(System.out::println);

		System.out.println(" by using Comparator methods ");
		list.stream().sorted(Comparator.comparingLong(Employee::getSal)).forEach(System.out::println);
		System.out.println(" by using Comparator methods with reverse order ");
		list.stream().sorted(Comparator.comparingLong(Employee::getSal).reversed()).forEach(System.out::println);
		
		List<String> duplicate = Arrays.asList("a","b","a","b");
		

	}
}
