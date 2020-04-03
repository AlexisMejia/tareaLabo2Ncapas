package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
		public String login(Usuario usuario) {
		return "login";
	}

	@PostMapping("/validacion")
		public String validacion( Usuario usuario) {
		
		if(usuario.getNombre().equals("alexis") && usuario.getContra().equals("123")) {
			return "mostrarMensajeV";
		} else {
			return "mostrarMensajeF";
		}
	}

}

