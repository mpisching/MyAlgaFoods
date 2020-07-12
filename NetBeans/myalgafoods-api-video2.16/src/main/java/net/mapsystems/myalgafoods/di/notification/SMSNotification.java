package net.mapsystems.myalgafoods.di.notification;

import net.mapsystems.myalgafoods.di.model.Client;
import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements Notification {
  
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notifying %s by SMS %s: %s\n", 
                client.getName(), client.getPhone(),message);
    }

}
