package com.kodewala.streams1;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<String> products = new ArrayList<>();
		
		// below part is storing the products
		
		// storing the products
		products.add("apple");
		products.add("samsung");
		products.add("lg");
		products.add("sony");
		
		// Now we need to process the products --> find the products which are starting with 's'
		
		// processing the data
		
		Iterator<String> itr = products.iterator(); // 10 lines of code to process .....
		
		while(itr.hasNext())
		{
			String product = itr.next();
			if(product.startsWith("s")) {
				System.out.println("products: " +product);
			}
		}
		
	}

}
