package com.notify.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notify.entity.NotificationEntity;

@Repository
public interface NotificationRepo extends JpaRepository<NotificationEntity, String>{

}
