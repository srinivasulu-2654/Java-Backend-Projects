package com.sreenu.test;

interface A1{
	

	default void show() {
		System.out.println("SHowing from A");
	}
}

interface B1{
	

	default void show() {
		System.out.println("SHowing from B");
	}
}

class C implements A1, B1 {
	
//	@Override
	public void show() {
//		System.out.println("Showing from C");
		A1.super.show();
	}
}

public class DefaultMethods {
	public static void main(String[] args) {
		C dummy = new C();
		dummy.show();
	}
}
