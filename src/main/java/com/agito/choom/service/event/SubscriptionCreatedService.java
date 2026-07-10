package com.agito.choom.service.event;

import com.agito.choom.endpoint.event.model.SubscriptionCreated;
import com.agito.choom.mail.Email;
import com.agito.choom.mail.Mailer;
import com.agito.choom.service.CourseService;
import com.agito.choom.service.UserService;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubscriptionCreatedService implements Consumer<SubscriptionCreated> {
  private final Mailer mailer;
  private final CourseService courseService;
  private final UserService userService;

  private void sendEmail(UUID userId, UUID courseId) throws AddressException {
    var user = userService.getById(userId);
    var course = courseService.getById(courseId);
    var to = user.getEmail();
    var subject = "Subscription confirmation: %s".formatted(course.getTitle());
    var htmlBody =
        """
<html>
    <body>
        <p>Dear %s,</p>
        <p>Your subscription has been confirmed. You have now full access to your course</p>
        <p>Thank you for joining us!</p>
        <p>Best regards,</p>
        <p>The Team</p>
    </body>
</html>
"""
            .formatted(user.getUsername());
    InternetAddress recipientAddress = new InternetAddress(to);
    var email = new Email(recipientAddress, List.of(), List.of(), subject, htmlBody, List.of());
    mailer.accept(email);
  }

  @SneakyThrows
  @Override
  public void accept(SubscriptionCreated subscriptionCreated) {
    sendEmail(
        subscriptionCreated.getSubscription().getUserId(),
        subscriptionCreated.getSubscription().getCourseId());
  }
}
