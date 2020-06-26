package net.map.myalgafood.di.service;

import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.NotificacaoEmail;

@Component
public class AtivacaoClienteService {
	
	//até esse momento o notificador é null, não houve injeção de dependência ainda, embora a classe NotificacaoEmail já tenha sido anotada como @Component gerenciável do Spring
	//nó próximo exemplo (video 2.12 isso será mostrado)
	/*
	 * •	Toda classe anotada como @Component é um bean gerenciável pelo Spring, logo, eles podem ser injetados uma nas outras.
	 */
	private NotificacaoEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}
}
