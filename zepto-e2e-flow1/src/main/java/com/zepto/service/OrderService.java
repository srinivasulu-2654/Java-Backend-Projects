package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.repo.OrderRepo;
import com.zepto.request.OrderRequest;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	public void orderService(OrderRequest orderRequest) {
		
		System.out.println("orderService()....START");
		
		System.out.println("OrderService Item Name is: " + orderRequest.getItemName());
		System.out.println("OrderService Quantity is: " + orderRequest.getItemQuantity());
		System.out.println("OrderService Price is: " + orderRequest.getPrice());
		
		OrderEntity order = new OrderEntity();
		order.setItemName(orderRequest.getItemName());
		order.setItemQuantity(orderRequest.getItemQuantity());
		order.setPrice(orderRequest.getItemQuantity());
		
		orderRepo.save(order);
		
		System.out.println("orderService()....END");
	}
}
