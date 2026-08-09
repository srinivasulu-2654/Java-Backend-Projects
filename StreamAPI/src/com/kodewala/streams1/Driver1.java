package com.kodewala.streams1;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {

	public static void main(String[] args) {
		
		List<String> brand = Arrays.asList("samsung","lg","sony","bosch","realme","hp","apple","oppo");
		
		System.out.println("input : " + brand);
		
		// process the collection - Task ----> convert all the brand to UPPERCASE
		
		// 1 - convert the collection (list to stream object)
		
		Stream<String> stream = brand.stream();
		
		
		// 2 - Applying the processing (intermediate and terminal)
		// here map will convert all the elements from 1 stage to another state
		// map is an intermediate operation will transform from input stream to another form 
	
		Stream<String> upperCaseStream =   stream.map(word -> word.toUpperCase()); 
		
		// 3 - collect the result / Terminate the stream
		// here .collect() is used to terminate the stream and can change the stream to any form of the output
		
		// terminal operation will be called only once
		
		List<String> processedBrand = upperCaseStream.collect(Collectors.toList());
		System.out.println("processed: " + processedBrand);
		
		
		

	}

}
