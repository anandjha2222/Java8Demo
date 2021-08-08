package com.anand.defaultmethod.demo;

public class DefaultAmbiguityDemo implements Left, Right {

	public void m1() {
		//If a new implementation is required
		System.out.println("My own implementation");
		//If Left implementation is required
		//Left.super.m1();
		//If Right implementation is required
		//Right.super.m1();
	}

	public static void main(String[] args) {
		DefaultAmbiguityDemo demo = new DefaultAmbiguityDemo();
		demo.m1();
	}
}
