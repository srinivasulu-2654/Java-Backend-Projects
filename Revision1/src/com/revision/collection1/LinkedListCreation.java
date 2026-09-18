package com.revision.collection1;

import java.util.LinkedList;

public class LinkedListCreation {
	
	public static void main(String[] args) {
		
		LinkedList<String> electronics =new LinkedList<String>();
		
		electronics.add("TV");
		electronics.add("Fridge");
		electronics.add("WashingMachine");
		
		System.out.println(electronics);
		
		electronics.addFirst("Trimmer");
		electronics.addLast("Heater");
		
		electronics.remove();
		
		electronics.remove("Fridge");
		
		System.out.println(electronics);
		
		
	}
}
