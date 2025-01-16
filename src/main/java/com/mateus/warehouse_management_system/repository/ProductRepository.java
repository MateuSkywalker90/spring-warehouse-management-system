package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
