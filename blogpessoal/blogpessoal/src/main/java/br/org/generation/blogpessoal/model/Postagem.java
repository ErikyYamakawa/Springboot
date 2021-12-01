package br.org.generation.blogpessoal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity // create table
@Table(name = "tb_postagens") // tb_postagens
public class Postagem {
	
	@Id // primarykey (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
	private Long id;
	
	@NotBlank(message = "O atributo titulo é obrigatório!")  // nao pode ser nulo e nao pode ser branco 
	@Size(min = 5, max = 100,message = "O atributo titulo deve ter no mínimo 5 e no máximo 100 caracteres!")
	private String titulo;
	
	@NotNull(message = "O atributo texto é obrigatório!")  // nao pode ser nulo e nao pode ser branco 
	@Size(min = 10, max = 1000,message = "O atributo texto deve ter no mínimo 10 e no máximo 1000 caracteres!")
	private String texto;
	
	@UpdateTimestamp
	private LocalDate data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	

}
