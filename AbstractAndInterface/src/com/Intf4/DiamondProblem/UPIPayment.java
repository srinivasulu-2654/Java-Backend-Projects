package com.Intf4.DiamondProblem;



public class UPIPayment implements IPayment, IRefund{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		IPayment.super.pay(); // X	
		IRefund.super.pay(); // Y
	}

}
