package com.anand.predicate.demo;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length()>5;
		
		System.out.println(p.test("Anand kumar"));
		System.out.println(p.test("Anand"));
	}
}
