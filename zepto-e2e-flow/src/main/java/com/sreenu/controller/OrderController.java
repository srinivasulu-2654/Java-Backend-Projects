package com.sreenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sreenu.request.OrderRequest;
import com.sreenu.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("orderdetails")
	public String orderDetails(@ModelAttribute OrderRequest orderRequest)
	{
		System.out.println("OrderController Item Name is: " + orderRequest.getItemName());
		System.out.println("OrderController Quantity is: " + orderRequest.getQty());
		System.out.println("OrderController Price is: " + orderRequest.getPrice());
		
		orderService.orderService(orderRequest);
		
		return "order-page-response";
	}
}
