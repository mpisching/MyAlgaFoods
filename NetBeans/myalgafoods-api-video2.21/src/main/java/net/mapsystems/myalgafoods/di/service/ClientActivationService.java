/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.service;

//import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import net.mapsystems.myalgafoods.di.model.Client;
import net.mapsystems.myalgafoods.di.notification.Notification;
import net.mapsystems.myalgafoods.di.notification.NotificatorType;
import net.mapsystems.myalgafoods.di.notification.UrgencyLevel;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class ClientActivationService {

    //@Qualifier("urgent")
    @NotificatorType(UrgencyLevel.URGENT)
    @Autowired
    //private List<Notification> notifications; 
    private Notification notificator;

    //mostrando a implementação de métodos para cuidar do ciclo de vida de beans gerenciáveis
    //@PostConstruct
    public void init() {
        System.out.println("INIT " + notificator + " (para mostrar que @PostConstruct é executado depois do construtor do BEAN...)");
    }

    //@PreDestroy
    public void destroy() {
        System.out.println("DESTROY - mostrando que o @PreDestroy está sendo executado antes de destruir o bean definitivamente.");
    }

    public void activate(Client client) {
        client.activate();

        //for (Notification notificator : notifications) {
        notificator.notify(client, "Your system registration is active.");
        //} 
    }

}
