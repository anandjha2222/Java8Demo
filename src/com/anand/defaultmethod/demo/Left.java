package com.anand.defaultmethod.demo;

public interface Left {

	default void m1() {
		System.out.println("Left DM");
	}
}
