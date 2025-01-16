package com.mateus.warehouse_management_system.repository;

import com.mateus.warehouse_management_system.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
