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
    
    @Autowired //third way to declare a injection point
    private Notification notification; 
    
//    @Autowired //the first way to declare a injection point
//    public ClientActivationService(Notification notification) {
//        this.notification = notification;
//    }
//    
//    public ClientActivationService(String someArgs) {
//        //TODO something here...
//    }
    
    public void activate(Client client) {
        client.activate();
        this.notification.notify(client, "Your system registration is active.");
    }
    
    //@Autowired //second way to define an injection point
                    //for example, try to remove @Autowired ... you see that there is no Notification injection, so an error will performed during the execution.
//    public void setNotification(Notification notification) {
//        this.notification = notification;
//    }
}
