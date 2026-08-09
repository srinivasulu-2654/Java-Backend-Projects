package com.sreenu.test;

public class Address {
	
	private String lineNo1;
	private String city;
	private String state;
	private String pinCode;
	
	
	
	public Address(String lineNo1, String city, String state, String pinCode) {
		super();
		this.lineNo1 = lineNo1;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	public String getLineNo1() {
		return lineNo1;
	}
	public void setLineNo1(String lineNo1) {
		this.lineNo1 = lineNo1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
