package com.java18fetures.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCount {
	
	public static void main(String[] args) {
		Map<String, Long> a = "The quick brown fox jumped over the lazy dogT t."
        .chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        System.out.println("sdfsdf");
	}

}
