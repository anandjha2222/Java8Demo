package com.anand.premitive.type.functional.interfaces.demo;

import java.util.function.IntToDoubleFunction;

public class SquareRoot {

	public static void main(String[] args) {
		
		IntToDoubleFunction sqrt = i -> Math.sqrt(i);
		
		System.out.println(sqrt.applyAsDouble(2));
	}
}
