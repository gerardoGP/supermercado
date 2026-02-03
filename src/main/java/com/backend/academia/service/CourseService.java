package com.backend.academia.service;

import com.backend.academia.aggregates.request.CourseRequest;
import com.backend.academia.aggregates.response.CourseResponse;
import com.backend.academia.entity.CourseEntity;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<CourseResponse> all();
    CourseResponse store(CourseRequest courseRequest);
    CourseResponse findById(Long courseId);
}