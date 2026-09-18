package com.revision.streamapis1;

import java.util.Arrays;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(12,34,232,2,123,434,12,56,11,143,53);
		
//		numList.stream().sorted().forEach(num->System.out.println(num));
		
		numList.stream().sorted((a,b)-> (b-a)).forEach(num-> System.out.println(num));
	}
}
