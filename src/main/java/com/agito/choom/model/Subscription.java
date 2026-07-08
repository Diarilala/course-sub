package com.agito.choom.model;

import java.time.Instant;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Subscription {
  private UUID id;
  private Instant createdAt;
  private UUID courseId;
  private UUID userId;
}
