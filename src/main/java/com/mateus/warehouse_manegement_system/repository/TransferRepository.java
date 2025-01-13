package com.mateus.warehouse_manegement_system.repository;

import com.mateus.warehouse_manegement_system.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
