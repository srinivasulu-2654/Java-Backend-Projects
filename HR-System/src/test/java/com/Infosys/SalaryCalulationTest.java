package com.Infosys;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class SalaryCalulationTest {
	
	// here object is creating again and again in every method
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("SalaryCalulationTest.beforeAll().....Only once");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("SalaryCalulationTest.beforeTest()......");
	} 
	
	@Test
	public void testCalculateSalaryBelow5k() {
		
		SalaryCalculation slaryCalculation = new SalaryCalculation();
		String expectedMessage = "Less than 5k not allowed to testing";
		
		Map<String,Object> res =  slaryCalculation.calculateSalary(4000);
		
		String erroMessage = (String) res.get("Error");
		
		assertEquals(expectedMessage, erroMessage);
		
	}
	
	@Test
	public void testCalculateSalaryBelow10k() {
		
		SalaryCalculation slaryCalculation = new SalaryCalculation();
		int expectedCTC = 9000;
		
		Map<String,Object> res =  slaryCalculation.calculateSalary(9000);
		
		int actualCTC = (int)res.get("CTC");
		
		assertEquals(expectedCTC, actualCTC);
		 
	}
	
	@Test
	public void testCalculateSalaryabove10k() {
		
		SalaryCalculation slaryCalculation = new SalaryCalculation();
		int expectedCTC = 26400;
		
		Map<String,Object> res =  slaryCalculation.calculateSalary(24000);
		
		int actualCTC = (int) res.get("CTC"); 
		
		assertEquals(expectedCTC, actualCTC);
		
	}
 
}
