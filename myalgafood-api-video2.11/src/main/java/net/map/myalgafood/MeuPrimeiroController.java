package net.map.myalgafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //essa anotação está dizendo que esta é uma classe responsável por receber requisições web
			//vale destacar que ela também é um @Component, ou seja, um bean gerenciável pelo Spring
public class MeuPrimeiroController {
	
	@GetMapping("/hello") //indicando o nome do recurso que poderá ser requisitado pelo método GET do HTTP
	@ResponseBody 			//determina que o método requisitado deva retornar alguma coisa (neste caso uma String) para a requisição HTTP
	public String hello() {
		return "Hello!!!";
	}
}
