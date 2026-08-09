package com.kodewala.Set;

/*
-> If 2 objects are equals then hash code must be the same
-> if 2 objects are returing the same hashCode, object may or may not be equal

 */

class Person {
	
}

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		System.out.println(p1.hashCode()); // 1159190947
		System.out.println(p2.hashCode()); // 925858445
		
		String s1 = "Sreenu";
		String s2 = "Sreenu";
		
		System.out.println(s1.hashCode()); // -1810356890
		System.out.println(s2.hashCode()); // -1810356890
	}

}
