package com.irctc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.entity.BookingEntity;

@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Long>{
	
//	List<BookingEntity> findByUserId(String name);
}
