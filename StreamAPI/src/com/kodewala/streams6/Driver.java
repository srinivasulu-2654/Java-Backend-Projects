package com.kodewala.streams6;

import java.util.Arrays;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		// Find the 2nd highest salary
		// 1.Remove duplicates -> 2. Sort (desc) -> 3. skip (1 ele) -> 4.findFirst()
		
		List<Integer> nums = Arrays.asList(123000,56000,1233434,10000,12000,123000);
		
		Optional<Integer> res = nums.stream().distinct().sorted((a,b)-> (b-a)).skip(1).findFirst();
		
		System.out.println(res.get());
	}

}
