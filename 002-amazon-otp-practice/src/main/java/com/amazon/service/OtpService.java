package com.amazon.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.OtpEntity;
import com.amazon.entity.OtpResponse;
import com.amazon.repo.OtpRepo;

@Service
public class OtpService {
	
	@Autowired
	 OtpRepo optRepo;
	
	public OtpResponse saveOtp(String name,String phoneNo)
	{
		OtpEntity otpEntity = new OtpEntity();
		otpEntity.setOtp(generteOtp());
		otpEntity.setName(name);
		otpEntity.setPhoneNo(phoneNo);
		otpEntity.setStatus("Active");
		
		OtpEntity response =  optRepo.save(otpEntity);
		
		if(response.getOtp() > 0) {
			System.out.println("Otp successfully got generated: " + response.getOtp());
		}
		else {
			System.out.println("Otp didn't got generated");
		}
		
		OtpResponse otpResponse = new OtpResponse();
		
		otpResponse.setOtp(response.getOtp());
		otpResponse.setStatus(response.getStatus());
		otpResponse.setValidUpto("Valid upto 5 mins");
		
		return otpResponse;
	}
	
	public int generteOtp()
	{
		SecureRandom random = new SecureRandom();

        int otp = 100000 + random.nextInt(900000);

        System.out.println("Your OTP is: " + otp);
        
        return otp;
	}
}
