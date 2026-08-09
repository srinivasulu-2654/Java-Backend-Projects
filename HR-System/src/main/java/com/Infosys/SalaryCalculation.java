package com.Infosys;
import java.util.*;
/**
 * Hello world!
 *
 */
public class SalaryCalculation  
{
   public Map<String,Object> calculateSalary(int baseSalary){
	   
	   Map<String,Object> salDetails = new HashMap<String,Object>();
	   
	   if(baseSalary < 5000) {
		   salDetails.put("Error", "Less than 5k not allowed to testing");
	   }
	   
	   if(baseSalary < 10000) 
	   {
		   salDetails.put("base",baseSalary);
		   salDetails.put("bonus",0);
		   salDetails.put("tax",0);
		   salDetails.put("CTC",baseSalary);
	   }
	   
	   else 
	   {
		   int bonus = (baseSalary*20) / 100; // giving 20% as bonus in the baseSalary
		   int tax = (baseSalary*10) / 100;
		   int ctc = baseSalary + bonus - tax;
		   
		   salDetails.put("base",baseSalary);
		   salDetails.put("bonus",bonus);
		   salDetails.put("tax",tax);
		   salDetails.put("CTC",ctc);
	   }
	   
	   return salDetails;
   }
}
