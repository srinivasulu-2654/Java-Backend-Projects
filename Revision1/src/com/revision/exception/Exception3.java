package com.revision.exception;

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception3 {
	
	public static void main(String[] args) throws IOException {
		
		Exception3 fileReader = new Exception3();
		fileReader.readFile();
	}
	
	public void readFile() throws IOException {
		
		String fileName =  "C:\\Users\\srini\\Documents\\Java Backend Course Full - Kodewala\\Revision\\Revision1\\src"
				+ "\\com\\revision\\exception\\sales_file.txt";
		
		try {
			
			BufferedReader br  = new BufferedReader(new FileReader(fileName));
			
			String line;
			
			while((line = br.readLine()) != null) {
				String lineArray[] = line.split(",");
				String city = lineArray[3];
				if(city.equals("Bangalore")) {
					System.out.println(line);
				}
				
			}
			
		} catch(FileNotFoundException ex) {
			System.out.println("File is not founded here");
			ex.printStackTrace();
		}
	}
}
