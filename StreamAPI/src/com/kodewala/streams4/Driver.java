package com.kodewala.streams4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Driver {

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(12,43,4,52,6,7,12,53,52,13234,89,98989,89,89,89);
		
		
		// sorting from small to big
//		input.stream().sorted().forEach(num -> System.out.println(num));
		
		// sorting from big to small
		input.stream().sorted((a,b) -> (b-a)).forEach(num -> System.out.println(num));
				
	}

}
