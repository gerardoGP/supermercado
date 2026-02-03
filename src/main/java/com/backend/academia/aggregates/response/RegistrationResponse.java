package com.backend.academia.aggregates.response;

import com.backend.academia.aggregates.enums.RegistrationRolEnum;
import com.backend.academia.aggregates.enums.Rol;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationResponse {
    private Long user_id;
    private String user_name;
    private String user_last_name;
    private String user_email;
    private RegistrationRolEnum rol;
}
