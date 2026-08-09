package com.zepto.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity { // Parent
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long category_id;
	private String category;
	private String status;
	
//	@OneToOne(mappedBy = "categorityEntity") // should get from child which are using related to @OneToOne
//	private ProductEntity productEntity;
	
	@OneToMany(mappedBy = "categoryEntity",cascade = CascadeType.ALL, fetch = FetchType.EAGER) // should get from child which are using related to @OneToOne
	private List<ProductEntity> productEntity;

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ProductEntity> getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(List<ProductEntity> productEntity) {
		this.productEntity = productEntity;
	}

//	public ProductEntity getProductEntity() {
//		return productEntity;
//	}
//
//	public void setProductEntity(ProductEntity productEntity) {
//		this.productEntity = productEntity;
//	}
	
	
}
