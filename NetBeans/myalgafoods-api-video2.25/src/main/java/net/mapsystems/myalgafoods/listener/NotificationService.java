/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.listener;

import net.mapsystems.myalgafoods.di.notification.Notification;
import net.mapsystems.myalgafoods.di.notification.NotificatorType;
import net.mapsystems.myalgafoods.di.notification.UrgencyLevel;
import net.mapsystems.myalgafoods.di.service.ActivatedClientEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author mpisching
 */
@Component
public class NotificationService {
	@NotificatorType(UrgencyLevel.URGENT)
	@Autowired
	private Notification notificator;
	
	@EventListener
	public void activatedClientListener(ActivatedClientEvent event) {
            notificator.notify(event.getClient(), "Your registration in the system is active.");
	}    
}
