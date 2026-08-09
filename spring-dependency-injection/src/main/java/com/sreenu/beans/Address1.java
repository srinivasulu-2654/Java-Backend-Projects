package com.sreenu.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address1 {
	
	@Value("12th main")
	private String line1;
	@Value("MCN nager")
	private String line2;
	@Value("CHN")
	private String city;
	@Value("TN")
	private String state;
	@Value("600097")
	private String pinCode;
	
	
//	public Address1(String line1, String line2, String city, String state, String pinCode) {
//		super();
//		this.line1 = line1;
//		this.line2 = line2;
//		this.city = city;
//		this.state = state;
//		this.pinCode = pinCode;
//	}


	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
