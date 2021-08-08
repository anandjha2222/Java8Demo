package com.anand.predicate.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		Predicate<List> p = l -> l.isEmpty();
		
		System.out.println(p.test(Arrays.asList(new String[] { "A", "B", "C", "D" })));
	}
}
