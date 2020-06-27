package net.map.myalgafood.di.service;

import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.Notificador;

//@Component //retirando esta anotação a classe deixa de ser um bean gerenciável pelo Spring. Para resovler isso é necessário criar uma classe 
			// de configuração e inicialização do bean
public class AtivacaoClienteService {
	
	/*
	 * •	Neste exemplo, é utilizado um acoplamento forte AtivacaoClienteService e NotificadorEmail, 
	 * pois o tipo é específico. Logo, é necessário definir uma estratégia para tornar num acoplamento fraco, 
	 * para isso, se faz uma Interface (no Eclipse IDE é possível extrair uma interface a partir de uma classe concreta).
	 */
	//private NotificadorEmail notificador //esta declaração será substituída pela linha a seguir
	private Notificador notificador; //nesta declaração temos um acoplamento mais fraco
	
	/*
	 * Note que, criando o construtor a seguir, já temos uma forma de injeção de dependência gerenciada pelo Spring
	 * Isto é, uma instancia de notificador existirá automaticamente sem que precisamos instancia-lo explicitamente.
	 */
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
	}
}
