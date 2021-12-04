package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("123");
		list.add("456");
		list.add("789");
		listIterator(list);
		setIterator(list);
		// unModifiableExceptionList(list); // will throw exception : Exception in
		// thread "main" java.util.ConcurrentModificationException
		unModifiableExceptionList2(list); // this will not throw any exception
		forEachRemaining(list);

	}

	public static void listIterator(List<String> list) {

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println("key value = " + key);
		}

	}

	public static void setIterator(List<String> list) {
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("key = " + key);
		}

	}

	public static void unModifiableExceptionList(List<String> list) {
		Iterator<String> itr = list.iterator();
		System.out.println("unModifiableExceptionList");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println("key value = " + key);
			if (key == "456")
				list.add("987");
		}
	}

	public static void unModifiableExceptionList2(List<String> list) {
		Iterator<String> itr = list.iterator();
		System.out.println("unModifiableExceptionList");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println("key value = " + key);
			if (key == "456")
				list.remove("456");
		}
	}

	public static void forEachRemaining(List<String> list) {
		Iterator itr = list.iterator();
		itr.forEachRemaining((element) -> {
			System.out.println("element * " + element);
		});

	}

}
