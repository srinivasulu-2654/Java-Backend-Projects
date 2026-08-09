package com.kodewala.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		
		List<List<String>> input = Arrays.asList(Arrays.asList("Banglore","Chennai"),Arrays.asList("Hyderabad","Ahmedabad","Delhi"),
				Arrays.asList("Bansar","Arunachal Pradesh"));
		
		System.out.println("Before the 2D : " + input);
		
		List<String> flattenList =  input.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		System.out.println("After converting: " + flattenList);
		
		flattenList.stream().filter(w-> w.startsWith("B") && w.length() > 5).forEach(word -> System.out.println(word));
		
//		System.out.println(finalOutput);
	}

}
