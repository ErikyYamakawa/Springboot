package br.org.generation.blogpessoal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagem")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity <List<Postagem>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll());
		
		//select * from_postagens;
	}
	@GetMapping("/{id}")
	public ResponseEntity <Postagem> getById(@PathVariable Long id){
		return postagemRepository.findById(id)
		.map(resp -> ResponseEntity.ok(resp))
		.orElse(ResponseEntity.notFound().build());
		
		// select * from tb_postagens where id = id;
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>>getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity <Postagem> postPostagem(@Valid @RequestBody Postagem postagem){	
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));
		
	}
	@PutMapping
	public ResponseEntity <Postagem> putPostagem(@Valid @RequestBody Postagem postagem){	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(postagemRepository.save(postagem));
				
	}
	
	@DeleteMapping("/{id}")
	public void deletePostagem(@PathVariable Long id) {
		postagemRepository.deleteById(id);
	}
}
