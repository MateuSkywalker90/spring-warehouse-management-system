package com.mateus.warehouse_manegement_system.repository;

import com.mateus.warehouse_manegement_system.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {
}
