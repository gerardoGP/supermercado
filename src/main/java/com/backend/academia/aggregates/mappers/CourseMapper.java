package com.backend.academia.aggregates.mappers;

import com.backend.academia.aggregates.response.CourseResponse;
import com.backend.academia.entity.CourseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;

@Mapper(
        componentModel = "spring",
        uses = RegistrationMapper.class
)
public interface CourseMapper {
    // source = Entidad, target = Response
    @Mapping(source = "id", target = "course_id")
    @Mapping(source = "title", target = "course_title")
    @Mapping(source = "urlSeo", target = "course_url_seo")
    @Mapping(source = "statusCourse", target = "course_status")
    @Mapping(source = "registrations", target = "registrations")
    CourseResponse toResponse(CourseEntity courseEntity);

    List<CourseResponse> toResponseList(List<CourseEntity> courseEntity);

}