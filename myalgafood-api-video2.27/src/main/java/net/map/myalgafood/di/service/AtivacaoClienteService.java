package net.map.myalgafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.NivelUrgencia;
import net.map.myalgafood.di.notificacao.Notificador;
import net.map.myalgafood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		//uso de padrão de projeto Observer
		//tornar o acoplamento mais baixo entre a classe AtivacaoClienteService e o Notificador
//			notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
		//dizendo para o cliente que ele está ativo neste momento
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
	}
	
}
