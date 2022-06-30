package com.Felidae_Exception.ProyectoReciclaje.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Locales;
import com.Felidae_Exception.ProyectoReciclaje.repository.LocalesRepository;
import com.Felidae_Exception.ProyectoReciclaje.services.LocalesServices;

@Service
public class LocalesServicesImpl implements LocalesServices{
	
	@Autowired
	LocalesRepository localesRepository;
	
	@Override
	public Locales findOneByNombre(String nombre) throws Exception{
		Locales temp = localesRepository.findOneByNombre(nombre);
		
		return temp;
	}
}
