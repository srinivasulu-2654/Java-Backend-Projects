package com.amazonProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazonProductService.entity.ProdEntity;
import com.amazonProductService.repo.ProductRepo;
import com.amazonProductService.request.ProdRequest;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo prodRepo;
	
	
	public String saveProduct(ProdRequest prodRequest) {
		
		ProdEntity prodEntity = new ProdEntity();
		prodEntity.setProductId(prodRequest.getProductId());
		prodEntity.setBrand(prodRequest.getBrand());
		prodEntity.setModel(prodRequest.getModel());
		prodEntity.setPrice(prodRequest.getPrice());
		prodEntity.setProductName(prodRequest.getProductName());
		
		prodRepo.save(prodEntity);
		
		return "Product has been saved";
	}
}
