package com.revision.streamapis;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Driver6 {
	
	public static void main(String[] args) {
		
		List<List<String>> input = Arrays.asList(Arrays.asList("Bengaluru","Chennai","Mysore"),Arrays.asList("Chennai","Madurai"),
				Arrays.asList("Chennai","kochi","Madurai"));
		
		System.out.println("Before 2D: " + input);
		
		Set<String> hashset = new HashSet<String>();
		
		List<String> output = input.stream().flatMap(word->word.stream()).filter(word->!hashset.add(word)).distinct().collect(Collectors.toList());
		
		System.out.println(output);
	}
}
