package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo-semanal")
public class ObjetivosSemanal {
	
	 @GetMapping
	 public String objetivosSemanal() {
	 	
	 return "<h1>Objetivos dessa semana: </h1><br>"
               + "<br><li>Fazer atividades do dia "
               + "<br><li>Fazer atividades em atraso "
               + "<br><li>Atividade BSM"
              ;
	 
     }
}

