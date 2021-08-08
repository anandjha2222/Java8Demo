package com.anand.function.demo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class IncrementSalary {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = Employee.getEmployees();
		
		Predicate<Employee> isLessThan20k = e -> e.salary<=20000;
		Function<Employee, Employee> incrementSalary = e -> { e.salary = e.salary + 500;
				return e;
				};
				
		ArrayList<Employee> employeesWithIncrementedSalary = new ArrayList<Employee>();
		
		for(Employee e : employees) {
			if(isLessThan20k.test(e)) {
				incrementSalary.apply(e);
				employeesWithIncrementedSalary.add(e);
			}
		}
		
		System.out.println(employeesWithIncrementedSalary);
	}

}
