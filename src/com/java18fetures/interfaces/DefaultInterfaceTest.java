package com.java18fetures.interfaces;

public class DefaultInterfaceTest implements DefaultInterface1,DefaultInterface2{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultInterfaceTest test = new DefaultInterfaceTest();
		test.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DefaultInterface1.super.m1(); // it will call DefaultInterface1 method
	}

}
