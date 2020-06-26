/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.no_di;

import net.mapsystems.no_di.model.Client;
import net.mapsystems.no_di.service.ClientActivationService;

/**
 *
 * @author mpisching
 */
public class MainApp {
    public static void main(String[] args) {
        Client c1 = new Client("Adalberto", "adalberto@xyz.com", "48991911919");
        Client c2 = new Client("Julia", "julia@xyz.com", "48989897777");
        
        /*
        Depois de fazer isso, imagine que o cliente está pedindo que agora todas as notificações sejam feitas por SMS!!
        Uma classe de notificação SMS deve ser feita e todas as ocorrência de notificação por Email deverão ser modificadas para SMS. Isso
        caracteriza o acoplamento forte, exigindo muitas modificações no sistema....
        */
        ClientActivationService service = new ClientActivationService();
        service.activate(c1);
        service.activate(c2);
        
        
    }
}
