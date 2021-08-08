package com.anand.premitive.type.functional.interfaces.demo;

import java.util.function.ToIntFunction;

public class StringLength {

	public static void main(String[] args) {
		
		ToIntFunction<String> len = s -> s.length();
		
		System.out.println(len.applyAsInt("Anand"));
	}
}
