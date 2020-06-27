/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.service;

import net.mapsystems.myalgafoods.di.model.Client;
import net.mapsystems.myalgafoods.di.notification.EmailNotification;
import net.mapsystems.myalgafoods.di.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientActivationService {
    
    @Autowired(required = false) //it turn the DI optional
    private Notification notification; 
    

    public void activate(Client client) {
        client.activate();
        
        if (this.notification != null) {
            this.notification.notify(client, "Your system registration is active.");
        } else {
            System.out.println("There's no notification, but the client was activated.");
        }
    }
   
}
