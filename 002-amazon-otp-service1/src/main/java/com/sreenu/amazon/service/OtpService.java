package com.sreenu.amazon.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.amazon.entity.OtpEntity;
import com.sreenu.amazon.repo.OtpRepository;
import com.sreenu.amazon.request.OtpReponse;

@Service
public class OtpService {
	
	@Autowired
	 OtpRepository otpRepository;
	
	
	public OtpReponse saveOtp(String name,String mobile)
	{
		OtpEntity otpEntity = new OtpEntity();
		otpEntity.setOtp(generateOtp());
		otpEntity.setStatus("Active");
		otpEntity.setName(name);
		otpEntity.setMobile(mobile);
		
		OtpEntity response =  otpRepository.save(otpEntity);
		if(response.getOtp() > 0)
		{
			System.out.println("Otp saved succesfully ..........");
		}
		else {
			System.out.println("Unable to save the otp...");
		}
		
		OtpReponse otpResponse = new OtpReponse();
		otpResponse.setOtp(response.getOtp());
		otpResponse.setStatus(response.getStatus());
		otpResponse.setValid("5 mins");
		
		return otpResponse;
	}
	
	public int generateOtp() {
		
		SecureRandom random = new SecureRandom();

        int otp = 100000 + random.nextInt(900000);

        System.out.println("Your OTP is: " + otp);
        
        return otp;
	}
}
