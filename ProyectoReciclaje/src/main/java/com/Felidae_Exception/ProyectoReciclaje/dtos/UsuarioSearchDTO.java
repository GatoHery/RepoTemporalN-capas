package com.Felidae_Exception.ProyectoReciclaje.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsuarioSearchDTO {
	
	private String nombre;
	private String password;

	public UsuarioSearchDTO(String nombre, String contra) {
		super();
		this.nombre = nombre;
		this.password = contra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String contra) {
		this.password = contra;
	}
	
}
