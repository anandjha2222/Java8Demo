package com.anand.premitive.type.functional.interfaces.demo;

import java.util.function.IntPredicate;

/*
 * Autoboxing
	Integer T = 10;
		Compiler changes it as below:
			Integer I = Integer.valueOf(10);

Autounboxing
	Integer I = new Integer(10);
	int x = I;
		Compiler changes it as below:
			int x = I.intValue();

Generic Type Parameter
	As a type parameter, premitives can never be passed, always pass object type.
	
Need of Premitive type functional interfaces
	Normal functional inetrfaces are not suitable for premitives as several autoboxing and autounboxing takes place which degrades performace
 * */

public class IntPredicateDemo {
	public static void main(String[] args) {
		
		int[] arr = {0,2,3,5,10,14,15,30};
		
		IntPredicate even = i -> i%2==0;
		// Apart from IntPredicate we have below 2 premitive predicates
		//LongPredicate
		//DoublePredicate
		
		System.out.println("Even Numbers are : ");
		for(int i : arr) {
			if(even.test(i))
				System.out.println(i);
		}
	}
}
