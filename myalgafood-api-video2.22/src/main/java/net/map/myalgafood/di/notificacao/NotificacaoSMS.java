package net.map.myalgafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificacaoSMS implements Notificador {
	
    @Override
	public void notificar(Cliente cliente, String message) {
    	System.out.printf("Notificação %s pelo SMS %s: %s\n", 
                cliente.getNome(), cliente.getTelefone(), message);
    }
}
