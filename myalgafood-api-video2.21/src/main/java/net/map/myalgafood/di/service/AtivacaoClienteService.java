package net.map.myalgafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.NivelUrgencia;
import net.map.myalgafood.di.notificacao.Notificador;
import net.map.myalgafood.di.notificacao.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {
	
	
	//@Qualifier("urgente")
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	//private List<Notificador> notificadores;
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT " + notificador + " (para mostrar que @PostConstruct é executado depois do construtor do BEAN...)");
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY - mostrando que o @PreDestroy está sendo executado antes de destruir o bean definitivamente.");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		//for (Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
		//}
		
	}
	
}
