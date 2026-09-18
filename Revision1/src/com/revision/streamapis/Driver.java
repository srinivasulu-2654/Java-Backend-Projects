package com.revision.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		
		List<String> brands = Arrays.asList("samsung","lenovo","sony","panasonic","lg","oppo");
		
		Stream<String> stream = brands.stream();
		
		Stream<String> processedStream = stream.map(word -> word.toUpperCase());
		
		List<String> finalList = processedStream.collect(Collectors.toList());
		
		System.out.println(finalList);
	}
}