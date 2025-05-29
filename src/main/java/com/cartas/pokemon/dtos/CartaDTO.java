package com.cartas.pokemon.dtos;

import com.cartas.pokemon.entities.Carta;
import com.cartas.pokemon.enuns.Status;

public class CartaDTO {

	private Long id;

	private String nome;
	private Status status;
	
	public CartaDTO(Long id, String nome, Status status) {
		this.id = id;
		this.nome = nome;
		this.status = status;
	}
	
	
	
	public CartaDTO() {
	}



	public CartaDTO(Carta entity) {
		id = entity.getId();
		nome = entity.getNome();
		status = entity.getStatus();
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


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
