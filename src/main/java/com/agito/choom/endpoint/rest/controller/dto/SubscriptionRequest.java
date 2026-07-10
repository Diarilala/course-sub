package com.agito.choom.endpoint.rest.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class SubscriptionRequest {
    private UUID userId;
}
