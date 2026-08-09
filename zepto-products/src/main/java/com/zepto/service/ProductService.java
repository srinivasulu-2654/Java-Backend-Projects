package com.zepto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.CategoryRepo;
import com.zepto.repository.ProductRepo;
import com.zepto.request.ProductRequest;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	
	public String searchProduct(String input) {
		
		String response = null;
		
//		List<ProductEntity> products = (List<ProductEntity>) productRepo.findAll();
		
		ProductEntity product =  productRepo.findProductByProductName(input);
		
		response = product.getProductName() + " " + product.getProductId() + " " + product.getQuantity();
		
/*		for(ProductEntity entity : products) {
			
			if(entity.getProductName().equalsIgnoreCase(input)) {
				
				System.out.println("Product Found!!!!!!");
				response = entity.getProductName() + " " + entity.getProductId() + " " + entity.getQuantity();
				break;
			}
		} */
		
		return response;
	}
	
	public void getCategories() {
		List<CategoryEntity> categories = (List<CategoryEntity>) categoryRepo.findAllCategories(); // one query
		
		for(CategoryEntity category : categories)
		{
			System.out.println("Name : " + category.getCategory() + " " + "CategoryId: " + " " + category.getCategory_id());
			
			List<ProductEntity> products = category.getProductEntity(); // fired the query to get product(2)
			
			for(ProductEntity product : products) {
				System.out.println("ProductId: " + product.getProductId() + "Product Name: " + product.getProductName());
			}
		}
	}
	
	public long createProduct(ProductRequest productReq)
	{
		ProductEntity entity = new ProductEntity();
		
		entity.setBrand(productReq.getBrand());
		entity.setDescription(productReq.getDescription());
		entity.setPrice(productReq.getPrice());
		entity.setProductName(productReq.getProductName());
		entity.setQuantity(productReq.getQuantity());
		
		/* Did for @OneToOne mapping
		
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategory(productReq.getCategory());
		categoryEntity.setStatus("Active"); */
		
		// searching wheather category is present in categoryEntity
		CategoryEntity categoryEntity = categoryRepo.findByCategory(productReq.getCategory());
		
		if(categoryEntity == null)
		{
			categoryEntity = new CategoryEntity();
			categoryEntity.setCategory(productReq.getCategory());
			categoryEntity.setStatus("Active");
			
			categoryRepo.save(categoryEntity);
		}
		
		entity.setCategoryEntity(categoryEntity);
		
		ProductEntity responseEntity =  productRepo.save(entity); 	
		
		long productId = responseEntity.getProductId();
		
		if(productId > 0) {
			System.out.println("Product id is successfully created: " + productId);
		}
		else {
			System.out.println("Unable to create the product id");
		}
		
		return productId;
	}
}
