package com.inter;


@FunctionalInterface
public interface TestFunc {

	void m1();
	
	static int add(int i , int j ) {
		return (i+j);
	}
}
