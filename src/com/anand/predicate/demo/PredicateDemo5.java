package com.anand.predicate.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo5 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Kunal");
		names.add("Kamal");
		names.add("Anand");
		names.add("Pankaj");
		names.add("Aman");
		
		Predicate<String> startsWithK = name -> name.startsWith("k");
		Predicate<String> startsWithk = name -> name.startsWith("K");

		System.out.println("Names starting with k : ");
		for(String name : names) {
			if(startsWithK.or(startsWithk).test(name))
				System.out.println(name);
		}
	}
}
