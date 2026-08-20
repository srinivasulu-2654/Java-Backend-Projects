package com.irctc.booking.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "003-payment-service")
public interface PaymentClient {
	
	@PostMapping("/pay/{amount}")
	public String makePayment(@PathVariable int amount);
}
