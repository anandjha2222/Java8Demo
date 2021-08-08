package com.anand.staticmethod.demo;

public interface Interf {

	/*
	 * Purpose of static method inside interface : general utility method as static method is anyway not related to instance/object
	 * */
	public static void m1() {
		System.out.println("Static method inside interface");
	}
}
