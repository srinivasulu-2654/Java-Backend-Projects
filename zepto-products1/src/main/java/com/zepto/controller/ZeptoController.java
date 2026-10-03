package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.request.ProductRequest;
import com.zepto.service.ProductService;

@Controller
@RequestMapping("/product")
public class ZeptoController {
	
	@Autowired
	ProductService prodService;
	
	@PostMapping("/addProduct")
	public String uploadProduct(@ModelAttribute ProductRequest req) {
		
		prodService.createProduct(req);
		return "response-page";
	}
	
	@GetMapping("/showSearchPage")
	public String showSearchPage() {
		
		return "search-product";
	}
	
	@GetMapping("/search")
	@ResponseBody
	public String getCategories(@RequestParam("searchPrdt") String input) {
//		return "Product found";
		prodService.getCategories();
		return "test";
	}
}
