package com.amazonProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonProductService.entity.ProductEntity;
import com.amazonProductService.repo.ProductRepository;
import com.amazonProductService.request.ProductRequest;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	public String createProduct(ProductRequest prodRequest)
	{
		ProductEntity productEntity = new ProductEntity();
		
		productEntity.setProductName(prodRequest.getProductName());
		productEntity.setBrand(prodRequest.getBrand());
		productEntity.setModel(prodRequest.getBrand());
		productEntity.setPrice(prodRequest.getPrice());
		
		productRepo.save(productEntity);
		
		return "Product has been successfully created";
	}
}
