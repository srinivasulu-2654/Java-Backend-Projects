package com.Interface.kodewala;

// here this IBanking set the contract to SBI, HDFC, UnionBank to implement all the methods

public interface IBanking { // 100% contract -> 100 % abstract by default
	
	public abstract void pay();
	
	public abstract void settle();
	
	void addPayee();
	
	void modifyPayee(); // by default all the methods in interface are public and abstract
	
	void doKYC(); // if for example 2 years later this came then all the child classes will implement
	
}


