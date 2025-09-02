package com.dohms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "funcao")
	private String funcao;

	@Column(name = "turma")
	private String turma;
	
	@Column(name = "idSala_usuario")
	private Sala idSala;

}
