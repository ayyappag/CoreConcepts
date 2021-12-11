package com.java18fetures.map;

public class UserDto {

	String name;
	String location;
	int sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [name=" + name + " , location=" + location + ", sal=" + sal + "]";
	}

	public UserDto(String name, String location, int sal) {
		super();
		this.name = name;
		this.location = location;
		this.sal = sal;
	}
	
	



}
