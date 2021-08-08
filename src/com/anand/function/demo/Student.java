package com.anand.function.demo;

public class Student {

	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "(name=" + name + ", marks=" + marks + ")";
	}
	
}
