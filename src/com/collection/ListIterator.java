package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("123");
		list.add("456");
		list.add("789");
		listIterator(list);
	}

	public static void listIterator(List<String> list) {
		java.util.ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			// System.out.println(listIterator.previous()); = Exception in thread "main"
			// java.util.NoSuchElementException
			System.out.println(listIterator.next());
		}

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("list has forEach() method");
		list.forEach((element) -> System.out.println(element));
		
		System.out.println("listIterator has forEachRemaining() method");
		listIterator.forEachRemaining((element) -> System.out.println(element));
	}
}
