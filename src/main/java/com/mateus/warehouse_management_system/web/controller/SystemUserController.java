package com.mateus.warehouse_management_system.web.controller;

import com.mateus.warehouse_management_system.entity.SystemUser;
import com.mateus.warehouse_management_system.service.SystemUserService;
import com.mateus.warehouse_management_system.web.dto.SystemUserCreateDto;
import com.mateus.warehouse_management_system.web.dto.SystemUserResponseDto;
import com.mateus.warehouse_management_system.web.dto.mapper.SystemUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class SystemUserController {

    private final SystemUserService systemUserService;

    @PostMapping
    public ResponseEntity<SystemUserResponseDto> create(@RequestBody SystemUserCreateDto userCreateDto) {
        SystemUser user = systemUserService.save(SystemUserMapper.toSystemUser(userCreateDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(SystemUserMapper.toResponseDto(user));
    }
}
