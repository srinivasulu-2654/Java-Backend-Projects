package com.Intf4.DiamondProblem;

public interface IRefund {

//	void pay();
	
	default void pay() {
		System.out.println("IRefund.pay()"); // Y
	}
}
