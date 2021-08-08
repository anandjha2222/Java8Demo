package com.anand.function.demo;

import java.util.function.Function;

public class RemoveBlankSpaces {

	public static void main(String[] args) {
		
		Function<String, String> removeBlankSpaces = s -> s.replaceAll(" ", "");
		
		String s = " My Name is Anand     Kumar  ";
		
		System.out.println(removeBlankSpaces.apply(s));
	}
}
