/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.di.notification;

import net.mapsystems.di.model.Client;

/**
 *
 * @author mpisching
 */
public interface Notification {
    public void notify(Client client, String message);
}
