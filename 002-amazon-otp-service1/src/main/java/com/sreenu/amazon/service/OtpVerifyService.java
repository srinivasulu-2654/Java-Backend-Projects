package com.sreenu.amazon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.amazon.entity.OtpEntity;
import com.sreenu.amazon.repo.OtpRepository;
import com.sreenu.amazon.request.VerifyRequest;
import com.sreenu.amazon.request.VerifyResponse;

@Service
public class OtpVerifyService {
	
	@Autowired
	OtpRepository otpRepositoy;
	
	public VerifyResponse verifyOtp(VerifyRequest verfiyRequest) {
		
		
		Optional<OtpEntity> res =  otpRepositoy.findByMobileAndOtp(verfiyRequest.getMobile(), verfiyRequest.getOtp());
		
		VerifyResponse verifyResponse = new VerifyResponse();
		
		if(res.isPresent()) {
			verifyResponse.setMessage("OTP Verified Successfully");
			verifyResponse.setVerified(true);
		}else {
			verifyResponse.setMessage("invalid OTP");
			verifyResponse.setVerified(false);
		}
		
		return verifyResponse;
	}
}
