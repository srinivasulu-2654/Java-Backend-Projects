package com.kodewala.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Driver2 {

	public static void main(String[] args) {

		List<String> brand = Arrays.asList("samsung","lg","sony","bosch","realme","hp","apple","oppo");
		
//		List<String> processedBrands = brand.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
		
		// Task : from a given list can you find the brand starting with 's' and convert those to upper case
		
		// can able to apply multiple intermediate operations but only 1 terminal operations
		
		List<String> processedBrands = brand.stream().filter(b->b.startsWith("s")).map(w->w.toUpperCase())
				.collect(Collectors.toList());
		
		
		
		System.out.println("processed: " + processedBrands);

	}

}
