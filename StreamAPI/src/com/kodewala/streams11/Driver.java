package com.kodewala.streams11;
import java.util.*;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		// 2 lists given and find the unique cities and remove the duplicates

		List<String> list1 = Arrays.asList("Banglore","Mysore","Chennai","Hyderabad","Ahmedabad","Delhi");
		List<String> list2 = Arrays.asList("Mysore","Ooty","Kochi","Mysore");
		
		
		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(word -> System.out.println(word));
		
		// longest string in this lists
		
		Optional<String> opt = Stream.concat(list1.stream(), list2.stream()).max(Comparator.comparingInt(w -> w.length()));
		System.out.println("Driver.main() : " + opt.get());

	}

}
