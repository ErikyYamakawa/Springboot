package br.com.generation.exercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class exerciciobsm {

	@GetMapping 
	public String helloshow() {
		return "BSM<br>orientação ao futuro <br/> Responsabilidade Pessoal <br/> Mentalidade de crescimento <br/> Persistencia <br/> Trabalho em equipe <br/> Atenção aos detalhes <br/> Proatividade <br/> Comunicação";
	}
}


