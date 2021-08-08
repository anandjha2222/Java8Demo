package com.anand.defaultmethod.demo;

public interface Right {

	default void m1() {
		System.out.println("Right DM");
	}
}
