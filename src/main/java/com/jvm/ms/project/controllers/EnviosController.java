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

import com.jvm.ms.project.domain.Envios;
import com.jvm.ms.project.services.EnviosService;

@RestController
@RequestMapping(value = "/api/envios")//, headers ="X-VERSION=1.0.0")
public class EnviosController {
	@Autowired
	private EnviosService envioService;
	
	@GetMapping
	public List<Envios> listarCliente(){
		return envioService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Envios listarPorId(@PathVariable Long id){
		return envioService.buscarPorId(id);
	}
	
	@PostMapping
	public Envios crearCliente(@RequestBody Envios envio){
		return envioService.grabar(envio);
	}
	
	@PutMapping ("/{id}")
	public Envios editarCliente(@PathVariable Long id, @RequestBody Envios envio){
		Envios envioDB = envioService.buscarPorId(id);
		
		envioDB.setIdPedido(envio.getIdPedido());
		envioDB.setFechaEnvio(envio.getFechaEnvio());
		envioDB.setDireccionEnvio(envio.getDireccionEnvio());
		envioDB.setEstadoEnvio(envio.getEstadoEnvio());
		
		return envioService.grabar(envioDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		envioService.eliminar(id);
	}
}
