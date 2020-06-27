package net.map.myalgafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.map.myalgafood.di.notificacao.Notificador;
import net.map.myalgafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		//return new AtivacaoClienteService(notificador); //note que agora será necessário passar como parâmetro um notificador. E agora?
		//return new AtivacaoClienteService(new NotificacaoEmail(hostServicoSmtp); //se fizer dessa forma, até funciona, mas isso não é um bean gerenciado pelo Spring, e só serve para notificacao por email, caso seja necessário outro tipo de notificação, essa instanciação está muito amarrada (forte acoplamento)
		return new AtivacaoClienteService(notificador);
	}
}
