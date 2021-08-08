package com.anand.function.demo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "(name=" + name + ", salary=" + salary + ")";
	}
	
	public static ArrayList<Employee> getEmployees() {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Anand", 30000));
		employees.add(new Employee("Aman", 20000));
		employees.add(new Employee("Naman", 20000));
		employees.add(new Employee("Suman", 40000));
		employees.add(new Employee("Pankaj", 50000));
		employees.add(new Employee("Tarun", 60000));
		return employees;
	}
}
