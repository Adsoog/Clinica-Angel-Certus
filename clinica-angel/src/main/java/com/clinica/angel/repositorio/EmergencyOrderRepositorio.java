package com.clinica.angel.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.angel.modelo.EmergencyOrder;

public interface EmergencyOrderRepositorio extends JpaRepository<EmergencyOrder, Integer> {

}
