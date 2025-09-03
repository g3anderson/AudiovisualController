package com.dohms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dohms.model.EquipamentoModel;

public interface EquipamentoRepository extends JpaRepository<EquipamentoModel, Integer> {

}
