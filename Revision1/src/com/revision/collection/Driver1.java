package com.revision.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver1 {
	
	public static void main(String[] args) {
		
		Map<String, String> products = new HashMap<String, String>();
		
		products.put("Apple", "iphone16");
		products.put("samsung", "ultra 24");
		
		Map<String,String> newProducts = Collections.synchronizedMap(products);
		
		newProducts.put("Oppo", "reno16");
		
		System.out.println(newProducts);
		
		
	}
}
