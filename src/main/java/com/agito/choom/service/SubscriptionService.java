package com.agito.choom.service;

import com.agito.choom.endpoint.event.EventProducer;
import com.agito.choom.endpoint.event.model.SubscriptionCreated;
import com.agito.choom.endpoint.rest.controller.dto.SubscriptionRequest;
import com.agito.choom.mapper.SubscriptionMapper;
import com.agito.choom.model.Subscription;
import com.agito.choom.repository.SubscriptionRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubscriptionService {
  private final UserService userService;
  private final EventProducer<SubscriptionCreated> eventProducer;
  private final SubscriptionMapper mapper;
  private final SubscriptionRepository repository;

  public Subscription create(UUID courseId, SubscriptionRequest subscriptionRequest) {
    var asEntity = mapper.toEntity(courseId, subscriptionRequest);
    var saved = mapper.toModel(repository.save(asEntity));
    var event = SubscriptionCreated.builder().subscription(saved).build();
    eventProducer.accept(List.of(event));
    return saved;
  }
}
