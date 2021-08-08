package com.anand.streams.demo;

import java.util.ArrayList;
import java.util.List;

public class CountNumberOfElements {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Anand");
		names.add("joe");
		names.add("vj");
		names.add("Tinkoo");
		names.add("Prabhat");
		names.add("Raghubansha");
		names.add("Bhupendra");

		long count = names.stream().filter(s -> s.length()>=5).count();
		
		System.out.println(count);
	}
}
