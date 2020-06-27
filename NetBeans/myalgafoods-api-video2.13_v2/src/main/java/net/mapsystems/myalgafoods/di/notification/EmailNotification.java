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
//@Component
public class EmailNotification implements Notification {
  
    private boolean upperCase;
    
    private String smtpServerHost;
    
    public EmailNotification(String smtpServerHost) {
        this.smtpServerHost = smtpServerHost;
        System.out.println("EmailNotification...");
    }
    
    @Override
    public void notify(Client client, String message) {
        
        if (upperCase) {
            message = message.toUpperCase();
        }
        
        System.out.printf("Notifying %s by email %s on SMTP server %s: %s\n", 
                client.getName(), client.getEmail(), this.smtpServerHost, message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
    
    
}
