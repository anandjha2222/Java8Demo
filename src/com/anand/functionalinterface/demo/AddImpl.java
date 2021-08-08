package com.anand.functionalinterface.demo;

public class AddImpl {

	public static void main(String[] args) {
		Add add = (a,b) -> a+b;
		System.out.println(add.add(10, 2));
	}
}
