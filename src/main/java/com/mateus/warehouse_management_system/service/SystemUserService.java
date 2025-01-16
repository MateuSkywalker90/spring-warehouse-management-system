package com.mateus.warehouse_management_system.service;

import com.mateus.warehouse_management_system.entity.SystemUser;
import com.mateus.warehouse_management_system.repository.SystemUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SystemUserService {

    private final SystemUserRepository systemUserRepository;

    @Transactional
    public SystemUser save(SystemUser systemUser) {
        return systemUserRepository.save(systemUser);
    }
}
