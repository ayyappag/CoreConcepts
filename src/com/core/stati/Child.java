package com.core.stati;

public class Child extends Parent {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		// super.m1(); -- parent will call 
		System.out.println("Sub-Class");
	}
	
	
	public static void m2(){
		System.out.println("Sub-Class Static Method ");
	}
	
	public void m3(){
		System.out.println("m3");
	}
	
}
