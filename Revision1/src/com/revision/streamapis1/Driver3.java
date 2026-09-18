package com.revision.streamapis1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver3 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(13,4342,343,12,32,586,234,434,34356,5346,342231,343421,53425);
		
		Optional<Integer> res = list.stream().distinct().filter(w->w%2!=0).sorted((a,b)->(b-a)).skip(2).findFirst();
		
		System.out.println(res.get());
	}
}
