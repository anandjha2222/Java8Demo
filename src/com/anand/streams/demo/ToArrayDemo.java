package com.anand.streams.demo;

import java.util.ArrayList;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();

		l.add(0);
		l.add(5);
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(35);
		l.add(30);

		Integer[] arr = l.stream().toArray(Integer[]::new);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
