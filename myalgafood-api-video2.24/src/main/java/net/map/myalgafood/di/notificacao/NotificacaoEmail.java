package net.map.myalgafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificacaoEmail implements Notificador {
	
    @Override
	public void notificar(Cliente cliente, String message) {
    	System.out.printf("Notificação %s pelo email %s: %s\n", 
                cliente.getNome(), cliente.getEmail(), message);
    }
   
}
