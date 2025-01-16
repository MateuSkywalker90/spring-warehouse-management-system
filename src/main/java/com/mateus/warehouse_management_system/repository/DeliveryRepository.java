package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
