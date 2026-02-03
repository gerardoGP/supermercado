package com.backend.academia.aggregates.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Long user_id;
    private String user_name;
    private String user_last_name;
    private String user_email;
}
