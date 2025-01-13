package com.mateus.warehouse_manegement_system.repository;

import com.mateus.warehouse_manegement_system.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
