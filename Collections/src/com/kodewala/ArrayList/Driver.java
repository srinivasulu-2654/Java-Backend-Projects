package com.kodewala.ArrayList;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		
		ArrayList cities = new ArrayList<>(); // default size is 10 -> it will increase by 50%
		
		cities.add("BLR");
		cities.add("CHN");
		cities.add("NOD");
		cities.add("ATM");
		cities.add("BKR");
		
		System.out.println(cities.get(2));
		
		cities.add(2,"kurnool");
		
		System.out.println(cities);
	}

}
