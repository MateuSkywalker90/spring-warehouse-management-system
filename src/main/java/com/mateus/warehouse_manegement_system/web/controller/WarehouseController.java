package com.mateus.warehouse_manegement_system.web.controller;

import com.mateus.warehouse_manegement_system.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/warehouses")
public class WarehouseController {

    private final WarehouseService warehouseService;
}
