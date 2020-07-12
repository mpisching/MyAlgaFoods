package net.map.myalgafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

//@Primary
//@Qualifier("urgente")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificacaoSMS implements Notificador {
	
	/*
	 * •	Neste exemplo é criado mais um notificador (NotificacaoSMS), logo, teremos dois beans no container. 
	 * Sendo assim, qual será o bean que o Spring irá escolher para injetar no notificador (Notificador) 
	 * do bean de ativação do cliente (AtivacaoClienteService).
	 * •	Na verdade o container irá identificar dois beans e não saberá qual utilizar, gerando um erro na inicialização
	 * Houve um problema de ambiguidade
	 */
    @Override
	public void notificar(Cliente cliente, String message) {
    	System.out.printf("Notificação %s pelo SMS %s: %s\n", 
                cliente.getNome(), cliente.getTelefone(), message);
    }
}
