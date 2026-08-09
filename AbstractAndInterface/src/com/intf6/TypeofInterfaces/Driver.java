package com.intf6.TypeofInterfaces;


// here all the sensitive data so this can access by anyone right

class Account implements DataPrintable{
	double balance;
	String acctNumber;
	String pin;
	
	public Account(double balance, String acctNumber,String pin)
	{
		super();
		this.balance = balance;
		this.acctNumber = acctNumber;
		this.pin = pin;
	}
}

class DataProcessor {
	public void printDetails(Object obj) {
		
		if(obj instanceof DataPrintable) { // it will be true if Account class implements DataPrintable()
		
			Account acc = (Account)obj;
			System.out.println("account balance: " +  acc.balance);
			System.out.println("account Number: " + acc.acctNumber);
			System.out.println("account pin: " + acc.pin);
		}
		else {
			System.err.println("DataNotPrintableException");
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Account acct = new Account(1000, "12345678", "1234");
		DataProcessor dataProcessor = new DataProcessor();
		dataProcessor.printDetails(acct);
	}

}
