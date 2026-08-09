package com.kodewala.Set;

import java.util.*;
//import java.util.Iterator;

/*
 	
 */

public class Driver6 {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		// adding the elements
		
		set.add("BLR"); // boolean -> if we add the elements then it will return false -> i mean if there will elements then it will false
		set.add("Chennai");
		set.add("Noida");
		set.add("Ahamadabad");
		set.add("Mumbai");
		set.add("Amritsar");
		set.add(null);
		set.add(null);
		
		// Task - get the city name(s) which starts with 'A'
		
		// how do you read or iterate the collection / set
		
		System.out.println(set);
		
		for(String element : set)
		{
			if(element != null && element.startsWith("A")) {
				System.out.println(element);
			}
		}
		
		// using iterator 
		
	 Iterator<String> itr = set.iterator();
	 
	 while(itr.hasNext()) { // check next element is there or not
		String ele =  itr.next();
		if(ele != null && ele.startsWith("A")) {
			System.out.println("Elements start with A: " +  ele);
		}
	 }
		
	}

}
