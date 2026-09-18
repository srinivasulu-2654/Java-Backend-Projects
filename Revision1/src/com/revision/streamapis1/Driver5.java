package com.revision.streamapis1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver5 {
	
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Bengaluru","Bombay","Chennai","Hyderabad","Mumbai","Mysore","Kochi");
		
		Map<Integer, List<String>> mp = cities.stream().collect(Collectors.groupingBy(w->w.length()));
		
		System.out.println(mp);
		
		Map<Integer,List<String>> mp1 = cities.stream().filter(w->w.length()>6).collect(Collectors.groupingBy(word->word.length()));
		
		System.out.println(mp1);
		
		Map<Boolean,List<String>> output = cities.stream().collect(Collectors.partitioningBy(word->word.length() > 6));
		
		System.out.println(output);
	}
}
