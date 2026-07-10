package com.agito.choom.endpoint.rest.controller;

import com.agito.choom.endpoint.rest.controller.dto.SubscriptionRequest;
import com.agito.choom.model.Subscription;
import com.agito.choom.service.SubscriptionService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/courses")
public class CourseController {
  private SubscriptionService subscriptionService;

  @PostMapping("/{id}/subscribe")
  public Subscription subscribe(
      @PathVariable(name = "id", required = true) UUID id,
      @RequestBody SubscriptionRequest subscriptionRequest) {
    return subscriptionService.create(id, subscriptionRequest);
  }
}
