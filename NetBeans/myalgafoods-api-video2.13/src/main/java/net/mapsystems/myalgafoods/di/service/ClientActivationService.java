/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.service;

import net.mapsystems.myalgafoods.di.model.Client;
import net.mapsystems.myalgafoods.di.notification.EmailNotification;
import net.mapsystems.myalgafoods.di.notification.Notification;
import org.springframework.stereotype.Component;




/**
 * Esta é uma classe de negócio (serviço) cujo propósito é ativar um cliente
 * @author mpisching
 */
//@Component
public class ClientActivationService {
    
    //private EmailNotification notification; //desta forma ha um forte acoplamento
    private Notification notification; //desta forma temos um acoplamento fraco
    
    public ClientActivationService(Notification notification) {
        this.notification = notification;
        
        System.out.println("Using an EmailNotification instance injected by Spring: " + notification);
    }
    
    public void activate(Client client) {
        client.activate();
        this.notification.notify(client, "Your system registration is active.");
        
    }
}
