package com.zepto.repo;

import org.springframework.data.repository.CrudRepository;

import com.zepto.entity.CategoryEntity;

public interface CategoryRepo extends CrudRepository<CategoryEntity, Long>{
	
	public CategoryEntity findByCategoryName(String input);
}
