package com.mateus.warehouse_management_system.web.dto;

import com.mateus.warehouse_management_system.entity.SystemUser;
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
    @Size(min = 5, max = 5)
    private String employeeRegistration;
    @NotBlank
    private String username;
    @NotBlank
    @Size(min = 8, max = 8)
    private String password;
    private SystemUser.Role role;
}
