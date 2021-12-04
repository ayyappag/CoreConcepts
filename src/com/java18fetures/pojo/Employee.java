package com.java18fetures.pojo;

public class Employee {

	private String name;
	private int sal;
	
	private int age;
	

	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	

	public Employee(String name, int sal, int age) {
		super();
		this.name = name;
		this.sal = sal;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}
	
	

}
