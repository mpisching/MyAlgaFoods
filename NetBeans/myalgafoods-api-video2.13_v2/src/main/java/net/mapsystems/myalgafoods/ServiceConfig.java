/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods;

import net.mapsystems.myalgafoods.di.notification.Notification;
import net.mapsystems.myalgafoods.di.service.ClientActivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mpisching
 */
@Configuration
public class ServiceConfig {
    @Bean
    public ClientActivationService clientActivationService(Notification notification) {
        ClientActivationService clientActivationService = new ClientActivationService(notification);
        return clientActivationService;
    }
}
