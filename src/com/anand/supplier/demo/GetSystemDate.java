package com.anand.supplier.demo;

import java.util.Date;
import java.util.function.Supplier;

/*
 * Supplier functional interface has only abstract method as : R get()
 * Does not contain any default and static method
 * */
public class GetSystemDate {

	public static void main(String[] args) {
		
		Supplier<Date> getDate = () -> new Date();
		
		System.out.println(getDate.get());
	}
}
