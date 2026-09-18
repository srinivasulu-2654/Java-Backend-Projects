package com.revision.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver5 {
	
	public static void main(String[] args) {
		
		List<List<String>> input = Arrays.asList(Arrays.asList("Bengaluru","Arunachal Pradesh","Sikkim"),Arrays.asList("Kerala","Bihar mandir"),
				Arrays.asList("Andhra Pradesh","Karnataka"));
		
		System.out.println("Before converting: " + input);
		
		List<String>flattendMap =  input.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		System.out.println(flattendMap);
		
		flattendMap.stream().filter(ch->ch.startsWith("B") && ch.length()>5).forEach(word->System.out.print(word));
	}
}
