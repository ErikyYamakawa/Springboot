package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Tema;
import br.org.generation.blogpessoal.model.Usuario;
@Repository
public interface TemaRepository extends JpaRepository<Tema,Long> {
	public List<Tema>findAllByDescricaoContainingIgnoreCase(String descricao);
	
	public List <Usuario> findAllByNomeContainingIgnoreCase(String nome);
}

