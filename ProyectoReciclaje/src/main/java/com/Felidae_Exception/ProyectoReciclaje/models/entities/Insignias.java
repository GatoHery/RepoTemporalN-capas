package com.Felidae_Exception.ProyectoReciclaje.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "insignias")
public class Insignias {
	
	@Id
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private Boolean estado;
	@Column(name = "imagen")
	private String imagen;
	
	public Insignias(String nombre, String descripcion, Boolean estado, String imagen) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.imagen = imagen;
	}

	public Insignias() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
