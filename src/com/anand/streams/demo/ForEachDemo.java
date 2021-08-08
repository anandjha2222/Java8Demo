package com.anand.streams.demo;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("bb");
		l.add("ccc");
		
		//l.stream().forEach(s -> System.out.println(s));
		
		l.stream().forEach(System.out::println);
	}
}
