package com.java18fetures.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java18fetures.*;

import com.java18fetures.pojo.Employee;;
public class SortRemoveNull {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(null, 23));
		list.add(new Employee("a", 23));
		list.add(new Employee("as", 23));

	/*	List<Employee> sortEmp = list.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println("sortEmp data -> " + sortEmp.toString());
*/
		List<Employee> nullEmp = list.stream().
				filter(e -> e.getName() != null).collect(Collectors.toList());
		System.out.println("remove null data -> " + nullEmp.toString());
	}

}
