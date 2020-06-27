package net.map.myalgafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.map.myalgafood.di.notificacao.NotificacaoEmail;
import net.map.myalgafood.di.service.AtivacaoClienteService;

//@Configuration //é um @Component Spring com objetivo de servir como definição de beans
			//esta anotação depois foi comentada para fazer um segundo teste, a criação de outras classes de configuração NotificacaoConfig e ServiceConfig, 
			// para demonstrar a injeção de bean em um outro (por meio do construtor) utilizando a interface Notificador.
//Esta classe no final das contas apresentou a configuração e inicialização de dois beans, por que não separa-los em classes de configuração distintas? Isso é possível e o exemplo está nas classes NotificacaoConfig e ServiceConfig 
public class MyAlgaConfig {

	@Bean //com esta anotação estamos definindo que este método é responsável por inicializar e configurar um novo bean gerenciavel pelo Spring
	public NotificacaoEmail notificacaoEmail() {
		NotificacaoEmail notificacaoEmail = new NotificacaoEmail("smtp.mapalgafood.com.br");
		notificacaoEmail.setCaixaAlta(true);
		return notificacaoEmail;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		//return new AtivacaoClienteService(notificador); //note que agora será necessário passar como parâmetro um notificador. E agora?
		//return new AtivacaoClienteService(new NotificacaoEmail(hostServicoSmtp); //se fizer dessa forma, até funciona, mas isso não é um bean gerenciado pelo Spring, e só serve para notificacao por email, caso seja necessário outro tipo de notificação, essa instanciação está muito amarrada (forte acoplamento)
		return new AtivacaoClienteService(notificacaoEmail());
	}
}
