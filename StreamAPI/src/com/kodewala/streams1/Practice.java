package com.kodewala.streams1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		List<String> companies = Arrays.asList("fiserv","capgemini","ford","tcs","qualcomm","hyland");
		
		Stream<String> company = companies.stream();
		
		Stream<String> convertedCase = company.map(word -> word.toUpperCase());	
		
		List<String> res = convertedCase.collect(Collectors.toList());
		
		System.out.println(res);

	}

}
