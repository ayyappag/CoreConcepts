package com.constructor;

public class B {
	int i;

	public static void main(String[] args) {
		int j;
		/*
		 * scenario : 1 need to provide value for explicit constructor, it will
		 * compiletime error A a = new A();
		 */
		
		/*
		 * scenario : 2 In Java, class and instance variables assume a default value
		 * (null, 0, false) if they are not initialized manually. However, local
		 * variables don't have a default value. Unless a local variable has been
		 * assigned a value, the compiler will refuse to compile the code that reads it.
		 * System.out.println("tested"+j);
		 */
		
		testString();
	}

	public void m(int k) {
		int l;
	}
	
	
	 public static void testString() {

	        String str1 = new String("Hello World");

	        String str2 = new String("Hello World");

	        if (str1.equals(str2))

	        { // this condition is true

	            System.out.println("str1 and str2 are equal in terms of values");

	        }

	        if (str1 == str2) {

	            //This condition is true

	            System.out.println("Both strings are referencing same object");

	        } else

	        {

	            // This condition is NOT true

	            System.out.println("Both strings are referencing different objects");

	        }

	    }
}
