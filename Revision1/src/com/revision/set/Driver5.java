package com.revision.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver5 {
	
	public static void main(String[] args) {
		
		Map<String, String> statesAndCapitals = new HashMap<String, String>();
		
		statesAndCapitals.put("Karnataka", "Bengaluru");
		statesAndCapitals.put("Assam", "Dispur");
		statesAndCapitals.put("TamilNadu", "Chennai");
		statesAndCapitals.put("Telangana", "Hyderbad");
		statesAndCapitals.put("TamilNadu", "Coimbatore");
		statesAndCapitals.put("AndhraPradesh", "Hyderbad");
		
		System.out.println(statesAndCapitals);
		
		Set<Entry<String,String>> st = statesAndCapitals.entrySet();
		
		Iterator<Entry<String, String>> itr = st.iterator();
		
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			
			System.out.println(entry.getKey() + " and " + entry.getValue());
			
		}
		
	}
}
