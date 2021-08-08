package com.anand.predicate.demo;

import java.util.function.Predicate;

public class PradicateDemo1 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = n -> n>10;
		
		System.out.println(p.test(1));
	}

}
