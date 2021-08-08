package com.anand.supplier.demo;

import java.util.function.Supplier;

public class GetRandomName {

	public static void main(String[] args) {
		
		
		Supplier<String> getName = () -> {
			
			String[] name = {"Anand", "Aman", "Tarun", "Naman"};
			
			int randomInt = (int)(Math.random()*4);
			
			return name[randomInt];
		};
		
		System.out.println(getName.get());
		System.out.println(getName.get());
		System.out.println(getName.get());
		System.out.println(getName.get());
		System.out.println(getName.get());
		System.out.println(getName.get());
		System.out.println(getName.get());
	}
}
