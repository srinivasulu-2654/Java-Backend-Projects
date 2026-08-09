package com.kodewala.streams2;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Task {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Bengalur", "Belandur", "Bachupalli", "Bomr", "Nagaland", "Koinur");
		
//		List<String> processedList = cities.stream().filter(w->w.startsWith("B")).filter(c->c.length() > 5).collect(Collectors.toList());
		
		List<String> processedList = cities.stream().filter(w->w.startsWith("B") && w.length()>5)
				.collect(Collectors.toList());
		
		System.out.println(processedList);
	}

}
