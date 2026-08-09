package com.kodewala.streams3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(12,43,4,52,6,7,12,53,52,13234,89,98989,89,89,89);
		
		// remove the duplicates from the input
		
		HashSet<Integer> st = new HashSet<Integer>();
		
		// set.add() -> if  present -> return false or else return true
		
//		List<Integer>output = input.stream().filter(w-> st.add(w)).collect(Collectors.toList());
		
		List<Integer>output = input.stream().distinct().collect(Collectors.toList());
	
		System.out.println(output);
	}

}
