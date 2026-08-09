package com.kodewala.Set1;

import java.util.*;

// so we didn't have any access to touch the "Employee" class so whatever we have to do here only should modify

public class FirstNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.firstName.compareTo(o2.firstName);
	}

}
