package com.revision.streamapis;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Driver4 {
	
	public static void main(String[] args) {
		
		List<List<String>> list = Arrays.asList(Arrays.asList("Bengaluru","Chennai"),Arrays.asList("Andhra Pradesh","Kerala"),
				Arrays.asList("Birla mandhir","Karnataka"));
		
		System.out.println("Before converting 2D: " + list);
		
		List<String> convertedList = list.stream().flatMap(temp->temp.stream()).collect(Collectors.toList());
		
		System.out.println("After converting into: " + convertedList);
		
		convertedList.stream().filter(ch->ch.startsWith("B") && ch.length()>5).forEach(word -> System.out.print(word));
	}
}
