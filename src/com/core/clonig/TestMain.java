package com.core.clonig;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dept d = new Dept("a", "123");
		Emp e = new Emp("AE", d);
		Emp e1 = (Emp) e.clone();
		System.out.println("initial value == "+e1.getD().getName());
		e1.getD().setName("B");
		System.out.println("updated value == "+e1.getD().getName());
		System.out.println("orignal obj value == "+e.getD().getName());
		e1.setName("childupdated");
		System.out.println(e.getName());
		System.out.println(e1.getName());
		e.setName("parentupdated");
		System.out.println(e.getName());
		System.out.println(e1.getName());
		
		System.out.println("every object has their own hashcode");
	}

}
