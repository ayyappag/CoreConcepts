package com.java18fetures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java18fetures.pojo.Employee;;

public class FiltersEmp {

	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		al.add(new Employee("ram", 123));
		al.add(new Employee("test", 1423));
		al.add(new Employee("fasf", 1235));
		al.add(new Employee(null, 1235));
		System.out.println("Original List" + al);
		List<Employee> sortOrder = al.stream().filter(e -> e.getSal() > 1238).collect(Collectors.toList());
		System.out.println("sortOrder List" + sortOrder);

		List<Employee> removeNull = al.stream().filter(e -> e.getName() != null).collect(Collectors.toList());
		System.out.println("removeNull" + removeNull);

		List<Employee> nullVals = al.stream().filter(e -> e.getName() == null).collect(Collectors.toList());
		System.out.println("nullVals" + nullVals);

	}

}
