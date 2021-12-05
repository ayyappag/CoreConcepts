package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExHashSet {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("a");
		l.add("c");
		l.add("a");
		l.add("b");
		hashSetIteration(l);

	}

	public static void hashSetIteration(List<String> l) {
		Set<String> s = new HashSet<>(l);

		for (Iterator<String> iterator = s.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string + ":=>" + Collections.frequency(l, string));
		}

		Collections.reverse(l);
		System.out.println("List : " + l);
	}
}
