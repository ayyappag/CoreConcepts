package com.core.stati;

public class Child extends Parent {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
//		super.m1();
		System.out.println("Child");
	}
	
	
	public static void m2(){
		System.out.println("Child Static");
	}
	
	public void m3(){
		System.out.println("m3");
	}
	
}
