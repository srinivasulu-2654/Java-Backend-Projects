package com.kodewala.Map;
import java.util.*;
import java.util.Map.Entry;

public class Driver {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Apple");
		set.add("Samsung");
		
//		System.out.println("Driver.main(): " + set);
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String ele = itr.next();
//			System.out.println("Elements are: " + ele);
		}
		
		
		// Task is to store the city and state
		
		Map<String,String> stateAndCity = new HashMap<String,String>();
		
		stateAndCity.put("Karnataka", "Bengaluru"); // in hashset it the value was "Dummy Object:
		stateAndCity.put("TamilNadu", "Chennai");
		stateAndCity.put("Rajasthan", "Jaipur");
		stateAndCity.put("Telangana", "Hyderabad"); // 5th bucket ---> O(1) ---> "Telangana".hashCode() & 15 --> 5th index
		stateAndCity.put("Jammu", "Srinagar");
		stateAndCity.put("Jammu", "Srinagar1"); // no duplicated keys here
		
//		System.out.println(stateAndCity.get("Telangana")); // O(1)
		  
		// How does hashmap works internally OR How put method works // HOW
		
//		System.out.println(stateAndCity);
		
		// Steps to iterate the Map:
		
		// 1. Convert the map to set of entries
		
		Set<Entry<String,String>> entrySet = stateAndCity.entrySet();
		
		// 2. Convert the entry set to iterator
		
		Iterator<Entry<String,String>> itr1 = entrySet.iterator();
		
		// 3. iterate
		
		while(itr1.hasNext()) {
			Entry<String,String> entry = itr1.next();
			System.out.println(entry.getKey() + " and " + entry.getValue());
		}
  
	}

}
