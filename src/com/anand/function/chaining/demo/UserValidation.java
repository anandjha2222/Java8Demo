package com.anand.function.chaining.demo;

import java.util.function.Function;

public class UserValidation {

	public static void main(String[] args) {
		
		Function<String, String> f1 = s -> s.substring(0, 5);
		Function<String, String> f2 = s -> s.toLowerCase();
		
		
		String userName = "AuRgasoft";
		String password = "durga";
		
		if(f1.andThen(f2).apply(userName).equals("durga") && password.equals(password)) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
	}
}
