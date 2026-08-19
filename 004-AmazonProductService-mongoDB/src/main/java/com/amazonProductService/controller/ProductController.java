package com.amazonProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonProductService.request.ProductRequest;
import com.amazonProductService.service.ProductService;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	@PostMapping("/saveproduct")
	public String createProduct(@RequestBody ProductRequest request)
	{
		String name = prodService.createProduct(request);
		return name;
	}
}
