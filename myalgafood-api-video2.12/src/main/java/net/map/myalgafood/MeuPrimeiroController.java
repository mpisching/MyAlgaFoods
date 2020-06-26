package net.map.myalgafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.map.myalgafood.di.modelo.Cliente;
import net.map.myalgafood.di.service.AtivacaoClienteService;

@Controller //essa anotação está dizendo que está é uma classe responsável por receber requisições web 
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
	}
	
	@GetMapping("/hello") //indicando o nome do recurso que poderá ser requisitado pelo método GET do HTTP
	@ResponseBody 			//determina que o método requisitado deva retornar alguma coisa (neste caso uma String) para a requisição HTTP
	public String hello() {
		Cliente cliente = new Cliente("Marcos", "marcos@ifsc.edu.br", "48989897878");
		
		ativacaoClienteService.ativar(cliente);
		
		return "Hello!!!";
	}
}
