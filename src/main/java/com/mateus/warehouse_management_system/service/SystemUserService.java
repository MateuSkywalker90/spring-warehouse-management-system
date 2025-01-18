package com.mateus.warehouse_management_system.service;

import com.mateus.warehouse_management_system.entity.SystemUser;
import com.mateus.warehouse_management_system.repository.SystemUserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SystemUserService {

    private final SystemUserRepository systemUserRepository;

    @Transactional
    public SystemUser save(SystemUser systemUser) {
        if (systemUser.getRole() == null) {
            systemUser.setRole(SystemUser.Role.ROLE_WORKER);
        }
        return systemUserRepository.save(systemUser);
    }

    @Transactional(readOnly = true)
    public SystemUser searchById(Long id) {
        return systemUserRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("User id=%s not found.", id))
        );
    }
}
