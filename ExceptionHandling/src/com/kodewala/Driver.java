package com.kodewala;

class Delivery {
	String name;
	String addressLine1;
	String addressLine2;
	String city;
	String pinCode;
	public Delivery(String name, String addressLine1, String addressLine2, String city, String pinCode) {
		super();
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pinCode = pinCode;
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}

class Order {
	
	String status;
	String message;
	public Order(String status, String message) {
		super();
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

public class Driver {

	public static void main(String[] args) {
		
		Delivery delivery = new Delivery("Sreenu","Gandhi park","kurkunda road","Bengaluru",null);
		Order order;
		
		try {
			delivery.getAddressLine1();
			delivery.getAddressLine2();
			
			String pinCode = delivery.getPinCode();
			System.out.println(pinCode.codePointAt(0)); // NPE
			order = new Order("Placed","sent for delivery");
		} catch(NullPointerException e) {
			order = new Order("Hold","Address is incomplete");
		}
		
		System.out.println("Status: " + order.getStatus());
	}

}
