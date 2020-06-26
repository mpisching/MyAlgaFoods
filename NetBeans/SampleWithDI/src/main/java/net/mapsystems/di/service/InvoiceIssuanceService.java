/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.di.service;

import net.mapsystems.di.model.Client;
import net.mapsystems.di.model.Product;
import net.mapsystems.di.notification.EmailNotification;
import net.mapsystems.di.notification.Notification;
import net.mapsystems.di.notification.SMSNotification;

/**
 * Serviço de Emissão de Nota Fiscal
 * @author mpisching
 */
public class InvoiceIssuanceService {
    
    //atributo que irá permitir a inversão de controle - injeção de dependência para a notificação, seja ela por SMS ou EMAIL (por meio do polimorfismo)
    private Notification notification;
    
    /*
    Agora esta classe para ser instanciada precisa desse construtor, justamente onde será injetado (injeção de dependência) da instância seja ela qual for (SMS ou EMAIL)
    */
    public InvoiceIssuanceService(Notification notification) {
        this.notification = notification;
    }    
    
    
    public void issue(Client client, Product product) {
        //TODO create a process to issue the invoice - for a while this is a fake method...
        //aqui também deverá ser mudado após a solicitação do clinte para enviar as mensagem por SMS
        //EmailNotification notification = new EmailNotification();
        //notification.notify(client, "Your invoice of product " + product.getName() + "was successful issued!");
        //SMSNotification notification = new SMSNotification();
        //notification.notify(client, "Your invoice of product " + product.getName() + "was successful issued!");
        
        this.notification.notify(client, "Your invoice of product " + product.getName() + "was successful issued!");
    }
}
