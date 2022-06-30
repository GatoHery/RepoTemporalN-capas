package com.Felidae_Exception.ProyectoReciclaje.models.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "producto")
public class Producto {
	
	@Id
	@Column(name = "idProducto")
	@SequenceGenerator(name = "producto_id_gen", sequenceName = "producto_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_id_gen")
	private Integer idProducto;
	
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tipoProducto")
	private String tipoProducto;
	@Column(name = "valor")
	private String valor;
	@Column(name = "estado")
	private Boolean estado;
	
	public Producto(Integer idProducto, String descripcion, String tipoProducto, String valor, Boolean estado) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.tipoProducto = tipoProducto;
		this.valor = valor;
		this.estado = estado;
	}

	public Producto() {
		super();
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
