package br.org.generation.farmacia.Repository;

//import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
	public List <Produto> findAllByNomeContainingIgnoreCase (String Nome); 
	
	public List <Produto>findAllByNomeAndLaboratorioContainingIgnoreCase(String nome,String laboratorio);

}
