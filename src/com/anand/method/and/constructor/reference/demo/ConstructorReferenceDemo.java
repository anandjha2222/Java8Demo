package com.anand.method.and.constructor.reference.demo;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		Interf2 i = Sample::new;
		
		Sample s = i.get();
	}
}
