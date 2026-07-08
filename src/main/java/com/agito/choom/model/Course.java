package com.agito.choom.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Course {
  private UUID id;
  private String title;
  private Instant startDate;
  private Instant endDate;

  @Builder.Default private List<Subscription> subscriptions = new ArrayList<>();
}
