package com.mateus.warehouse_manegement_system.repository;

import com.mateus.warehouse_manegement_system.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
