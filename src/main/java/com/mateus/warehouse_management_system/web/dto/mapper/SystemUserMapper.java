package com.mateus.warehouse_management_system.web.dto.mapper;

import com.mateus.warehouse_management_system.entity.SystemUser;
import com.mateus.warehouse_management_system.web.dto.SystemUserCreateDto;
import com.mateus.warehouse_management_system.web.dto.SystemUserResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class SystemUserMapper {

    public static SystemUser toSystemUser(SystemUserCreateDto createDto) {
        return new ModelMapper().map(createDto, SystemUser.class);
    }

    public static SystemUserResponseDto toResponseDto(SystemUser systemUser) {
        String role = systemUser.getRole().name().substring("ROLE_".length());
        PropertyMap<SystemUser, SystemUserResponseDto> props = new PropertyMap<SystemUser, SystemUserResponseDto>() {
            @Override
            protected void configure() {
                map().setRole(role);
            }
        };
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(props);
        return mapper.map(systemUser, SystemUserResponseDto.class);
    }
}
