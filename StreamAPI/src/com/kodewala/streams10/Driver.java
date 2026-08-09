package com.kodewala.streams10;

import java.util.Optional;

public class Driver {

	public static void main(String[] args) {
		
		// find the first non Repeating character
		
		String word = "swiss";
		
		Optional<Character> res =  word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch))
				.findFirst();
		
		// if you want 2nd most non Repeating character 
		
		Optional<Character> result =  word.chars().mapToObj(c -> (char) c).filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch))
				.skip(1).findFirst();
		
		System.out.println(res.get());
	}

}
