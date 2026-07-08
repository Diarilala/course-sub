package com.agito.choom.mapper;

import com.agito.choom.model.Subscription;
import com.agito.choom.repository.model.JSubscription;
import com.agito.choom.service.CourseService;
import com.agito.choom.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class SubscriptionMapper {
    private UserMapper userMapper;
    private CourseMapper courseMapper;
    private CourseService courseService;
    private UserService userService;

    public Subscription toModel(JSubscription entity) {
        return Subscription.builder()
                .id(entity.getId())
                .createdAt(entity.getCreatedAt())
                .courseId(entity.getCourse().getId())
                .userId(entity.getUser().getId())
                .build();
    }

    public List<Subscription> toModel(List<JSubscription> entities) {
        return entities.stream().map(this::toModel).toList();
    }

    public JSubscription toEntity(Subscription model) {
        var user = userService.getById(model.getUserId());
        var course = courseService.getById(model.getCourseId());
        return JSubscription.builder()
                .id(model.getId())
                .createdAt(model.getCreatedAt())
                .course(courseMapper.toEntity(course))
                .user(userMapper.toEntity(user))
                .build();
    }

    public List<JSubscription> toEntity(List<Subscription> models) {
        return models.stream().map(this::toEntity).toList();
    }
}
