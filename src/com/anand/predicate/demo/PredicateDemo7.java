package com.anand.predicate.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class PredicateDemo7 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Kunal");
		names.add(null);
		names.add("Kamal");
		names.add("Anand");
		names.add("");
		names.add("Pankaj");
		names.add("Aman");
		
		ListIterator<String> namesIterator = names.listIterator();
		
		Predicate<String> nullOrEmptyString = name -> name == null || name.length() == 0;
		
		while(namesIterator.hasNext()) {
			if(nullOrEmptyString.test(namesIterator.next()))
				namesIterator.remove();
		}
		System.out.println("List of names after null or empty string removal : ");
		System.out.println(names);
	}
}
