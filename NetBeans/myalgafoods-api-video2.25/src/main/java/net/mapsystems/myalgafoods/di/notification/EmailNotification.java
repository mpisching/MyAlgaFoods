package net.mapsystems.myalgafoods.di.notification;

import net.mapsystems.myalgafoods.di.model.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Qualifier("urgent")
@NotificatorType(UrgencyLevel.URGENT)
@Component
public class EmailNotification implements Notification {
  
    @Value("${notificador.email.host-servidor}")
    private String host;
    
    @Value("${notificador.email.porta-servidor}")
    private Integer port;
    
    @Override
    public void notify(Client client, String message) {
        System.out.println("Host: " + host);
        System.out.println("Port: " + port) ;
        System.out.printf("Notifying %s by email %s: %s\n", 
                client.getName(), client.getEmail(),message);
    }

}
