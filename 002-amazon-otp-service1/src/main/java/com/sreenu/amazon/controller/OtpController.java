package com.sreenu.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sreenu.amazon.request.OtpReponse;
import com.sreenu.amazon.request.OtpRequest;
import com.sreenu.amazon.request.VerifyRequest;
import com.sreenu.amazon.request.VerifyResponse;
import com.sreenu.amazon.service.OtpService;
import com.sreenu.amazon.service.OtpVerifyService;

@RestController  // controller + ResponseBody
//@RequestMapping("/otp")
public class OtpController {
	
	@Autowired
	 OtpService otpService;
	
	@Autowired
	OtpVerifyService otpVerifyService;

	OtpController(OtpService otpService) {
		this.otpService = otpService;
	}
	
	@PostMapping("/generate")
	private OtpReponse generateOtp(@RequestBody OtpRequest otpRequest) {
		
		String name = otpRequest.getName();
		String mobile = otpRequest.getMobile();
		OtpReponse otp = otpService.saveOtp(name, mobile);
		return otp;
	}
	
	@PostMapping("/verifyOtp")
private VerifyResponse verifyOtp(@RequestBody VerifyRequest verifyRequest) {
		
//		int otp = verifyRequest.getOtp();
//		String mobile = verifyRequest.getMobile();
		VerifyResponse verifyRes = otpVerifyService.verifyOtp(verifyRequest);
		return verifyRes;
	}
}
