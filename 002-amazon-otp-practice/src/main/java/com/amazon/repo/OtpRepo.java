package com.amazon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.entity.OtpEntity;

@Repository
public interface OtpRepo extends JpaRepository<OtpEntity, Integer>{

	
}
