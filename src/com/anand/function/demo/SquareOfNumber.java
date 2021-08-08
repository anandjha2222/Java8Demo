package com.anand.function.demo;

import java.util.function.Function;

public class SquareOfNumber {

	public static void main(String[] args) {

		Function<Integer, Integer> square = i -> i*i;
		
		System.out.println(square.apply(2));
	}

}
