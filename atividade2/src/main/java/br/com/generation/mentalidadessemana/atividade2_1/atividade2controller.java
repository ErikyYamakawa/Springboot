package br.com.generation.mentalidadessemana.atividade2_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsmsemanal")	

public class atividade2controller {
	@GetMapping 
	public String helloshow() {
		return "Hello familia 38 <br/> as bsm que estou focado nessa semana e a de trabalho em equipe!";
	}

}
