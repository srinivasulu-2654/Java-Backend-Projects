package com.revision.streamapis1;

import java.util.Optional;

public class Driver6 {
	
	public static void main(String[] args) {
		
		String word = "swiss";
		
//		Optional<Character> res = word.chars().mapToObj(c -> (char) c).filter(ch->word.indexOf(ch)==word.lastIndexOf(ch)).findFirst();
		
		Optional<Character> res =  word.chars().mapToObj(c -> (char)c).filter(ch->word.indexOf(ch) == word.lastIndexOf(ch)).findFirst();
		
		Optional<Character> res1 =  word.chars().mapToObj(c->(char)c).filter(ch->word.indexOf(ch) == word.lastIndexOf(ch)).skip(1).findFirst();
		
		System.out.println(res.get());
		
		System.out.println(res1.get());
	}
}
