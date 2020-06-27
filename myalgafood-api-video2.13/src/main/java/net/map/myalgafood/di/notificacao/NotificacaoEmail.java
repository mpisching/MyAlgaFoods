package net.map.myalgafood.di.notificacao;

import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

//@Component //para corrigir o construtor desta classe, que agora necessita de um parâmetro para inicializar o bean gerenciável,
			//é necessário tirar esta anotação. Outras classes serão criadas para configurar a inicialização do bean. Estas classes 
			// serão necessárias para dizer ao Spring como inicializar o bean NotificacaoEmail
public class NotificacaoEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSMTP;
	
	/*
	 * Caso venhamos executar este programa do jeito que está, teremos uma exceção de inicialização, pois o parâmetro do construtor 
	 * será desconhecido, logo, haverá a necessidade de configurar a inicialização do Bean. Por isso, outras classes serão necessárias.
	 */
	public NotificacaoEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
		System.out.println("construtor chamado.... NotificacaoEmail: ");
	}
		
    @Override
	public void notificar(Cliente cliente, String message) {
        if (this.caixaAlta) {
        	message = message.toUpperCase();
        }
    	System.out.printf("Notificação %s pelo email %s usando SMTP %s: %s\n", 
                cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, message);
    }

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
   
}
