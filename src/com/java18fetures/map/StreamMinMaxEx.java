package com.java18fetures.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMinMaxEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 2, 9, 1);
		System.out.println(" count =  " + Stream.of(list).count());
		System.out.println(" find any =  " + Stream.of(list).findAny());
		System.out.println(" First value =  " + Stream.of(list).findFirst());

		Integer min = Stream.of(2, 5, 2, 9, 1).
				min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(" min =  " + min);

		Integer max = Stream.of(2, 5, 9, 1, 3).
				max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(" max =  " + max);
	}

}
