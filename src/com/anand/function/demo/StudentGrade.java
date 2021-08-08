package com.anand.function.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrade {
	
	public static void main(String[] args) {
		
		List<Student> students = populate();
		
		Function<Student, String> assignGrade = student -> {
			int marks = student.getMarks();
			if(marks>=80) {
				return "A";
			}else if(marks>=60) {
				return "B";
			}else if(marks>=50) {
				return "C";
			}else {
				return "D";
			}
		};
		
		Predicate<Student> isMarksGreaterThan60 = s -> s.getMarks() > 60;
		
		for(Student s : students) {
			if(isMarksGreaterThan60.test(s)) {
				System.out.println("Grade of "+s.getName()+" is : "+assignGrade.apply(s));
			}
		}
	}

	private static List<Student> populate() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Anand", 80));
		students.add(new Student("Ankit", 10));
		students.add(new Student("Shubham", 50));
		students.add(new Student("Naman", 60));
		students.add(new Student("Tinkoo", 80));
		students.add(new Student("Satyam", 30));
		
		return students;
	}

}
