package br.com.generation.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class Atividade1Bsm {
	
	@GetMapping
	public String hello() {
		return "BSM orientação ao futuro <br/> Responsabilidade Pessoal <br/> Mentalidade de crescimento <br/> Persistencia <br/> Trabalho em equipe <br/> Atenção aos detalhes <br/> Proatividade <br/> Comunicação ";
	}

}
