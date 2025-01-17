package com.mateus.warehouse_management_system.web.controller;

import com.mateus.warehouse_management_system.entity.Provider;
import com.mateus.warehouse_management_system.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/providers")
public class ProviderController {

    private final ProviderService providerService;

    @PostMapping
    public ResponseEntity<Provider> create(@RequestBody Provider provider) {
        Provider response = providerService.save(provider);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
