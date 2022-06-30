package com.Felidae_Exception.ProyectoReciclaje.services;

import org.springframework.data.jpa.repository.Query;

import com.Felidae_Exception.ProyectoReciclaje.dtos.UsuarioRegisterDTO;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Usuarios;

public interface UserServices {
	boolean findAll(String username) throws Exception;
	Usuarios findOneByNombreAndContra(String username, String contra) throws Exception;
	void AddUser(UsuarioRegisterDTO register) throws Exception; 
}
