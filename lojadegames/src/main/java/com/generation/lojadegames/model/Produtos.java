package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "É obrigatório preencher o atributo nome")
	@Size(min = 2, max = 255, message = "O atributo deve ter no mínimo 2 caracteres e no máximo 255")
	private String nome;
	
	@NotBlank(message = "É obrigatório preencher o atributo nome")
	@Size(min = 2, max = 255, message = "O atributo deve ter no mínimo 2 caracteres e no máximo 255")
	private String foto;
	
	@NotBlank(message = "É obrigatório preencher o atributo nome")
	@Size(min = 2, max = 255, message = "O atributo deve ter no mínimo 2 caracteres e no máximo 255")
	private String descricao;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "Preencher o preço é obrigatório!")
	@Positive(message = "O preço precisa ser um número positivo")
	private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
