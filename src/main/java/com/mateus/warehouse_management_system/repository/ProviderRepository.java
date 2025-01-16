package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
