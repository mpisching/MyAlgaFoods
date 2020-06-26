/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mapsystems.myalgafoods;

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

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello SpringBoot - Netbeans!!!" + "alguma coisa";
    }
    
    @GetMapping("/hello/{name}/{lastName}")
    @ResponseBody
    public String hello(@PathVariable String name, @PathVariable String lastName) {
        return "Hello " + name + " " + lastName;
    }
}
