package com.oops;

public class MyChildClass extends MyParentClass {
	MyChildClass() {
		System.out.println("MyChildClass Constructor");
	}

//	Whenever a child class constructor gets invoked it implicitly
//	invokes the constructor of parent class. You can
//	also say that the compiler inserts a super(); 	statement at
//	the beginning of child class constructor.
	public static void main(String args[]) {
		new MyChildClass();
	}
}