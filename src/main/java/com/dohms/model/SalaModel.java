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
@Data
@Table(name = "salaDeAula")
@AllArgsConstructor
@NoArgsConstructor


public class SalaModel {
	
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer idSala;
	 
	 @Column(name = "nomeSala")
	 private String nomeSala;
	 
	  
	  //Implementação do atributo que deverá mostrar os objetos (Equipamentos) que estão na sala de aula.
	   

}
