package com.Felidae_Exception.ProyectoReciclaje.dtos;

public class UsuarioRegisterDTO {
	
	private String nombre;
	private String password;
	private String email;
	
	public UsuarioRegisterDTO(String nombre, String password, String email) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.email = email;
	}

	public UsuarioRegisterDTO() {
		super();
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

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
