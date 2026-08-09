package com.intf6.TypeofInterfaces;

@FunctionalInterface
public interface MyInterface { // SAM --- single abstract method
	
	public abstract String doSomething(); // public abstract String doSomething()
	
	public default void doNothing() {
		
	}
}
