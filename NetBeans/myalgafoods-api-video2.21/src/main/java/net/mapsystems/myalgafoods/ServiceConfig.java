/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods;

import net.mapsystems.myalgafoods.di.service.ClientActivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mpisching
 */
@Configuration
public class ServiceConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ClientActivationService clientActivationService() {
        return new ClientActivationService();

    }
}
