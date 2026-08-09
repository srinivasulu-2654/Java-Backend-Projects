package com.kodewala.ConcurrentModificationException;

import java.util.*;

public class Driver1 {

	public static void main(String[] args) {

		List<String> products = new ArrayList<>();
		
		products.add("Apple");
		products.add("Samsung");
		products.add("#vivo");
		products.add("NewSomething");
		
		Iterator<String> itr = products.iterator(); // here it will not check the modCount
		
		while(itr.hasNext()) { 
			String ele = itr.next();
			if(ele.startsWith("#")) {
				itr.remove();
				System.out.println("Removing the junk element"); 
			}
			System.out.println(ele);
		}

	}

}
