package com.agito.choom.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
  private UUID id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;
}
