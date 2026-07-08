package com.agito.choom.repository;

import com.agito.choom.repository.model.JSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubscriptionRepository extends JpaRepository<JSubscription, UUID> {
}
