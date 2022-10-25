package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/bsm")
public class BsmGeneration {
	@GetMapping
	public String bsmsGeneration() {
		
		 return "<h1>Behavioral Skills and Mindsets | BSM's da Generation </h1><br><br>COMPETÊNCIAS COMPORTAMENTAIS:"
	                + "<br><li>Comunicação<br><li>Proatividade<br><li>Orientação ao detalhe"
	                + "<br><li>Trabalho em equipe<br><br>MENTALIDADES:<br>"
	                + "<li>Orientação ao futuro<br><li>Responsabilidade pessoal"
	                + "<br><li>Mentalidade de crescimento<br><li>Persistência";
	}
}