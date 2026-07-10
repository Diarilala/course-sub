package com.agito.choom.endpoint.rest.controller.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public class SubscriptionRequest {
    private UUID userId;
}
