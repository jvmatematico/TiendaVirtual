package com.jvm.ms.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvm.ms.project.domain.Usuarios;
import com.jvm.ms.project.services.UsuariosService;

@RestController
@RequestMapping(value = "/api/usuarios")//, headers ="X-VERSION=1.0.0")
public class UsuariosController {
	@Autowired
	private UsuariosService userService;
	
	@GetMapping
	public List<Usuarios> listarCliente(){
		return userService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Usuarios listarPorId(@PathVariable Long id){
		return userService.buscarPorId(id);
	}
	
	@PostMapping
	public Usuarios crearCliente(@RequestBody Usuarios user){
		return userService.grabar(user);
	}
	
	@PutMapping ("/{id}")
	public Usuarios editarCliente(@PathVariable Long id, @RequestBody Usuarios user){
		Usuarios userDB = userService.buscarPorId(id);
		
		userDB.setUser(user.getUser());
		userDB.setPassword(user.getPassword());
		userDB.setRol(user.getRol());
		
		return userService.grabar(userDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		userService.eliminar(id);
	}
}
