package com.revision.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver6 {
	
	public static void main(String[] args) {
		
		List<String> phones = new ArrayList<String>();
		
		phones.add("redmi");
		phones.add("samsung");
		phones.add("$vivo");
		phones.add("Addingsomething");
		
/*		Iterator<String> itr = phones.iterator();
		
		while(itr.hasNext()) {
			String phone = itr.next();
			if(phone.startsWith("$")) {
				phones.remove(phone);
			}
		} */
		
		
		for(String str:phones) {
			if(str.startsWith("$")) {
				phones.remove(str);
			}
		}
		
		System.out.println(phones);
	}
}
