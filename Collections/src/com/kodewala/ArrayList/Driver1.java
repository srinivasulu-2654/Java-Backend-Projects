package com.kodewala.ArrayList;

import java.util.LinkedList;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Bengaluru");
		list.add("Chennai");
		list.add("Noida");
		list.add("Mumbai");
		list.add("Kolkata");
		
		System.out.println(list);
		
		list.add(2,"Kurnool");
		
		System.out.println(list);

	}

}
