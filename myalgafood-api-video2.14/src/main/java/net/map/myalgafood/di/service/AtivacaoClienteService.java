package net.map.myalgafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	//Pontos de injeção - são os locais onde se pode injetar objetos dentro dos nossos beans
	//Nesta classe por exemplo, onde estamos injetando um Notificador?
	//R.: Estamos injetando no construtor de classe, logo, o construtor é um ponto de injeção. Mas podem existir outros locais também.
	
	@Autowired //terceira forma de ponto de injeção
	private Notificador notificador; 

//	@Autowired //está é uma forma de injeção pelo método construtor
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	/*
	 * Por exemplo, imagine que tenhamos um outro construtor com um parâmetro (diferente) qualquer.
	 * Então, qual construtor o Spring vai usar para instanciar?
	 * Ele vai procurar pelo padrão, mas não vai encontrar e entre as duas opções qual ele vai chamar? 
	 * R. Deve ser anotado com @Autowired para que o Spring saiba qual construtor usar
	 */
//	public AtivacaoClienteService(String argQualquer) {
//		//TODO something
//	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}

//	@Autowired //segunda forma de ponto de injeção - por método setter
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	
}
