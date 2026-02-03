package com.backend.academia.aggregates.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherResponse {
    private Long teacher_id;
    private String teacher_name;
    private String teacher_last_name;
    private String teacher_email;
}
