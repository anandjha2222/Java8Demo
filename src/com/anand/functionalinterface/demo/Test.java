package com.anand.functionalinterface.demo;

public class Test {

	public static void main(String[] args) {
		Interf i = () -> System.out.println("Hello");
		i.m1();
	}
}
