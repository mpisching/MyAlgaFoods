/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods;

import net.mapsystems.myalgafoods.di.model.Client;
import net.mapsystems.myalgafoods.di.service.ClientActivationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mpisching
 */

@Controller
public class MyFirstController {

    private ClientActivationService clientActivationService;
    
    public MyFirstController(ClientActivationService clientActivationService) {
        this.clientActivationService = clientActivationService;
        
        System.out.println("MyFirstController is using an injected instance of ClientActivationService: " + clientActivationService);
    }
    
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Client client = new Client("Marcos", "marcos@ifsc.edu.br", "48989897878");
		
	clientActivationService.activate(client);

        return "Hello SpringBoot - Netbeans!!!" + client.getName();
    }
    
    @GetMapping("/hello/{name}/{lastName}")
    @ResponseBody
    public String hello(@PathVariable String name, @PathVariable String lastName) {
        return "Hello " + name + " " + lastName;
    }
}
