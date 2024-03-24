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

import com.jvm.ms.project.domain.Pagos;
import com.jvm.ms.project.services.PagosService;

@RestController
@RequestMapping(value = "/api/pagos")//, headers ="X-VERSION=1.0.0")
public class PagosController {
	@Autowired
	private PagosService pagoService;
	
	@GetMapping
	public List<Pagos> listarCliente(){
		return pagoService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Pagos listarPorId(@PathVariable Long id){
		return pagoService.buscarPorId(id);
	}
	
	@PostMapping
	public Pagos crearCliente(@RequestBody Pagos pago){
		return pagoService.grabar(pago);
	}
	
	@PutMapping ("/{id}")
	public Pagos editarCliente(@PathVariable Long id, @RequestBody Pagos pago){
		Pagos pagoDB = pagoService.buscarPorId(id);
		
		pagoDB.setFechaPago(pago.getFechaPago());
		pagoDB.setIdCliente(pago.getIdCliente());
		pagoDB.setMetodoPago(pago.getMetodoPago());
		pagoDB.setMontoPago(pago.getMontoPago());
		
		return pagoService.grabar(pagoDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		pagoService.eliminar(id);
	}
}
