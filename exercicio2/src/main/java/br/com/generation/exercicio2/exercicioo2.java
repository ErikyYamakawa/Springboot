package br.com.generation.exercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsmsemanal")
public class exercicio2 {;

	@GetMapping 
	public String helloshow() {
		return "a BSM que irei trabalhar essa semana sera a de trablho em equipe";
	}
}


