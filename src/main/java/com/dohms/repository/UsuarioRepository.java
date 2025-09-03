package com.dohms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dohms.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

}
