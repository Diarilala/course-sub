package com.agito.choom.service;

import com.agito.choom.mapper.UserMapper;
import com.agito.choom.model.User;
import com.agito.choom.repository.UserRepository;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
  private UserRepository repository;
  private UserMapper mapper;

  public User getById(UUID id) {
    return mapper.toModel(
        repository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("User with id " + id + " not found!")));
  }
}
