package com.mateus.warehouse_management_system.service;

import com.mateus.warehouse_management_system.entity.Provider;
import com.mateus.warehouse_management_system.repository.ProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    @Transactional
    public Provider save(Provider provider) {
        return providerRepository.save(provider);
    }
}
