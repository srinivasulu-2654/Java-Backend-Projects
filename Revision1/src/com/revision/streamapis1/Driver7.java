package com.revision.streamapis1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Driver7 {
	
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Bengaluru","Chennai","Lucknow");
		
		List<String> list2 = Arrays.asList("Mumbai","Kolkata","Varanasi","Bengaluru");
		
		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(word->System.out.println(word));
		
		Optional<String> res =  Stream.concat(list1.stream(), list2.stream()).max(Comparator.comparingInt(w->w.length()));
		
		System.out.println(res.get());
	}
}
