package com.sreenu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.entity.OrderEntity;
import com.sreenu.repository.OrderRepo;
import com.sreenu.request.OrderRequest;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	
	public boolean orderService(OrderRequest orderRequest) {
		
		System.out.println("OrderService.orderService......START");
		
		System.out.println("OrderService Item Name is: " + orderRequest.getItemName());
		System.out.println("OrderService Quantity is: " + orderRequest.getQty());
		System.out.println("OrderService Price is: " + orderRequest.getPrice());
		
		
		OrderEntity entity = new OrderEntity();
		
		entity.setItemName(orderRequest.getItemName());
		entity.setQty(orderRequest.getQty());
		entity.setPrice(orderRequest.getPrice());
		
		orderRepo.save(entity);
		
		System.out.println("OrderService.orderService......END");
		
		return true;
	}
}
