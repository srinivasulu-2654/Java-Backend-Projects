package com.zepto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.zepto.entity.CategoryEntity;

public interface CategoryRepo extends CrudRepository<CategoryEntity, Long>{
	
	public CategoryEntity findByCategory(String input);
	
	@Query("SELECT c From CategoryEntity c JOIN FETCH c.productEntity")
	public List<CategoryEntity> findAllCategories();
}
