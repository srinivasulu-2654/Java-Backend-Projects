package com.kodewala.Exception6;

import java.io.BufferedReader;
import java.io.FileReader;

/* 
  
  @author Sreenu
  @since 27
  
  This class is responsible for ......
  
 */

public class Driver {

	public static void main(String[] args) {

		
		System.out.println("Driver.main().....");
		
		try(BufferedReader br = new BufferedReader(new FileReader("Read a file path..."));
				
				
				
				) { // java 1.7 or java 7
			
			String line;
			while((line = br.readLine()) != null)
				{
					System.out.println(line);
				}

		} catch(Exception e) {
			 // handle --> closing part
		}
		
		// automatically finally block will exceute by java
	}



}
