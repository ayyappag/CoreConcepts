package com.oops;

public class AI implements i1,i2{

	
	// it will throw compile time error , 
	// while retrun type is different with same name
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	public static void main(String[] args) {
		AI  t = new AI ();
		t.m();
	}
}
