package com.kodewala.abstractinterface;

/* 
 Develop a e-com delivery system and make use of abstract class

	-> Abstract Method
	-> Non abstract methods -> this will be mostly (providing default functionalities)
 */

abstract class EcommerceApp {
	
	abstract void deliverOrder();
	
	public void packOrder() {
		System.out.println("Order packed successfully");
	}
	
	public void trackOrder() {
		System.out.println("Tracking the Order: ......");
	}
}

class AmazonExpress extends EcommerceApp{
	
	@Override
	public void deliverOrder() {
		System.out.println("Amazon Delivery partner delivered the order");
	}
}

class Flipkart extends EcommerceApp {
	
	@Override
	public void deliverOrder() {
		System.out.println("Flipkart Delivery partner delivered the order");
	} 
}

public class AbstractDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EcommerceApp amazon = new AmazonExpress();
		amazon.deliverOrder();
		amazon.packOrder();
		amazon.trackOrder();
		
		EcommerceApp flipkart = new Flipkart();
		flipkart.deliverOrder();
		flipkart.packOrder();
		flipkart.trackOrder();

	}

}
