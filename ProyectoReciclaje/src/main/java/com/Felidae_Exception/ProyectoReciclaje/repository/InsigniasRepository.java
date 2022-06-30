package com.Felidae_Exception.ProyectoReciclaje.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;

public interface InsigniasRepository extends JpaRepository<Insignias, String>{
	Insignias findOneByNombre(String nombre);
}
