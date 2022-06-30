package com.Felidae_Exception.ProyectoReciclaje.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, String>{
	Usuarios findOneByNombre(String nombre);
	Usuarios findOneByNombreAndContra(String nombre, String contra);
	List <Usuarios> findAll();
}
