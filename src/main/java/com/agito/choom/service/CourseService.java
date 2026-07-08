package com.agito.choom.service;

import com.agito.choom.mapper.CourseMapper;
import com.agito.choom.model.Course;
import com.agito.choom.repository.CourceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CourseService {
    private CourceRepository repository;
    private CourseMapper mapper;

    public Course findById(UUID id) {
        return mapper.toModel(
                repository.findById(id).orElseThrow(() -> new RuntimeException("Course with id " + id + " not found!"))
        );
    }
}
