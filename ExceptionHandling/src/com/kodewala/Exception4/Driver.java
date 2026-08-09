package com.kodewala.Exception4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		
		try {
			System.out.println("try block --- START");
			
			 br = new BufferedReader(new FileReader
					("C:\\Users\\srini\\Documents\\Java Backend Course Full - Kodewala\\Revision\\ExceptionHandling\\src\\com\\kodewala\\Test.txt.txt")); // opened the connection with the file
			
			String name = args[0]; // this may throw the exception
			
			//br.close(); // closing the file connection 
			//(here once your job is done you need to disconnect with file) -> as like you should end up the call whenever you have completed your talk with other person
			 
			System.out.println("try block --- END");
			
			//System.exit(0); // it will kill the JVM
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Name is not provided here");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Someother exception is exceuted ......");
		}
		finally {
			// the job of finally is "Mandatory executable"
			br.close(); // so it is better to put always in finally block to close the connection forcefully
			System.out.println("Driver.main().....finally block.....");
		}
		
		
	}

}
