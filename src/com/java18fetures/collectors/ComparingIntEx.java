package com.java18fetures.collectors;

import java.util.Collections;
import java.util.List;

import com.java18fetures.map.StreamMapExample;
import com.java18fetures.map.User;

public class ComparingIntEx {

	public static void main(String[] args) {
		StreamMapExample example = new StreamMapExample();
		List<User> list = example.getUsers();

		System.out.println("Before Sort:");
		list.forEach(User -> System.out.println("User age " + User.getSal()));

		System.out.println("\nAfterSort:");
//		Collections.sort(list, Comparator.comparingInt(User::getSal)); // below method giving same output
		Collections.sort(list, (u1,u2) -> (int) u1.getSal() - u2.getSal());
		
		list.forEach(User -> System.out.println("User age " + User.getSal()));

	}

}
