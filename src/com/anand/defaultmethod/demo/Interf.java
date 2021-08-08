package com.anand.defaultmethod.demo;

public interface Interf {

	default void m1() {
		System.out.println("Default Method");
	}
	
}
