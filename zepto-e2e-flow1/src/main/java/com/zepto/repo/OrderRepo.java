package com.zepto.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.OrderEntity;

@Repository
public interface OrderRepo extends CrudRepository<OrderEntity, Integer>{

}
