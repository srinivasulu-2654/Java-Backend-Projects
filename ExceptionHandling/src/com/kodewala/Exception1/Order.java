package com.kodewala.Exception1;

public class Order {
	
	public void doSomething()
	{
		String name = null; // assume : received from the other class
		
		try {
			
			System.out.println(name.length()); // risky code
			System.out.println("After the Length....");
			int i = 10/0;
			String a[] = {};
			String str = a[5];
			
		} catch(Exception e) { // null pointer exception is child of Exception class
			
			name = "NA";
			e.printStackTrace();
		}
		
		// priority would be  child exception and then -> parent exception
		// small -> medium -> large
		
 		/* catch(NullPointerException e) {
			
		}
		
		catch(IndexOutOfBoundsException e) {
			
		} */
		
		for(int i=0;i<5;i++)
		{
		    System.out.println("Driver.main() .... " + i);
		}
	}
}
