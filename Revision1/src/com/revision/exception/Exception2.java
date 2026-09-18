package com.revision.exception;


class Delivery{
	
	String name;
	String addressLine1;
	String addressLine2;
	String city;
	String pincode;
	
	public Delivery(String name,String addressLine1,String addressLine2,String city,String pincode) {
		this.name = name;
		this.addressLine1=addressLine1;
		this.addressLine2=addressLine2;
		this.city=city;
		this.pincode=pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}


class Order{
	String status;
	String message;
	
	public Order(String status, String message) {
		
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

public class Exception2 {
	
	public static void main(String[] args) {
		
		Delivery delivery = new Delivery("Sreenu", "gandhiPark", "Reddystreet", "Atmakur", null);
		
		Order order = null;
		
		try {
			
			String address1 = delivery.getAddressLine1();
			String address2 = delivery.getAddressLine2();
			String pincode = delivery.getPincode();
			System.out.println(pincode.codePointAt(0));
		}catch(NullPointerException exe) {
			order = new Order("Hold", "Address is incomplete"); 
		}
		
		System.out.println("Order status is : " + order.getStatus());
	}
}	
