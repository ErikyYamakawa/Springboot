package br.org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@NotBlank(message = "O atributo nome e obrigatorio e nao pode utilizar espaços em brancos!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no minimo 05 e no maximo 100 caracteres")
	private String nome; 
	
	@NotBlank(message = "O atributo Laboratorio e obrigatorio e nao pode utilizar espaços em brancos!")
	private String Laboratorio;
	
	@NotNull( message = "O atributo preco e obrigatorio")
	private Long preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLaboratorio() {
		return Laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		Laboratorio = laboratorio;
	}

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	} 
	
	
}
