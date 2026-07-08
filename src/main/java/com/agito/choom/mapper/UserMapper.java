package com.agito.choom.mapper;

import com.agito.choom.model.User;
import com.agito.choom.repository.model.JUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {
    public User toModel(JUser entity) {
        return User.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .build();
    }

    public List<User> toModel(List<JUser> entities) {
        return entities.stream().map(this::toModel).toList();
    }

    public JUser toEntity(User model) {
        return JUser.builder()
                .id(model.getId())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .username(model.getUsername())
                .email(model.getEmail())
                .build();
    }
}
