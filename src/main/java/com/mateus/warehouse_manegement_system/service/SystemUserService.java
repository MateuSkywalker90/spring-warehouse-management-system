package com.mateus.warehouse_manegement_system.service;

import com.mateus.warehouse_manegement_system.repository.SystemUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SystemUserService {

    private final SystemUserRepository systemUserRepository;
}
