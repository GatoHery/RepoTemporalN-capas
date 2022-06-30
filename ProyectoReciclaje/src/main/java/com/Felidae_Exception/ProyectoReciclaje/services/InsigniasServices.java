package com.Felidae_Exception.ProyectoReciclaje.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;

public interface InsigniasServices{
	Insignias findOneByNombre(String nombre) throws Exception;
}
