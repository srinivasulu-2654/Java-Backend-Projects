package com.kodewala.Set;

import java.util.HashSet;
import java.util.Set;

public class Hashcode1 {

	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<>();
		
		cities.add("Bengaluru");
		cities.add("Chennai");
		cities.add("Noida");
		cities.add("Mumbai");
		cities.add("Kolkata");
		cities.add("Chennai");
		
		System.out.println("Bengaluru".hashCode());
		System.out.println("Bengaluru".hashCode());
		
		// -1514818159 & 15 (capacity by default 16 -> N - 1) => 4th
		
		int hash = "Noida".hashCode();
		hash = hash ^ (hash >>> 16);
		int bucketIndex = (16-1) & hash;
		System.out.println("Bengaluru stored at " + bucketIndex);
		
		System.out.println(cities);

	}

}
