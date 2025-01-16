package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {
}
