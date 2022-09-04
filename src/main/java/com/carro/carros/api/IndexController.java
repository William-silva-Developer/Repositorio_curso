package com.carro.carros.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	
	@GetMapping()
	public String Get() {
		return "Olá mundo";
	};
	
	@GetMapping("/login")
	public String LOgin(@RequestParam("login") String login,@RequestParam("senha") String senha) {
		
		return "login: " +login + " senha: " + senha;
		
	}
}