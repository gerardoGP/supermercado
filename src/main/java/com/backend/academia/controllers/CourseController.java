package com.backend.academia.controllers;

import com.backend.academia.aggregates.request.CourseRequest;
import com.backend.academia.aggregates.response.CourseResponse;
import com.backend.academia.entity.CourseEntity;
import com.backend.academia.service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/course/")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/all-registrations")
    public ResponseEntity<List<CourseResponse>> all() {
        return ResponseEntity.ok(courseService.all());
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<CourseResponse> findById(@PathVariable Long courseId){
        return ResponseEntity.ok(courseService.findById(courseId));
    }


    /*@PostMapping("/")
    public ResponseEntity<CourseEntity> store(@Valid @RequestBody CourseRequest courseRequest){
        return ResponseEntity.created(courseService.store(courseRequest));
    }*/
}
