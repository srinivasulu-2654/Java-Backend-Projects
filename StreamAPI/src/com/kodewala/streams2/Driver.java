package com.kodewala.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		// Task - find the cities which starts with "A" and convert those to lowerCase
		List<String> input = Arrays.asList("Banglore","Chennai","Hyderabad","Ahmedabad","Delhi","Mysore","Arunachal Pradesh");
		
		// this will not do anything -> input.stream().filter(c->c.startsWith("A")).map(w->w.toLowerCase())
		// until and unless terminate operation will call -> v.v.v..v.v.Imp interview question
		
		// now this stream is sequence stream that means -> it is a "single threaded stream"
		
		List<String> processedOuptut = input.stream().filter(c->c.startsWith("A"))
				.map(w->w.toLowerCase()).collect(Collectors.toList());
		
		// this is also terminal operation
		
		long cnt = input.stream().filter(c->c.startsWith("A")).map(w->w.toLowerCase()).count(); // 2 GB --> 10 mins
		long paralleStreamCnt = input.stream().filter(c->c.startsWith("A")).map(w->w.toLowerCase()).count(); // 2 GB --> 1 min
		
		System.out.println(processedOuptut);
		System.out.println("count is: " + cnt);

	}

}
