package com.mateus.warehouse_manegement_system.service;

import com.mateus.warehouse_manegement_system.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WarehouseService {

    private final WarehouseRepository warehouseRepository;
}
