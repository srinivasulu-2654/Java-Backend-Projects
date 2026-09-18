package com.revision.streamapis1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,4343,534,32,1232,3245,453,3232,3434);
		
		Optional<Integer> optional = list.stream().distinct().sorted((a,b)->(b-a)).skip(8).findFirst();
		
		System.out.println(optional.get());
	}
}
