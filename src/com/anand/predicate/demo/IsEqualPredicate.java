package com.anand.predicate.demo;

import java.util.function.Predicate;

public class IsEqualPredicate {

	public static void main(String[] args) {

		Predicate<Employee> isCeo = Predicate.isEqual(new Employee("Aman", "CEO", 30000, "Banglore"));
		
		Employee e1 = new Employee("Rohit", "CTO", 40000, "Banglore");
		Employee e2 = new Employee("Aman", "CEO", 30000, "Banglore");
		
		/*
		 * NOTE : equals method in Employee class must be overridden, otherwise object class equals method will be called
		 * */
		System.out.println("Is new employee CEO : "+isCeo.test(e1));
		System.out.println("Is new employee CEO : "+isCeo.test(e2));
		
	}

}
