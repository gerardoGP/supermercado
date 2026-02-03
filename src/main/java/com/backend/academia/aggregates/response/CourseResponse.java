package com.backend.academia.aggregates.response;
import com.backend.academia.aggregates.enums.CourseState;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;
@Getter
@Setter
public class  CourseResponse {
    private Long course_id;
    private String course_title;
    private String course_url_seo;
    private String course_status;
    private List<RegistrationResponse> registrations;
}