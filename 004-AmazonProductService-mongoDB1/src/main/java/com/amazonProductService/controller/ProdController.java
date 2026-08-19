package com.amazonProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonProductService.request.ProdRequest;
import com.amazonProductService.service.ProductService;

@RestController
@RequestMapping("/amazon/products")
public class ProdController {
	
	@Autowired
	ProductService prodService;
	
	@PostMapping("/createProduct")
	public String createProduct(@RequestBody ProdRequest prodReq) {
		
		return prodService.saveProduct(prodReq);
	}
}
