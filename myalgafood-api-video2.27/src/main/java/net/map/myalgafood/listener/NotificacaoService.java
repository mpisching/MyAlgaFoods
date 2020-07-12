package net.map.myalgafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.notificacao.NivelUrgencia;
import net.map.myalgafood.di.notificacao.Notificador;
import net.map.myalgafood.di.notificacao.TipoDoNotificador;
import net.map.myalgafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		//System.out.println("Cliente " + event.getCliente().getNome() + " agora está ativo.");
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo.");
		
	}
}
