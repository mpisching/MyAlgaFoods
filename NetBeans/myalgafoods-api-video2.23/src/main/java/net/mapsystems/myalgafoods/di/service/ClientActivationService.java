/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.service;

//import java.util.List;
import net.mapsystems.myalgafoods.di.model.Client;
import net.mapsystems.myalgafoods.di.notification.Notification;
import net.mapsystems.myalgafoods.di.notification.NotificatorType;
import net.mapsystems.myalgafoods.di.notification.UrgencyLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClientActivationService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;
    
    public void activate(Client client) {
        client.activate();

        eventPublisher.publishEvent(new ActivatedClientEvent(client));
    }

}
