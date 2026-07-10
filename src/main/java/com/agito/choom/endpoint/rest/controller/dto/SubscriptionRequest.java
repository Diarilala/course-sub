package com.agito.choom.endpoint.rest.controller.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SubscriptionRequest {
  private UUID userId;
}
