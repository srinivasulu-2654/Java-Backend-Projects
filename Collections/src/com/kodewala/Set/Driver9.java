package com.kodewala.Set;

import java.util.TreeSet;

/* 
 -> Here doing the sorting based on the objects
 */

class Personnnnn implements Comparable<Personnnnn>{
	
	String name;
	int salary;

	public Personnnnn(int salary,String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	@Override
	public int compareTo(Personnnnn obj) { // will return -ve or Zero or +ve (if return 0 means duplicate found)
		
//		return this.salary - obj.salary;
//		return obj.salary - this.salary; // if you want in reverse order (big to small)
//		return (this.name.compareTo(obj.name));
		
		// here need to perform for duplicate attributes which "both attributes duplicate then ignore otherwise print"
		
		if((this.salary == obj.salary) && (this.name == obj.name)) {
			return 0;
		} 
		else 
		{
			return this.salary - obj.salary;
		}
	}
	
	
}

public class Driver9 {

	public static void main(String[] args) {


		TreeSet<Personnnnn> ts = new TreeSet<Personnnnn>(); // will do the sorting of the data
		
		Personnnnn p1 = new Personnnnn(100,"Rajesh");
		Personnnnn p2 = new Personnnnn(60,"Hemanth");
		Personnnnn p3 = new Personnnnn(120,"Pavan");
		Personnnnn p4 = new Personnnnn(82,"Kiran");
		Personnnnn p5 = new Personnnnn(172,"Hemanth");
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		
		System.out.println(ts);
	
		for(Personnnnn obj : ts) {
			System.out.println(obj.name + " and " + obj.salary);
		}
	}

}
