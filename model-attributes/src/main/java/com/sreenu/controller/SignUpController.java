package com.sreenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sreenu.request.SignupRequest;

@Controller
public class SignUpController {
	
	@PostMapping("signup")
	
	public String signUp(@ModelAttribute SignupRequest request, Model model) {
		
		System.out.println("FirstName is: " + request.getFirstName());
		System.out.println("LastName is: " + request.getLastName());
		System.out.println("Email is: " + request.getEmail());
		System.out.println("PhoneNo is: " + request.getPhone());
		
		// generating the random Id for the user after signup i mean from (client <------ server)
		// String userId = "USER12345";
		
		String first = request.getFirstName().substring(0, 3).toUpperCase();
		String last = request.getLastName().substring(0, 3).toUpperCase();
		String phone = request.getPhone().substring(request.getPhone().length() - 3);

		String userId = first + last + phone;

		model.addAttribute("user", userId);
		

		// setting the value
		model.addAttribute("user",userId);
		return "signup-page";
	}
}
