package com.revision.streamapis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver7 {
	
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(12,34,45,23,534,123,534,656,23,534,12,534,999,45,12);
		
		Set<Integer> set = new HashSet<Integer>();
		
//		List<Integer> output = input.stream().filter(num -> set.add(num)).collect(Collectors.toList());
		
		List<Integer> output = input.stream().distinct().collect(Collectors.toList());
		
		System.out.println(output);
	}
}
