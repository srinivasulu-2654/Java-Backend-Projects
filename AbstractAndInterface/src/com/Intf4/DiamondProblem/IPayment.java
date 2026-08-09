package com.Intf4.DiamondProblem;

public interface IPayment {
//	void pay();
	
	default void pay() {
		System.out.println("IPayment.pay()"); // x 
	}
}
