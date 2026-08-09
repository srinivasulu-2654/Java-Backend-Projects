package com.sreenu.bean;

public class Account {
	
	private String acctNo;
	
	
	
	public String getAcctNo() {
		return acctNo;
	}



	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}



	public void doSomething() {
		System.out.println("Account.doSomthing().....  and acctNo is " + acctNo);
	}
}
