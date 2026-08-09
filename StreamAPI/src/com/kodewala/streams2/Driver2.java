package com.kodewala.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Driver2 {

	public static void main(String[] args) {

		List<List<String>> input = Arrays.asList(Arrays.asList("Bengaluru","Chennai","Belandur","Kochi"),
				Arrays.asList("Delhi","Chennai"),Arrays.asList("Gawhati","Kochi"));
		
		HashSet<String> set = new HashSet<String>();
		
		List<String> output =  input.stream().flatMap(w->w.stream()).filter(word->!set.add(word)).collect(Collectors.toList());
		
		System.out.println(output);

	}

}
