package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
