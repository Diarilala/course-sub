package com.agito.choom.repository;

import com.agito.choom.repository.model.JUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<JUser, UUID> {
}
