package com.irctc.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.booking.entity.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Long>{
	
}