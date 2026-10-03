package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.entity.OtpRequest;
import com.amazon.entity.OtpResponse;
import com.amazon.service.OtpService;

@RestController
public class OtpController {
	
	@Autowired
	OtpService otpService;
	
	@PostMapping("/generate")
	public OtpResponse generateOtp(@RequestBody OtpRequest otpReq)
	{
		String name = otpReq.getName();
		String mobileNo = otpReq.getMobileNo();
		
		OtpResponse response = otpService.saveOtp(name, mobileNo);
		
		return response;
	}
}
