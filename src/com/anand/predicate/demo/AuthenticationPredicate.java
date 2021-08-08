package com.anand.predicate.demo;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationPredicate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter userName : ");
		String userName = sc.next();
		
		System.out.println("Enter passowrd : ");
		String password = sc.next();
		
		sc.close();
		
		User user = new User(userName, password);
		
		Predicate<User> validUser = u -> u.getUserName().equalsIgnoreCase("anand") && u.getPassword().equals("1234");
		
		if(validUser.test(user))
			System.out.println("User is valid");
		else
			System.out.println("User is Invalid");
	}

}
