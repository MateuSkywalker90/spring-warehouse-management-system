package com.mateus.warehouse_management_system.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimezoneConfig {

    @PostConstruct
    public void timeZoneConfig() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+04:00"));
    }
}
