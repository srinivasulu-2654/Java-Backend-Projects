package com.kodewala.Exception6;

import java.io.BufferedReader;
import java.io.FileReader;

public class ImportantCode implements AutoCloseable{
	
public static void main(String[] args) {

		
		System.out.println("Driver.main().....");
		
		try(BufferedReader br = new BufferedReader(new FileReader("Read a file path..."));
				
				ImportantCode d = new ImportantCode();
				
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

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
