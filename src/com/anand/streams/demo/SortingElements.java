package com.anand.streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElements {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(35);
		l.add(30);
		
		System.out.println(l);
		
		List<Integer> ascending = l.stream().sorted().collect(Collectors.toList());
		System.out.println(ascending);
		
		List<Integer> descending = l.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(descending);
	}
}
