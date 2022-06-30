package com.Felidae_Exception.ProyectoReciclaje.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Felidae_Exception.ProyectoReciclaje.dtos.InsigniasInfoDTO;
import com.Felidae_Exception.ProyectoReciclaje.dtos.LocalesInfoDTO;
import com.Felidae_Exception.ProyectoReciclaje.dtos.UsuarioRegisterDTO;
import com.Felidae_Exception.ProyectoReciclaje.dtos.UsuarioSearchDTO;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Insignias;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Locales;
import com.Felidae_Exception.ProyectoReciclaje.models.entities.Usuarios;
import com.Felidae_Exception.ProyectoReciclaje.services.InsigniasServices;
import com.Felidae_Exception.ProyectoReciclaje.services.LocalesServices;
import com.Felidae_Exception.ProyectoReciclaje.services.UserServices;

@Controller
public class ReciclajeController {
	
	boolean flag;
	boolean flag2;
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	InsigniasServices InsigniaServices;
	
	@Autowired
	LocalesServices localServices;
	
	@GetMapping("/")
	private String requestLobby(Model model) {
		
		return "index";
	}
	
	@PostMapping("/confirm")
	private String requestLoginConfirm(@ModelAttribute UsuarioSearchDTO search,Model model) {
		System.out.println("Usuario: " + search.getNombre());
		System.out.println("contra: " + search.getPassword());
		
		try {
			flag = true;
			Usuarios foundUser = userServices.findOneByNombreAndContra(search.getNombre(),search.getPassword());
			
			if(foundUser.getNombre().equals(search.getNombre()) == true) {
				if(foundUser.getNombre().equals(search.getNombre()) == true 
						&& foundUser.getContra().equals(search.getPassword()) == true) {
					flag = true;
				}
				else {
					flag = false;
				}
			}
			else {
				flag = false;
			}
				
			model.addAttribute("flag", flag);
		}
		catch(Exception e) {
			
		}
		 
		return "login_confirm";
	}
	
	@GetMapping("/registrarse")
	private String requestRegistrarse() {
		
		
		return "registrarse";
	}
	
	@PostMapping("/registrarseConfirm")
	private String requestRegistrarseConfirm(@ModelAttribute UsuarioRegisterDTO register, Model model) {
		System.out.println("Usuario: " + register.getNombre());
		System.out.println("Email: " + register.getEmail());
		System.out.println("contra: " + register.getPassword());
		
		try {
			flag2 = true;
			flag2 = userServices.findAll(register.getNombre());
			
			if(flag2 == true) {
				
			}
			else {
				userServices.AddUser(register);
			}
			System.out.println("valor: " + flag2);
			model.addAttribute("flag", flag);
		}
		catch(Exception e) {
			
		}
		
		return "registrarseConfirm";
	}
	
	@GetMapping("/menu")
	private String requestMenu() {
		
		return "menu";
	}
	
	@GetMapping("/locales")
	private String requestLocales() {
		
		return "locales";
	}
	
	@PostMapping("/localesInfo")
	private String requestLocalesInfo(@ModelAttribute LocalesInfoDTO infoLocal, Model model) {
		System.out.println("Nombre: " +infoLocal.getNombre());
		
		try {
			Locales Local = localServices.findOneByNombre(infoLocal.getNombre());
			
			model.addAttribute("nombre", Local.getNombre());
			model.addAttribute("direccion", Local.getDireccion());
			model.addAttribute("telefono", Local.getTelefono());
			model.addAttribute("email", Local.getEmail());
		}
		catch(Exception e) {
			
		}
		return "localInfo_UserView";
	}
	
	@GetMapping("/insignias")
	private String requestInsignias() {
		
		return "insignias";
	}
	
	@PostMapping("/insigniasInfo")
	private String requestInsigniasInfo(@ModelAttribute InsigniasInfoDTO info, Model model) {
		System.out.println("Usuario: " + info.getNombre());
		
		try {
			Insignias insignia = InsigniaServices.findOneByNombre(info.getNombre());
			
			model.addAttribute("imagen", insignia.getImagen());
			model.addAttribute("nombre", insignia.getNombre());
			model.addAttribute("descripcion", insignia.getDescripcion());
			
		}
		catch(Exception e) {
			
		}
		
		return "insigniasView";
	}
	
	@GetMapping("/productos")
	private String requestProductos() {
		
		return "productos_UserView";
	}
	
	@GetMapping("/tips")
	private String requestTips() {
		
		return "Tips";
	}
	
	@GetMapping("/informacion")
	private String requestInformacion() {
		
		return "AboutUs";
	}
	
	@GetMapping("/configuracion")
	private String requestConfiguracion() {
		
		return "configuration";
	}
	
}
