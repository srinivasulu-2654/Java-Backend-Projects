package com.kodewala.Collections.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsUtil {

	public static void main(String[] args) {
		
//		List<String> products = new ArrayList<>(); // not Thread safe
		Map<String,String> products = new HashMap<String,String>(); // not Thread safe
		
		products.put("Apple","iphone");
		products.put("Samsung","s24");
		
//		List<String> newProducts = Collections.unmodifiableList(products); // no one can modify
		
		Map<String,String> newProducts = Collections.synchronizedMap(products); // this become thread safe multiple cann't be accessed
		
		// newProducts thread safe ( 500 buckets) ----> 5th bucket is being updated ----> 499 is blocked -> (slowing down the system)
		
		
		Map<String,String> concurrentProducts = new ConcurrentHashMap<String, String>(1000); // thread safe and performance
		
		// concurrentProducts thread safe ( 1000 buckets) ----> 10th bucket is being updated ----> all 999 can access the other buckets
		
		concurrentProducts.put("BLR", "Test"); // accessing 10th index
		
		
	}

}
