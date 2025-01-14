package com.mateus.warehouse_manegement_system.service;

import com.mateus.warehouse_manegement_system.repository.ProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProviderService {

    private final ProviderRepository providerRepository;
}
