package net.map.myalgafood.di.notificacao;

import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

@Component //informando que este é um bean (classe) gerenciável pelo Spring, ou seja, a classe NotificacaoEmail passa a ser um componente Spring
 			//Esta anotação faz com que o Spring instancie o objeto na aplicação e passe a gerenciá-lo sem precisar chamar o construtor...
public class NotificacaoEmail {
	
	/* um construtor padrão para ver que uma instancia será criada sem chama-la explicitamente */
	public NotificacaoEmail() {
		System.out.println("construtor chamado....");
	}
	
	
    public void notificar(Cliente cliente, String message) {
        System.out.printf("Notifying %s by email %s: %s\n", 
                cliente.getNome(), cliente.getEmail(), message);
    }
}
