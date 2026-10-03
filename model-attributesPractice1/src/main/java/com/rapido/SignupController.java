package com.rapido;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.request.SignupRequest;

@Controller
public class SignupController {
	
	@PostMapping("/doSignup")
	public String doSignup(@ModelAttribute SignupRequest request) {
		System.out.println(" first namae: " + request.getFirstName());
		System.out.println(" last namae: " + request.getLastName());
		System.out.println(" email: " + request.getEmail());
		System.out.println(" phone num: " + request.getPhoneNo());
		return "signup-success";
	}
}
