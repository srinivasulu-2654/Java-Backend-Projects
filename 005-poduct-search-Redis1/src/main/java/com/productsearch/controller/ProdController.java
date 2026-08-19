package com.productsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productsearch.entity.ProductEntity;
import com.productsearch.service.ProdService;

@RestController
@RequestMapping("/products")
public class ProdController {
	
	@Autowired
	ProdService prodService;
	
	@GetMapping("/{id}")
	public ProductEntity searchProduct(@PathVariable Long id)
	{
		return prodService.searchProduct(id);
	}
}
