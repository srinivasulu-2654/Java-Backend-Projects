package com.kodewala.ConcurrentModificationException;

import java.util.ArrayList;
import java.util.List;

public class Driver {

public static void main(String[] args) {
		
		List<String> products = new ArrayList<>();
		
		products.add("Apple");
		products.add("Realme");
		products.add("Nokia");
		products.add("$Vivo");
		
		for(String product : products) // Loop through OR Iterating the List / (modCount == expectedModCount)
		{
			if(product.startsWith("$")) {
//				products.remove(product); // Removing the element OR modifying the List
				products.add("Lava"); // this will also throw the exception
				System.out.println(product);
			}
		}

	}

}
