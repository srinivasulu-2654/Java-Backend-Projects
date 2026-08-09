package com.sreenu.payment.pojo;

public class Payment {
	
	int paymentRefNo;
	String status;
	public int getPaymentRefNo() {
		return paymentRefNo;
	}
	public void setPaymentRefNo(int paymentRefNo) {
		this.paymentRefNo = paymentRefNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void printPaymentDetails() {
		System.out.println("Payment ref No: " + paymentRefNo + " status: " + status);
	}
}
