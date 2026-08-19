package com.productsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.productsearch.entity.ProductEntity;
import com.productsearch.repository.ProductRepo;

@Service
public class ProdService {
	
	@Autowired
	ProductRepo prodRepo;
	
	@Cacheable(value = "product_search",key = "#id")
	public ProductEntity searchProduct(Long id) {
		System.out.println("Fetching from the DB......");
		
		return prodRepo.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
	}
}
