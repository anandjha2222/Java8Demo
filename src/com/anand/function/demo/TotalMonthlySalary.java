package com.anand.function.demo;

import java.util.ArrayList;
import java.util.function.Function;

public class TotalMonthlySalary {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = Employee.getEmployees();
		
		Function<ArrayList<Employee>, Double> totalMonthlySalary = l1 -> {
			double total = 0;
			for(Employee e : l1) {
				total = total + e.salary;
			}
			return total;
		};
		
		
		System.out.println("Total salary of this month is : "+ totalMonthlySalary.apply(employees));
	}
}
