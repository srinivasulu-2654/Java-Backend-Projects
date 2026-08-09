package com.kodewala.ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 -> you should modify the list not the Iterator
 if(ele.startsWith("#")) {
					itr.remove();
					System.out.println("Removing the junk element"); 
				}
 -> this should not do becuase it won't works here
 */

public class Driver2 {

	public static void main(String[] args) {

//		List<String> products = new ArrayList<>(); // if the same using this na it will throw the exception
		List<String> products = new CopyOnWriteArrayList<>(); // it won't come the exception ----> Fail Safe()
		
		products.add("Apple");
		products.add("Samsung");
		products.add("#vivo");
		products.add("NewSomething");
		
		Iterator<String> itr = products.iterator(); // here it will not check the modCount
		
		while(itr.hasNext()) {
			
				String ele = itr.next();
				products.remove("Samsung");
				System.out.println("Removing the junk element"); 
				System.out.println(ele);
			}
		
		 System.out.println(products);
		}

	}


