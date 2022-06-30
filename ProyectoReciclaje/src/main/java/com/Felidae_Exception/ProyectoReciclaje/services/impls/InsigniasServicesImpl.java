package com.Felidae_Exception.ProyectoReciclaje.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;
import com.Felidae_Exception.ProyectoReciclaje.repository.InsigniasRepository;
import com.Felidae_Exception.ProyectoReciclaje.services.InsigniasServices;

@Service
public class InsigniasServicesImpl implements InsigniasServices{
	
	@Autowired
	InsigniasRepository insigniasRepo;
	
	@Override
	public Insignias findOneByNombre(String nombre) throws Exception{
		Insignias temp = insigniasRepo.findOneByNombre(nombre);
		
		return temp;
	}
}
