package net.mapsystems.myalgafoods.di.notification;

import net.mapsystems.myalgafoods.di.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Qualifier("urgent")
@Profile("dev")
@NotificatorType(UrgencyLevel.URGENT)
@Component
public class EmailNotificationMock implements Notification {

    public EmailNotificationMock() {
        System.out.println("EmailNotification MOCK");
    }
  
    @Override
    public void notify(Client client, String message) {
        System.out.printf("MOCK: Notification must be send to %s by email %s: %s\n", 
                client.getName(), client.getEmail(),message);
    }

}
