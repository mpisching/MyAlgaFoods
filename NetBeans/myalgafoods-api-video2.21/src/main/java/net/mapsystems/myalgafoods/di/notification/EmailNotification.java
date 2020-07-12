package net.mapsystems.myalgafoods.di.notification;

import net.mapsystems.myalgafoods.di.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Qualifier("urgent")
@Profile("prod")
@NotificatorType(UrgencyLevel.URGENT)
@Component
public class EmailNotification implements Notification {

    public EmailNotification() {
        System.out.println("EmailNotification REAL");
    }
  
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notifying %s by email %s: %s\n", 
                client.getName(), client.getEmail(),message);
    }

}
