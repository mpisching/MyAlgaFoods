/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author mpisching
 */
@Component
@ConfigurationProperties("notificador.email")
public class NotificatorProperties {
    /**
     * Server host name
     */
    private String serverHost;
    
    /**
     * Server port number
     * default value = 25
     */
    private Integer serverPort = 25;

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }
    
    
}
