package net.map.myalgafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.map.myalgafood.di.notificacao.NotificacaoEmail;

@Configuration
public class NotificacaoConfig {
	@Bean //com esta anotação estamos definindo que este método é responsável por inicializar e configurar um novo bean gerenciavel pelo Spring
	public NotificacaoEmail notificacaoEmail() {
		NotificacaoEmail notificacaoEmail = new NotificacaoEmail("smtp.mapalgafood.com.br");
		notificacaoEmail.setCaixaAlta(true);
		return notificacaoEmail;
	}
}
