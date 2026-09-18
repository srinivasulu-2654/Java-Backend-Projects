
package com.revision.streamapis1;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,24,453,5434,53,53214,6);
		
		Optional<Integer> output  = list.stream().findFirst();
		
		System.out.println(output.get());
	}
}
