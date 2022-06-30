package com.Felidae_Exception.ProyectoReciclaje.dtos;

public class InsigniasInfoDTO {

	private String nombre;
	private String descripcion;
	private Boolean estado;
	private String imagen;
	
	public InsigniasInfoDTO(String nombre, String descripcion, Boolean estado, String imagen) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.imagen = imagen;
	}
	
	public InsigniasInfoDTO() {
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
