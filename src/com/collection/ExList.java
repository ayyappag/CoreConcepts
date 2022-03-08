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
		//rest();
	}

	public static void rest() {
		CopyOnWriteArrayList<Integer> list =
				new CopyOnWriteArrayList<>(new Integer[] { 1, 2, 3 });

		System.out.println(list); // [1, 2, 3]

		// Get iterator 1
		Iterator<Integer> itr1 = list.iterator();

		System.out.println("list hascode  before -- "
		+ list.hashCode());
		System.out.println("itr1 hascode -- "
		+ itr1.hashCode());

		// Add one element and verify list is updated
		list.add(4);

		System.out.println(list); // [1, 2, 3, 4]
		System.out.println("list hascode -- " + list.hashCode());
		System.out.println("itr1 hascode -- " + itr1.hashCode());

		list.add(5);

		System.out.println("list after 2 hascode -- " + list.hashCode());

		// Get iterator 2
		Iterator<Integer> itr2 = list.iterator();

		System.out.println("====Verify Iterator 1 content====");

		itr1.forEachRemaining(System.out::println); // 1,2,3

		System.out.println("====Verify Iterator 2 content====");

		itr2.forEachRemaining(System.out::println); // 1,2,3,4
	}

	public static void listIteration() {
		Employee e1 = new Employee("a", "a1", "a2");
		Employee e2 = new Employee("b", "b1", "b2");
		Employee e3 = new Employee("c", "c1", "c2");

		// List<Employee> list = new CopyOnWriteArrayList<>();
		List<Employee> list = new ArrayList<Employee>();

		List<Employee> copyOnwritelist = new CopyOnWriteArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		copyOnwritelist.add(e1);
		copyOnwritelist.add(e2);
		copyOnwritelist.add(e3);

		List<Employee> unmodifiableList = 
				Collections.unmodifiableList(list);
		System.out.println("List:" + list);
		// list2.add(new Employee("d", "d", "sdsds")); // Exception in thread "main"
		// java.lang.UnsupportedOperationException
		System.out.println("list sizes : list => " + 
		list.size() + ": unmodifiableList size --> " + unmodifiableList.size());

		list.add(new Employee("d", "d", "sdsds"));

		System.out.println("list sizes : list => " + list.size()
					+ ": unmodifiableList size --> " + unmodifiableList.size());

		System.out.println("unmodifiableList :" + unmodifiableList);
		System.out.println("copyOnwritelist *******************  :" 
		+ copyOnwritelist.size());

		for (Iterator iterator = copyOnwritelist.iterator(); iterator.hasNext();) { 
			Employee employee = (Employee) iterator.next();
			
			if (employee.getName().equals("b")) {
				employee.setAddress1("bangalore");
				copyOnwritelist.add(new Employee("dsdfsdfsf", "sdfsfdd", "sdsds")); // -- Exception in
				// thread "main" java.util.ConcurrentModificationException
				
			}
			System.out.println("copyOnwritelist *******************  :" + employee.getAddress1());
		}
		System.out.println("copyOnwritelist :" + copyOnwritelist.size());
		
		System.out.println("unmodifiableList :" + unmodifiableList);

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getName().equals("b")) {
				employee.setAddress1("bangalore");
				// list.add(new Employee("dsdfsdfsf", "sdfsfdd", "sdsds")); -- Exception in
				// thread "main" java.util.ConcurrentModificationException
			}
		}

		for (Iterator iterator = unmodifiableList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getName().equals("b")) {
				employee.setAddress1("bangalore");
				// list2.clear();
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

		for (int i = 0; i < unmodifiableList.size(); i++) {
			Employee employee = unmodifiableList.get(i);
			if (employee.getName().equals("rere")) {
//				employee.setAddress1("bangalore");
				unmodifiableList.set(i, new Employee("dxxx", "d", "sdsds"));
			}
		}

		unmodifiableList.forEach(e -> System.out.print("emp ==> " + e.getAddress1() + ","));
		System.out.println("***");
		list.forEach(e -> System.out.print("emp ==> " + e.getAddress1() + ","));

		unmodifiableList.forEach(e -> {
			if (e.getName().equals("b")) {
				System.out.println(" validated ");
				e.setAddress1("chennai");
			}
		});

	}

}
