package com.oops;

class StaticDemo {
	static {
		System.out.println("static block of parent class");
	}
	
	public StaticDemo() {
		System.out.println("StaticDemo - Parent ");
	}
}

public class StaticDemoChild extends StaticDemo {
	static {
		System.out.println("static block of child class");
	}

	public StaticDemoChild() {
		System.out.println("StaticDemoChild - Child");
	}
	public void display() {
		System.out.println("Just a method of child class");
	}

	public static void main(String args[]) {
		StaticDemoChild obj = new StaticDemoChild();
		obj.display();
	}
}