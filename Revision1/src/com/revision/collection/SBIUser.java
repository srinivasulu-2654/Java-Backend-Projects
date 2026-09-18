package com.revision.collection;

public class SBIUser {
	
	String name;
	String address;
	String ifscCode;
	int balance;
	public SBIUser(String name, String address, String ifscCode, int balance) {
		super();
		this.name = name;
		this.address = address;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
