package com.mateus.warehouse_management_system.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SystemUserCreateDto {

    @NotBlank
    private String username;
    @NotBlank
    @Size(min = 8, max = 8)
    private String password;
}
