/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.no_di.service;

import net.mapsystems.no_di.model.Client;
import net.mapsystems.no_di.model.Product;
import net.mapsystems.no_di.notification.EmailNotification;
import net.mapsystems.no_di.notification.SMSNotification;

/**
 * Serviço de Emissão de Nota Fiscal
 * @author mpisching
 */
public class InvoiceIssuanceService {
    public void issue(Client client, Product product) {
        //TODO create a process to issue the invoice
        //aqui também deverá ser mudado após a solicitação do clinte para enviar as mensagem por SMS
        //EmailNotification notification = new EmailNotification();
        //notification.notify(client, "Your invoice of product " + product.getName() + "was successful issued!");
        SMSNotification notification = new SMSNotification();
        notification.notify(client, "Your invoice of product " + product.getName() + "was successful issued!");
    }
}
