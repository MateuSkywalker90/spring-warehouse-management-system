package com.mateus.warehouse_manegement_system.repository;

import com.mateus.warehouse_manegement_system.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
