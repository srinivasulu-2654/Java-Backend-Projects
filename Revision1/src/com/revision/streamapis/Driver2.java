package com.revision.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {
	
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Bengaluru","Hyderabad","Ahamadabad","Ameerpet","Arunachal Pradesh");
		
		Stream<String> stream = cities.stream();
		
		List<String> result = stream.filter(ch->ch.startsWith("A")).map(word-> word.toUpperCase()).collect(Collectors.toList());
		
		
		long cnt = cities.stream().filter(ch->ch.startsWith("A")).map(word->word.toUpperCase()).count();
		
		System.out.println(result);
		System.out.println(cnt);
		
	}
}
