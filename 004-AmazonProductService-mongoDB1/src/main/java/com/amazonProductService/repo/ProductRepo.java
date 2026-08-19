package com.amazonProductService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amazonProductService.entity.ProdEntity;

@Repository
public interface ProductRepo extends MongoRepository<ProdEntity, Long>{

}
