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

import com.jvm.ms.project.domain.Reclamos;
import com.jvm.ms.project.services.ReclamosService;

@RestController
@RequestMapping(value = "/api/reclamos")//, headers ="X-VERSION=1.0.0")
public class ReclamosController {
	@Autowired
	private ReclamosService reclamoService;
	
	@GetMapping
	public List<Reclamos> listarCliente(){
		return reclamoService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Reclamos listarPorId(@PathVariable Long id){
		return reclamoService.buscarPorId(id);
	}
	
	@PostMapping
	public Reclamos crearCliente(@RequestBody Reclamos reclamo){
		return reclamoService.grabar(reclamo);
	}
	
	@PutMapping ("/{id}")
	public Reclamos editarCliente(@PathVariable Long id, @RequestBody Reclamos reclamo){
		Reclamos reclamoDB = reclamoService.buscarPorId(id);
		
		reclamoDB.setDescripcion(reclamo.getDescripcion());
		reclamoDB.setEstadoReclamo(reclamo.getEstadoReclamo());
		reclamoDB.setFechaReclamo(reclamo.getFechaReclamo());
		reclamoDB.setIdCliente(reclamo.getIdCliente());
		
		return reclamoService.grabar(reclamoDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		reclamoService.eliminar(id);
	}
}
