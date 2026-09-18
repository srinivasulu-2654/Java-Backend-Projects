package com.revision.streamapis;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("siberia","atmakur","kurnool","kotthapalli","somasila","south africa");
		
		Stream<String>stream = list.stream();
		
		Stream<String> streamedList =  stream.filter(word -> word.startsWith("s"));
		
		List<String> result = streamedList.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
