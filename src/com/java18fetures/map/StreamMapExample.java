package com.java18fetures.map;

import java.util.ArrayList;
import java.util.List;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getUsers().stream().filter(user -> user.getSal() > 1300 && user.getSal() <= 1500)
				.map((User user) -> new UserDto(user.getName(), user.getLocation(), user.getSal()))
				.forEach(System.out::println);

	}

	public static List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list.add(new User("ayya", "reresR", "rarr", 1234));
		list.add(new User("ayya1", "reresR", "rarr", 2000));
		list.add(new User("ayya2", "reresR", "rarr", 1500));
		list.add(new User("ayya3", "reresR", "rarr", 1345));
		return list;
	}

}
