package com.zepto.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.ProductEntity;
import java.util.List;


@Repository
public interface ProductRepo extends CrudRepository<ProductEntity, Long>{
	
	public ProductEntity findProductByproductName(String input);
}
