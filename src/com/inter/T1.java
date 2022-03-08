package com.inter;

public class T1 implements TestFunc {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("unimplemented method");

	}

	public static void main(String[] args) {
		System.out.println(TestFunc.add(10, 5));
		// X x = new X();
		
		X x1 = new X(4);
		System.out.println(x1.getI());

	}

}
