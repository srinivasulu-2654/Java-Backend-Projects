package com.revision.streamapis1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver4 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(131,442,4231,534,12314,532412,434,2);
		
		// sum of all the even numbers
		
		int sum = list.stream().filter(w->w%2==0).reduce(0,(a,b)-> (a+b));
		
		System.out.println(sum);
		
		Optional<Integer> mini = list.stream().min((a,b)->(a-b));
		
		Optional<Integer> maxi = list.stream().max((a,b)->(a-b));
		
		System.out.println(mini.get() + " " + maxi.get());
	}
}
