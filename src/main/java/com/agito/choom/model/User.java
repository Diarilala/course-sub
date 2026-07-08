package com.agito.choom.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
}
