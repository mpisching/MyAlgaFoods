package net.map.myalgafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	//@Autowired //esta declaração torna a dependência obrigatório, ou seja, é necessária uma instância (injetada) de notificador
	@Autowired(required = false) //esta declaração torna a dependência não obrigatório. Se existir ela será utilizada, caso contrário o programa ira executar de outro modo sem ela.
									//Para fazer o teste, é necessário tirar a @Component da classe NotificacaoEmail (de modo que ela deixa de ser um componente - bean gerencíavel - do Spring
	private Notificador notificador; 

	public void ativar(Cliente cliente) {
		cliente.ativar();
		if (notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo.");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado!!!");
		}
		
		
	}
	
}
