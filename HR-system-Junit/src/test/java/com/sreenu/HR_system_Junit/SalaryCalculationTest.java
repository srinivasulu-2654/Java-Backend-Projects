package com.sreenu.HR_system_Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class SalaryCalculationTest {
	
	@Test
	public void salaryBelow5k() {   
		
		SalaryCalculation salaryCalculation = new SalaryCalculation();
		
		
		String expectedMessage = "Salary less than 5k is not allowed to test";
		
		Map<String,Object> res = salaryCalculation.calculateSalary(4000);
		
		String errorMessage =  (String)res.get("Error");
		
		assertEquals(expectedMessage, errorMessage);
	}
	
	@Test
	public void salaryBelow10k() {
		
		SalaryCalculation salaryCalulation = new SalaryCalculation();
		
		int expectedCTC = 9000; 
		
		Map<String, Object> res = salaryCalulation.calculateSalary(9000);
		
		int actualCTC = 	(int)res.get("CTC");
		
		assertEquals(expectedCTC, actualCTC);
	}
	
	@Test
	public void salaryAbove10k() { 
		
		SalaryCalculation salaryCalculation = new SalaryCalculation();
		
		int expectedCTC = 4800;
		
		Map<String,Object> res = salaryCalculation.calculateSalary(24000);
		
		int actualCTC = (int)res.get("bonus");
		
		assertEquals(expectedCTC, actualCTC); 
	}
}