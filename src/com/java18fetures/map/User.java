package com.java18fetures.map;

public class User implements Comparable<User>{
	String name;
	String password;
	String location;
	int sal;

	public User(String name, String password, String location, int sal) {
		super();
		this.name = name;
		this.password = password;
		this.location = location;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "User [name=" + name + ", password=" + password + ", location=" + location + ", sal=" + sal + "]";
	}
	
	@Override
	public int compareTo(User u1)
    {
        return name.compareTo(u1.name);
    }

	
  

}
