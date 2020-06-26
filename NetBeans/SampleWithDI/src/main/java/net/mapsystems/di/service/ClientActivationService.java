/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.di.service;

import net.mapsystems.di.model.Client;
import net.mapsystems.di.notification.Notification;


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
    
    //atributo que irá permitir a inversão de controle - injeção de dependência para a notificação, seja ela por SMS ou EMAIL (por meio do polimorfismo)
    private Notification notification;
    
    /*
    Agora esta classe para ser instanciada precisa desse construtor, justamente onde será injetado (injeção de dependência) da instância seja ela qual for (SMS ou EMAIL)
    */
    public ClientActivationService(Notification notification) {
        this.notification = notification;
    }
    
    public void activate(Client client) {
        client.activate();
        //Note nas linhas comentadas abaixo que havia dependência explicita com as classes de notificação. A partir da linha 31 estaremos fazendo a injeção de dependência por meio do polimorfismo e IoC.
        //EmailNotification notification = new EmailNotification();
        //notification.notify(client, "Your system registration is active.");
        //SMSNotification notification = new SMSNotification();
        //notification.notify(client, "Your system registration is active.");
        
        //IoC – inversão de controle – ao retirar a instanciação do tipo de mensagem na classe de serviço, 
        //elas se tornam menos independente (acoplamento fraco), fazendo com que o método de notificação fique mais dinâmico, 
        //exigindo menor grau de atualização de código em eventuais manutenções.
        //Observação final: Considerar que poderão existir outras classes de Serviço que precisam notificar os usuários (por exemplo,
        //a classe InvoiceIssuanceService
        this.notification.notify(client, "Your system registration is active.");
        
    }
}
