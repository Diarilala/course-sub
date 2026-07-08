package com.agito.choom.model;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
public class Course {
    private UUID id;
    private String title;
    private Instant startDate;
    private Instant endDate;

    @Builder.Default
    private List<Subscription>  subscriptions = new ArrayList<>();
}
