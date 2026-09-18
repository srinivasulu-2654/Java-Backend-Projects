package com.sreenu.test;

public class Revision3 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Select * from employees where 1=1");
		
		boolean filterByDept = true;
		
		if(filterByDept) {
			sb.append(" AND dept='IT'");
		}
		
		boolean filterBySalary=true;
		
		if(filterBySalary) {
			sb.append(" AND salary > 5000");
		}
		
		System.out.println(sb);
	}
}
