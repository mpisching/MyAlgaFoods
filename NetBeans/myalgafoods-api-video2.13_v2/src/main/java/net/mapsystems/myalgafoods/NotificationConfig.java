/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods;

import net.mapsystems.myalgafoods.di.notification.EmailNotification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mpisching
 */
@Configuration
public class NotificationConfig {
    
    @Bean
    public EmailNotification emailNotification() {
        EmailNotification emailNotification = new EmailNotification("smtp.mapsystems.com.br");
        emailNotification.setUpperCase(true);
        
        return emailNotification;
    }
}
