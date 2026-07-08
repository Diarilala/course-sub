package com.agito.choom.mapper;

import com.agito.choom.model.Course;
import com.agito.choom.repository.model.JCourse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseMapper {
    public Course toModel(JCourse entity) {
        return Course.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .build();
    }

    public List<Course> toModel(List<JCourse> entities) {
        return entities.stream().map(this::toModel).toList();
    }

    public JCourse toEntity(Course model) {
        return JCourse.builder()
                .id(model.getId())
                .title(model.getTitle())
                .startDate(model.getStartDate())
                .endDate(model.getEndDate())
                .build();
    }

    public List<JCourse> toEntity(List<Course> models) {
        return models.stream().map(this::toEntity).toList();
    }
}
