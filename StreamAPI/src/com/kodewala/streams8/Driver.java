package com.kodewala.streams8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver {

	public static void main(String[] args) {
		
		
		// find the sum of all the numbers
		
//		List<Integer> nums = Arrays.asList(10,8,14,3,9,18,3,11,24);
		
		// int sum = nums.stream().filter(x -> x%2 != 0).reduce(0,(a,b) -> (a+b)); // sum of only odd numbers
		
		//System.out.println(sum);
		
		List<Integer> nums = Arrays.asList(10,8,14,3,9,18,3,11,24);
		
		
		// find the minimum
		Optional<Integer> mini = nums.stream().min((a,b) -> a - b);
		
		// find the maximum
		Optional<Integer> maxi = nums.stream().max((a,b) -> a - b);
		
		System.out.println(maxi.get());
		

	}

}
