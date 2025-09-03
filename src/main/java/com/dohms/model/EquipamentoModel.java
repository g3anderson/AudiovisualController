package com.dohms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equipamento")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EquipamentoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipamento;
	
	@Column(name = "patrimonio")
	private String patrimonio;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "local")
	private String local;
	
	@Column(name = "usuarioAtual")
	private UsuarioModel usuarioAtual;
	
	
	
}
