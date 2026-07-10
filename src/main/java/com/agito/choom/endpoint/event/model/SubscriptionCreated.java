package com.agito.choom.endpoint.event.model;

import com.agito.choom.model.Subscription;
import java.time.Duration;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class SubscriptionCreated extends PojaEvent {
  private Subscription subscription;

  @Override
  public Duration maxConsumerDuration() {
    return Duration.ofSeconds(45);
  }

  @Override
  public Duration maxConsumerBackoffBetweenRetries() {
    return Duration.ofSeconds(60);
  }
}
