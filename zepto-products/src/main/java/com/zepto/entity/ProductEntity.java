package com.zepto.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity { // child
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	private String productName;
	private String brand;
	private String quantity;
	private String price;
	private String description;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="category_id")
//	private CategoryEntity categorityEntity;
	
	@ManyToOne // multiple child(product) will have 1 parent(category)
	@JoinColumn(name="category_id")
	private CategoryEntity categoryEntity;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public CategoryEntity getCategorityEntity() {
//		return categorityEntity;
//	}
//	public void setCategorityEntity(CategoryEntity categorityEntity) {
//		this.categorityEntity = categorityEntity;
//	}
//	
//	
//	
	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}
	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}
	
	
}
