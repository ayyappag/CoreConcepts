package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.core.exception.Employee;

public class ExList {

	public static void main(String[] args) {
		listIteration();
	}

	public static void listIteration() {
		Employee e1 = new Employee("a", "a1", "a2");
		Employee e2 = new Employee("b", "b1", "b2");
		Employee e3 = new Employee("c", "c1", "c2");

		// List<Employee> list = new CopyOnWriteArrayList<>();
		List<Employee> list = new ArrayList();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		List<Employee> list2 = Collections.unmodifiableList(list);
		System.out.println("List:" + list);
		// list2.add(new Employee("d", "d", "sdsds")); // Exception in thread "main"
		// java.lang.UnsupportedOperationException
		System.out.println("list sizes : list => " + list.size() + ": list2 --> " + list2.size());

		list.add(new Employee("d", "d", "sdsds"));

		System.out.println("list sizes : list => " + list.size() + ": list2 --> " + list2.size());

		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getName().equals("b")) {
				employee.setAddress1("bangalore");
			}

		}

		System.out.println(" list  .... ");

		for (int i = 0; i < list.size(); i++) {
			Employee employee = list.get(i);
			if (employee.getName().equals("b")) {
//				employee.setAddress1("bangalore");
				list.set(i, new Employee("rere", "d", "sdsds"));
			}
		}

		System.out.println(" list2 .... ");

		for (int i = 0; i < list2.size(); i++) {
			Employee employee = list2.get(i);
			if (employee.getName().equals("rere")) {
//				employee.setAddress1("bangalore");
				list2.set(i, new Employee("dxxx", "d", "sdsds"));
			}
		}

		list2.forEach(e -> System.out.print("emp ==> " + e.getAddress1() + ","));
		System.out.println("***");
		list.forEach(e -> System.out.print("emp ==> " + e.getAddress1() + ","));

		list2.forEach(e -> {
			if (e.getName().equals("b")) {
				System.out.println(" validated ");
				e.setAddress1("chennai");
			}
		});

	}

}
