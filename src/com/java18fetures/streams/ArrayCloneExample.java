package com.java18fetures.streams;

import java.util.Arrays;

public class ArrayCloneExample {
	
	public static void main(String[] args) {
		Employee[] empArr = new Employee[2];    //Original array
		 
        empArr[0] = new Employee(100, "Lokesh" );
        empArr[1] = new Employee(101, "test" );
         
        Employee[] clonedArray = empArr.clone(); // shallcopy ... if you change parent -> it will impact to child
        Employee[] copyArray = Arrays.copyOf(empArr,empArr.length);
        // Employee[] copiedArray = SerializationUtils.clone(empArray);    //Deep copied array
        
         
        empArr[0].setId(200);
        empArr[0].setName("dfsdf");
         
        System.out.println("org -- " + empArr[0].getId());
        System.out.println("cloned --- " + clonedArray[0].getId());
        System.out.println("copy --- " + copyArray[0].getId());
	}

}
