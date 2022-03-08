package com.inter;

public class X {

	private int i ;

//	public X() {
//		System.out.println("default");
//	}

	public X(int k) {
		this.i = k;
		System.out.println("argument  " + k);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
