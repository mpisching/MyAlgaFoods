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
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClientActivationService {
    
    //@Qualifier("urgent")
    @NotificatorType(UrgencyLevel.URGENT)
    @Autowired
    //private List<Notification> notifications; 
    private Notification notificator; 
    

    public void activate(Client client) {
        client.activate();
        
        //for (Notification notificator : notifications) {
            notificator.notify(client, "Your system registration is active.");
        //} 
    }
    
   
}
