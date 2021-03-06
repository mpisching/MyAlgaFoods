package net.map.myalgafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import net.map.myalgafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificacaoEmail implements Notificador {
	
//	@Value("${notificador.email.host-servidor}")
//	private String host;
//
//	@Value("${notificador.email.porta-servidor}")
//	private Integer porta;
	
	@Autowired
	private NotificadorProperties properties;
	
    @Override
	public void notificar(Cliente cliente, String message) {
    	
    	System.out.println("Host: " + properties.getHostServidor());
    	
    	System.out.println("Porta: " + properties.getPortaServidor());
    	
    	System.out.printf("Notificação %s pelo email %s: %s\n", 
                cliente.getNome(), cliente.getEmail(), message);
    }
   
}
