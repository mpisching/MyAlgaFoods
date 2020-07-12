package net.map.myalgafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	
	@Qualifier("urgente")
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
