package com.kodewala.Set;

import java.util.TreeSet;

public class Driver7 {

	public static void main(String[] args) {


		TreeSet<String> ts = new TreeSet<String>(); // Not on hashing based (No role of equals and hashCode method)
		
		ts.add("BLR");
		ts.add("CHN");
		ts.add("NOD");
		ts.add("Kashi");
		ts.add("Mysore");
		ts.add("Atmakur");
		ts.add("Mysore");
		ts.add("Lepakshi");
		ts.add(null);
		
		System.out.println(ts);

	}

}
