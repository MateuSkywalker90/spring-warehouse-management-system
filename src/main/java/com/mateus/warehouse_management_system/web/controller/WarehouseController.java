package com.mateus.warehouse_management_system.web.controller;

import com.mateus.warehouse_management_system.entity.Warehouse;
import com.mateus.warehouse_management_system.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/warehouses")
public class WarehouseController {

    private final WarehouseService warehouseService;

    @PostMapping
    public ResponseEntity<Warehouse> create(@RequestBody Warehouse warehouse) {
        Warehouse response = warehouseService.save(warehouse);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
