/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.di;

import net.mapsystems.di.model.Client;
import net.mapsystems.di.notification.EmailNotification;
import net.mapsystems.di.notification.Notification;
import net.mapsystems.di.notification.SMSNotification;
import net.mapsystems.di.service.ClientActivationService;

/**
 *
 * @author mpisching
 */
public class MainApp {
    public static void main(String[] args) {
        Client c1 = new Client("Adalberto", "adalberto@xyz.com", "48991911919");
        Client c2 = new Client("Julia", "julia@xyz.com", "48989897777");
        
        /*
        Neste exemplo está sendo demonstrado a injeção de dependência (usando o polimorfismo).
        Agora, ao invés de simplesmente instanciar o serviço pelo construtor padrão, será necessário construir o serviço 
        enviando uma instância do tipo de notificação desejada. Assim, fica evidenciada a injeção de DEPENDÊNCIA, pois essa
        poderá ser qualquer uma (SMS ou EMAIL), haja vista que o construtor aguarda um tipo único Notification (a interface Notification), e 
        a notificação será executada conforme o tipo da instância. Vale destacar que a única modificação a ser feita, caso deseja-se mudar o tipo de notificação,
        é na linha de instanciação do serviço.
        */
        Notification notification = new SMSNotification();
        
        ClientActivationService service = new ClientActivationService(notification);//nesta linha está sendo injetado um tipo de notificador na instanciação do tipo de Serviço
        service.activate(c1);
        service.activate(c2);
        
        
    }  
}
