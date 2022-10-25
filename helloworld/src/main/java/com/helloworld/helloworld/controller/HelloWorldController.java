package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // CONTROLA OS ENDEREÇOS QUE VAMOS ACESSAR, PARA OS SERVIÇOS/METODOS
@RequestMapping("/hello-world") // caminho para ser acessado essa classe, mapeia a classe 
//quando colocar esse nome no navegador, ele tras essa informação.
public class HelloWorldController {
	@GetMapping //para acessar a informação, é um metodo GET de pegar a informação debaixo, transforma 
	//get
	public String helloWorld() {
		return "Hello World!"; //Retorna essa mensagem.
	}

}
