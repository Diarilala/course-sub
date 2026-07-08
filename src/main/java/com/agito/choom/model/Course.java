package com.agito.choom.model;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Builder
@Getter
public class Course {
    private UUID courseId;
    private String title;
    private Instant startDate;
    private Instant endDate;
}
