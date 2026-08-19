package com.amazonProductService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amazonProductService.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, Long>{

}
