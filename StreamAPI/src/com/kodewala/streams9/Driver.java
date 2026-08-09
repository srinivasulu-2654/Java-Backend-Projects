package com.kodewala.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> input = Arrays.asList("Banglore","Chennai","Hyderabad","Ahmedabad","Delhi","Mysore","Arunachal Pradesh");
		
		// group the cities by length
		
		Map<Integer,List<String>> mp = input.stream().collect(Collectors.groupingBy(w -> w.length()));
		
		System.out.println(mp);
		
		// group the cities by length and whose length is more than 7
		
		Map<Integer,List<String>> mp1 = input.stream().filter(w->w.length() > 6).collect(Collectors.groupingBy(w -> w.length()));
		
		System.out.println(mp1);
		
		// counting() operation
		
		long cnt = input.stream().filter(word -> word.length() > 6).collect(Collectors.counting());
		
		System.out.println(cnt);
		
		// now partioningBy -> this will partion the portion which is based on the condition
		
		Map<Boolean,List<String>> output =  input.stream().collect(Collectors.partitioningBy(word -> word.length() > 6));
		
		System.out.println(output);

	}

}
