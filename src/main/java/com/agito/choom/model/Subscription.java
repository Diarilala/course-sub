package com.agito.choom.model;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Builder
@Getter
public class Subscription {
    private UUID id;
    private Instant createdAt;
    private UUID courseId;
    private UUID userId;
}
