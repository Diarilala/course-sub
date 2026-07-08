package com.agito.choom.repository.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "\"user\"")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class JUser {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 200)
    private String firstName;

    @Column(length = 200, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

}
