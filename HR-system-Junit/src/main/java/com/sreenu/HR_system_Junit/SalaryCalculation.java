package com.sreenu.HR_system_Junit;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class SalaryCalculation  
{ 
    public Map<String, Object> calculateSalary(int baseSalary){
    	
    	Map<String, Object> salDetails = new HashMap<String, Object>();
    	
    	if(baseSalary<5000) {
    		salDetails.put("Error", "Salary less than 5k is not allowed to test");
    	} 
    	
    	else if(baseSalary<10000) {
    		salDetails.put("base", baseSalary);
    		salDetails.put("bonus", 0);
    		salDetails.put("tax", 0);
    		salDetails.put("CTC", baseSalary);
    	}
    	 
    	else {
    		 
    		int bonus = (baseSalary * 20) / 100;
    		int tax = (baseSalary * 10) / 100;
    		int CTC = baseSalary + bonus - tax;
    		
    		salDetails.put("base", baseSalary);
    		salDetails.put("bonus", bonus);
    		salDetails.put("tax", tax);
    		salDetails.put("CTC", CTC);
    	}
    	
    	
    	return salDetails;
    }
}
