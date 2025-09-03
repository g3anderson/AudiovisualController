package com.dohms.model;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "emprestimos")
@AllArgsConstructor
@NoArgsConstructor


public class EmprestimoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmprestimo;
	
	@Column(name = "dataEmprestimo")
	@CreatedDate
	private Date dataEmprestimo;
	
	@ManyToOne
	@JoinColumn(name = "patrimonioEquipamento", nullable = false)
	private EquipamentoModel equipamento;
	
	@ManyToOne
	@JoinColumn(name = "nomeUsuario", nullable = false)
	private UsuarioModel usuario;
	
	@ManyToOne
	@JoinColumn(name = "nomeUsuario", nullable = true)
	private UsuarioModel professorResponsavel;
	
}
