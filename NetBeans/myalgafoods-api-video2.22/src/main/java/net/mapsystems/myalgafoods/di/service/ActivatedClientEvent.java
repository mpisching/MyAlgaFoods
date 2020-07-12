/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods.di.service;

import net.mapsystems.myalgafoods.di.model.Client;

/**
 *
 * @author mpisching
 */
public class ActivatedClientEvent {
    private Client client;

    public ActivatedClientEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
    
    
}
