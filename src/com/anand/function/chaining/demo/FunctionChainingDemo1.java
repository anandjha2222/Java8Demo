package com.anand.function.chaining.demo;

import java.util.function.Function;


/*
 * 
 * For Function chaining 2 default methods are available inside Function functional interface.
 * f1.andThen(f2) => f1 will be applied followed by f2
 * f1.compose(f2) => f2 will be applied followed by f1
 * 
 * */

public class FunctionChainingDemo1 {
	public static void main(String[] args) {
		
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		String s = "AishwaryaAbhi";
		System.out.println(f1.apply(s));
		System.out.println(f2.apply(s));
		System.out.println(f1.andThen(f2).apply(s));
		System.out.println(f1.compose(f2).apply(s));
	}
}
