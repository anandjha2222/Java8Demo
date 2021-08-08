package com.anand.consumer.demo;

import java.util.function.Consumer;

/*
 * only abstract method inside consumer Functional Interface is : void accept(T t)
 * 
 * */
public class ConsumerDemo1 {
	
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Anand");
	}
}
