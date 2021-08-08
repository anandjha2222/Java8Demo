package com.anand.predicate.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(new Integer[] {0,2,3,4,5,6,7,19,10,45,36});
		
		Predicate<Integer>  isGreaterThan10 = i -> i>10;
		Predicate<Integer> isEven = i -> i%2 == 0;
		
		System.out.println("Numbers greater than 10 : ");
		m1(isGreaterThan10,list);
		
		System.out.println("Numbers not greater than 10 : ");
		m1(isGreaterThan10.negate(),list);
		
		System.out.println("Even Numbers greater than 10 : ");
		m1(isGreaterThan10.and(isEven),list);
		
		System.out.println("Numbers not greater than 10 or Odd Numbers : ");
		m1(isGreaterThan10.negate().or(isEven).negate(),list);
	}
	
	public static void m1(Predicate<Integer> p , List<Integer> l) {
		for(int i : l) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
