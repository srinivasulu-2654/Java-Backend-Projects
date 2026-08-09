package com.kodewala.Set;
import java.util.*;

public class Driver4 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(16); // 2000
		
		set.add("BLR1");
		set.add("BLR2");
		set.add("BLR3");
		set.add("BLR4");
		set.add("BLR5");
		set.add("BLR6");
		set.add("BLR7");
		set.add("BLR8");
		set.add("BLR9");
		set.add("BLR10");
		set.add("BLR11");
		set.add("BLR12");
		
		System.out.println(set);
		
		set.add("BLR13");
		set.add("BLR14");
		
		System.out.println(set);
	}

}
