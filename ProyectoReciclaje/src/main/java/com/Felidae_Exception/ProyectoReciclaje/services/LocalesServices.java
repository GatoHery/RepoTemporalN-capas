package com.Felidae_Exception.ProyectoReciclaje.services;

import org.springframework.stereotype.Service;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Locales;


public interface LocalesServices {
	Locales findOneByNombre(String nombre) throws Exception;
}
