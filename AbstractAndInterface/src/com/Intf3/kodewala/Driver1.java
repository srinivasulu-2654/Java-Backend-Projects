package com.Intf3.kodewala;

interface EcomSystem {
	
	void placeOrder();
	void cancelOrder();
	void editOrder();
//	void generateInvoice();  for example if we change this as default na it will look like this
	
	default void generateInvoice()
	{
		// 500 + send sms 
		sendSms();
	}
	
	
	public static void printInvoicePDF() // common functionality
	{
		// 200 lines of code (connect to server --> init print ---> write to file ----> send to customer)
		connectServer();
		notfiyCustomers();
	}
	
	public static void sendNotification() {
		// connect to server ----> draft email ----> send to customer
		
	}
	
	private static void connectServer() {
		// 50 lines
	}
	
	private static void notfiyCustomers() {
		// 50 lines
	}
	
	private  void sendSms() { // this is for default methods
		// 50 lines
	}
}

class Amazon implements EcomSystem {

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateInvoice() {
		// TODO Auto-generated method stub
		printInvoicePDF("path to pdf", "AmazonLogo");
		
	}
	
	private void printInvoicePDF(String path,String companyLogo) {
		// 200 lines of code
		EcomSystem.printInvoicePDF(); // instead of writing 200 lines of code here also we can make the above "static"
	}
	
}

class Flipkart implements EcomSystem {

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateInvoice() {
		// TODO Auto-generated method stub
		printInvoicePDF("path to pdf", "Flipkart Logo");
	}
	
	private void printInvoicePDF(String path,String companyLogo) {
		// 200 lines of code
		EcomSystem.printInvoicePDF(); // instead of writing 200 lines of code here also we can make the above "static"
	}
	
	
}

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
