package com.sreenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchProducts {
	
	@GetMapping("/viewProducts")
	public String viewProducts() {
		System.out.println("SearchProducts.viewProducts()::::::::::::::::::");
		return "search-products";
	}
	
	@GetMapping("/searchProduct")
	@ResponseBody
	public String searchProducts(@RequestParam("searchText") String input) {
		System.out.println("Searching for the string: " + input);
		return "Apple iPhone 14, 128GB, Midnight - Unlocked (Renewed)";
	}
}
