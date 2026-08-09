package com.kodewala.streams5;

import java.util.List;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(10,4,5,6,6,7,8);
		
		// print first element of the list
		
		Optional<Integer> optional = input.stream().findFirst();
		System.out.println(optional.get());

	}

}
