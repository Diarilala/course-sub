package com.agito.choom.endpoint.rest.controller.dto;

import java.util.UUID;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubscriptionRequest {
  private UUID userId;
}
