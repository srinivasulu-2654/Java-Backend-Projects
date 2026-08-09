package com.intf5.TypeofInterfaces;

public class Person implements Cloneable {
	
	String name;
	Person(String _name)
	{
		this.name = _name;
	}
	
	@Override
	public Person clone() throws CloneNotSupportedException {
		
		return (Person) super.clone(); // object class clone
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p = new Person("Sreenu");
		
		Person p1 = p.clone();
		
		System.out.println(" p " + p.name);
		System.out.println(" p1 " + p1.name);
		
		if(p instanceof Cloneable) { // true if Person's object is type of Clonable  --> Person class should implement Cloneable interface
			System.out.println(" p is type of Clonable");
		}
		else {
			System.out.println(" p is not a type of Clonable. You can not clone the object of Person class");
		}
		
		// here if you wont implement Cloneable then it the object of Person can not clone
	}

}
