/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.notification;

import net.mapsystems.myalgafoods.di.model.Client;
import org.springframework.stereotype.Component;

/**
 *
 * @author mpisching
 */
@Component
public class EmailNotification implements Notification {
    
    public EmailNotification() {
        System.out.println("EmailNotification...");
    }
    
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notifying %s by email %s: %s\n", 
                client.getName(), client.getEmail(), message);
    }
}
