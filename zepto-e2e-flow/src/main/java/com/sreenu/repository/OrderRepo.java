package com.sreenu.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.entity.OrderEntity;

@Repository
public interface OrderRepo extends CrudRepository<OrderEntity, Integer>{
	
	
}