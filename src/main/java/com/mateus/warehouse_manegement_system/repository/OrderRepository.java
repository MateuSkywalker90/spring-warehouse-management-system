package com.mateus.warehouse_manegement_system.repository;

import com.mateus.warehouse_manegement_system.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
