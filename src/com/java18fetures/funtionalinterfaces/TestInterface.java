package com.java18fetures.funtionalinterfaces;


@FunctionalInterface
public interface TestInterface {
	
	public void m1(); // it should have only one Single unimplemented method.
	
	public static void m2() {
		System.out.println(" hello test m2");
	}

}
