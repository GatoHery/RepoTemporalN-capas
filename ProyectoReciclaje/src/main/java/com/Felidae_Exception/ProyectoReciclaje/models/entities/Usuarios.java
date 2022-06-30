package com.Felidae_Exception.ProyectoReciclaje.models.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "usuarios")
public class Usuarios {
	@Id
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "email")
	private String email;
	@Column(name = "contra")
	private String contra;
	@Column(name = "estado")
	private Boolean estado;
	
	public Usuarios(String nombre, String email, String contra, Boolean estado) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contra = contra;
		this.estado = estado;
	}

	public Usuarios() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
