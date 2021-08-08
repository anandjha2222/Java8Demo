package com.anand.streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsBasedOnLength {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Anand");
		names.add("joe");
		names.add("vj");
		names.add("Tinkoo");
		names.add("Prabhat");
		names.add("Raghubansha");
		names.add("Bhupendra");
		
		List<String> filteredNames  = names.stream().filter(s -> s.length()>=5).collect(Collectors.toList());
		
		System.out.println(filteredNames);
		
		List<String> upperCaseStrings = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperCaseStrings);
	}
}
