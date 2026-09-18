package com.revision.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Driver3 {
	
	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<String>();
		
		cities.add("Bengaluru");
		cities.add("Ahamadabad");
		cities.add("Hyderabad");
		cities.add("Arakkonam");
		cities.add("Chennai");
		
		for(String str : cities) {
			
			if(str.startsWith("A")) {
				System.out.println(str);
			}
		}
		
		Iterator<String> itr = cities.iterator();
		
		while(itr.hasNext()) {
			String city = itr.next();
			if(city.startsWith("A")) {
				System.out.println("Starts with A: " + city);
			}
		}
	}
}
