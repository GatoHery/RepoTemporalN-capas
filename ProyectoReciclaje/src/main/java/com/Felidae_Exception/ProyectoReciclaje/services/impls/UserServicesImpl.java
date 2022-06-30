package com.Felidae_Exception.ProyectoReciclaje.services.impls;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Felidae_Exception.ProyectoReciclaje.dtos.UsuarioRegisterDTO;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Usuarios;
import com.Felidae_Exception.ProyectoReciclaje.repository.UsuariosRepository;
import com.Felidae_Exception.ProyectoReciclaje.services.UserServices;

import antlr.collections.List;

@Service
public class UserServicesImpl implements UserServices{
	
	@Autowired
	UsuariosRepository userRepo;
	
	@Override
	public boolean findAll(String username) throws Exception{
		boolean temp = userRepo.findAll().equals(username);
		
		return temp;
	}
	
	@Override
	public Usuarios findOneByNombreAndContra(String username, String contra) throws Exception{
		Usuarios temp = userRepo.findOneByNombreAndContra(username,contra);
		
		return temp;
	}
	
	@Override
	@Transactional(rollbackOn = Exception.class)
	public void AddUser(UsuarioRegisterDTO register) throws Exception{
		Usuarios user = new Usuarios();
		
		
		user.setNombre(register.getNombre());
		user.setEmail(register.getEmail());
		user.setContra(register.getPassword());
		user.setEstado(true);
		
		userRepo.save(user);
		
		return ;
	}
}
