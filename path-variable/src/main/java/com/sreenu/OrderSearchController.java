package com.sreenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderSearchController {
	
	@GetMapping("/details/{orderId}/{value}")
	@ResponseBody
	public String orderDetails(@PathVariable("orderId") String orderId, @PathVariable("value") String value) {
		
		System.out.println("Getting the Order Details:::::::");
		System.out.println("Order Id is : " + orderId);
		System.out.println("Value is: " + value);
		return "your orderid and details are ::: " + orderId;
	}
}
