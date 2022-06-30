package com.Felidae_Exception.ProyectoReciclaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Locales;

public interface LocalesRepository extends JpaRepository<Locales, String>{
	Locales findOneByNombre(String nombre);
}
