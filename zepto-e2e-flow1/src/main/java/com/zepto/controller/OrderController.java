package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zepto.request.OrderRequest;
import com.zepto.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderserv;
	
	@PostMapping("/placeorder")
	public String placeOrder(@ModelAttribute OrderRequest request) {
		
		System.out.println("Item name: " + request.getItemName());
		System.out.println("Item Quantity: " + request.getItemQuantity());
		System.out.println("Item Price: " + request.getPrice());
		
		orderserv.orderService(request);
		
		return "page-response";
	}
}
