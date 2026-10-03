package com.productSearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductSearch {
	
	@GetMapping("/searchprod")
	public String doSearch() {
		System.out.println("ProductSearch.doSearch():::::::::::::::::");
		return "search-products";
	}
	
	@GetMapping("/searchprods")
	@ResponseBody
	public String searchproduct(@RequestParam("searchText") String input) {
		System.out.println("Input is : " + input);
		return "iphone 17e";
	}
}
