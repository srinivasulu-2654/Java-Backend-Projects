package com.zepto.service;

import java.util.Iterator;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repo.CategoryRepo;
import com.zepto.repo.ProductRepo;
import com.zepto.request.ProductRequest;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	public String searchProduct(String input)
	{
		String response = null;
		
		ProductEntity product = productRepo.findProductByproductName(input);
		response = product.getProductName() + " " + product.getProductId() + " " + product.getPrice();
		
		/*List<ProductEntity> products =  (List<ProductEntity>) productRepo.findAll();
		
		for(ProductEntity product : products)
		{
			if(product.getProductName().equalsIgnoreCase(input))
			{
				System.out.println("Product found......");
				response = product.getProductName() + " " + product.getProductId() + " " + product.getPrice();
			}
		} */
		
		return response;
	}
	
	public long createProduct(ProductRequest request)
	{
		ProductEntity productEntity = new ProductEntity();
		
		productEntity.setProductName(request.getProductName());
		productEntity.setBrand(request.getBrand());
		productEntity.setQuantity(request.getQuantity());
		productEntity.setPrice(request.getPrice());
		
		CategoryEntity categoryEntity = categoryRepo.findByCategoryName(request.getCategory());
		
		if(categoryEntity == null) {
		
			 categoryEntity = new CategoryEntity();
			categoryEntity.setCategoryName(request.getCategory());
			categoryEntity.setStatus("Active");
			
			categoryRepo.save(categoryEntity);
			
		}
		
		productEntity.setCategory(categoryEntity);
		
		ProductEntity productResponse = productRepo.save(productEntity);
		
		long productId = productResponse.getProductId();
		if(productId > 0)
		{
			System.out.println("Product has been created and product id is: " + productId);
		}
		else {
			System.out.println("Product has not created yet!!!!!");
		}
		
		return productId;
	}
	
	
	public void getCategories() {
		
		Iterable<CategoryEntity> categoryEntites =  categoryRepo.findAll();
		
		for(CategoryEntity categoryEntity : categoryEntites)
		{
			System.out.println("Name : " + categoryEntity.getCategoryName() + " CategoryId: " + categoryEntity.getCategoryId());
			
			List<ProductEntity> productEntities = categoryEntity.getProducts();
			
			for(ProductEntity productEntity : productEntities)
			{
				System.out.println("ProductId: " + productEntity.getProductId() + "Product Name: " + productEntity.getProductName());
			}
		}
	}
}
