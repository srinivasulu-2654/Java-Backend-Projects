package com.irctc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.entity.PaymentEntity;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentEntity, Long>{

}
