package net.map.myalgafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.NivelUrgencia;
import net.map.myalgafood.di.notificacao.Notificador;
import net.map.myalgafood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	
	//@Qualifier("urgente")
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	//private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		//for (Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
		//}
		
	}
	
}
