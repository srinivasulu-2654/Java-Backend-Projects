package com.kodewala.streams7;

import java.util.Arrays;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		 //FInd the 3rd highest even number from the given list of integers
		
		List<Integer> nums = Arrays.asList(10,8,14,3,9,18,3,11,24);
		
		Optional<Integer> res =  nums.stream().distinct().filter(w->w%2==0).sorted((a,b) -> (b-a)).skip(2).findFirst();
		
		System.out.println(res.get());

	}

}
