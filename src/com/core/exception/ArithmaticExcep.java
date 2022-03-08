package com.core.exception;

public class ArithmaticExcep {

	public ArithmaticExcep() {

	}

	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		try {
			if (i / j > 1)
				System.out.println("df");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("artith");
			e.printStackTrace();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("overall");
		} finally {
			System.out.println("finally block");
		}
	}

}
