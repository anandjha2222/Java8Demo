package com.anand.staticmethod.demo;

public class Test implements Interf{

	public static void main(String[] args) {
		/*
		 * Only way to invoke static method inside interface as such methods are not available by default to it's implementation classes
		 * */
		Interf.m1();
	}
	
	/*
	 * Overriding concept is not applicable to interface static methods as such methods are not available by default to it's implementation classes
	 * */
}
