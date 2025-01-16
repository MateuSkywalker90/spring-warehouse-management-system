package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.DeliveryDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryDetailRepository extends JpaRepository<DeliveryDetail, Long> {
}
