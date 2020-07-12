package net.map.myalgafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

//@Primary
//@Qualifier("normal")
@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificacaoEmailMock implements Notificador {
	
	public NotificacaoEmailMock() {
		System.out.println("NotificacaoEmail MOCK");
	}
	
    @Override
	public void notificar(Cliente cliente, String message) {
    	System.out.printf("MOCK: Notificação seria enviada para %s pelo email %s: %s\n", 
                cliente.getNome(), cliente.getEmail(), message);
    }
   
}
