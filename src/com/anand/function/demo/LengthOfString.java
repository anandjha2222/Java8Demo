package com.anand.function.demo;

import java.util.function.Function;

public class LengthOfString {

	public static void main(String[] args) {

		Function<String, Integer> lengthOfString = s -> s.length();
		
		System.out.println(lengthOfString.apply("Anand Kumar"));
	}

}
