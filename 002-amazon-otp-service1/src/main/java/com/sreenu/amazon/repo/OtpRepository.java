package com.sreenu.amazon.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreenu.amazon.entity.OtpEntity;

@Repository
public interface OtpRepository extends JpaRepository<OtpEntity, Integer>{
	
	Optional<OtpEntity> findByMobileAndOtp(String mobile,int otp);
}
