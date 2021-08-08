package com.anand.function.demo;

import java.util.function.Function;

public class CountNumberOfBlankSpaces {

	public static void main(String[] args) {
		
		Function<String, Integer> numberOfBlankSpaces = s ->  s.length() - s.replaceAll(" ", "").length();
		
		String s = " My Name is Anand     Kumar  ";
		
		System.out.println(numberOfBlankSpaces.apply(s));
		
	}
}
