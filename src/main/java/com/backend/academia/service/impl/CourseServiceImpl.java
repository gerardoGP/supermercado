package com.backend.academia.service.impl;

import com.backend.academia.aggregates.exceptions.ResourceNotFoundException;
import com.backend.academia.aggregates.mappers.CourseMapper;
import com.backend.academia.aggregates.request.CourseRequest;
import com.backend.academia.aggregates.response.CourseResponse;
import com.backend.academia.entity.CourseEntity;
import com.backend.academia.repository.CourseRepository;
import com.backend.academia.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Log4j2
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    @Transactional(readOnly = true)
    public List<CourseResponse> all() {
        return courseMapper.toResponseList(courseRepository.findAll());
    }

    @Override
    public CourseResponse store(CourseRequest courseRequest) {
        /*String url_seo_course = StringUtils.convertirTextoAUrlSeo(courseRequest.getTitulo());

        courseRepository.findByUrlSeo(url_seo_course).ifPresent(u -> {
            
        });*/
        /*return courseReposity.save(CourseEntity.builder()
                .title(courseRequest.getTitulo())
                .build()
        );*/
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public CourseResponse findById(Long courseId) {

        CourseEntity findCourse = courseRepository.findById(courseId).orElseThrow(()-> new ResourceNotFoundException("El curso no existe en la BD"));
        return courseMapper.toResponse(findCourse);
    }

}
