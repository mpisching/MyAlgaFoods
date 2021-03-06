package net.map.myalgafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.map.myalgafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
}
