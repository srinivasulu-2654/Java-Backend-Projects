package com.kodewala.Map;
import java.util.*;


// ConcurrentModificationException ----> will be discuss about this in this section

public class Driver1 {

	public static void main(String[] args) {
		
		List<String> products = new ArrayList<>();
		
		products.add("Apple");
		products.add("Realme");
		products.add("Samsung");
		products.add("Nokia");
		products.add("$Vivo");
		
		for(String product : products) // Loop through OR Iterating the List
		{
			if(product.startsWith("$")) {
				products.remove(product); // ConcurrentModificationException
				System.out.println(product);
			}
		}

	}

}
