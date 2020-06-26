/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.no_di.service;

import net.mapsystems.no_di.model.Client;
import net.mapsystems.no_di.notification.EmailNotification;
import net.mapsystems.no_di.notification.SMSNotification;

/**
 * Esta é uma classe de negócio (serviço) cujo propósito é ativar um cliente
 * @author mpisching
 */
public class ClientActivationService {
    
    /**
     * Quanto este método é chamado, ele deve ativar o cliente e também notifica-lo de que foi ativado (por email ou SMS por exemplo)
     * Para isso será implementado um fake, para demonstrar como isso é feito.
     * Para isso é importante delegar as responsabilidades e criar classes própria para cada tipo de envio
     * @param client 
     */
    public void activate(Client client) {
        client.activate();
        //após a solicitação de mudança do envio de notificação por SMS todas as ocrrências deverão serem alteradas (acoplamento forte)
        //NOTE AINDA QUE AO INSTANCIAR UMA CLASSE DIRETAMENTE, ESTAMOS DEFININDO UMA DEPENDÊNCIA DIRETA (EXPLICITA E AMARRADA) DE UMA CLASSE COM OUTRA. NESTE CASO NÃO HÁ INJEÇÃO DE DEPENDÊNCIA
        //EmailNotification notification = new EmailNotification();
        //notification.notify(client, "Your system registration is active.");
        SMSNotification notification = new SMSNotification();
        notification.notify(client, "Your system registration is active.");
    }
}
