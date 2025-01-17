package com.mateus.warehouse_management_system.service;

import com.mateus.warehouse_management_system.entity.Warehouse;
import com.mateus.warehouse_management_system.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class WarehouseService {

    private final WarehouseRepository warehouseRepository;

    @Transactional
    public Warehouse save(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }
}
