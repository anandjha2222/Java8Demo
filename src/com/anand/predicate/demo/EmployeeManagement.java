package com.anand.predicate.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagement {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Anand", "Sr. Software Engineer", 20000, "Pune"));
		employees.add(new Employee("Aman", "CEO", 30000, "Banglore"));
		employees.add(new Employee("Rohit", "CTO", 40000, "Banglore"));
		employees.add(new Employee("Kamal", "Software Engineer", 10000, "Hyderabad"));
		employees.add(new Employee("Sanjay", "Manager", 40000, "Bhopal"));
		
		Predicate<Employee> isManager = e -> e.designation.equalsIgnoreCase("manager");
		System.out.println("Employees who are managers : ");
		display(isManager, employees);
		
		Predicate<Employee> staysInBanglore = e -> e.city.equalsIgnoreCase("banglore");
		System.out.println("Employees who stay in banglore : ");
		display(staysInBanglore, employees);
	}
	
	static void display(Predicate<Employee> p, List<Employee> l) {
		for(Employee e : l) {
			if(p.test(e))
				System.out.println(e);
		}
		System.out.println("***************************************************************");
	}

}
