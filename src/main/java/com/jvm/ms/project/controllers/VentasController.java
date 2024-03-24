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

import com.jvm.ms.project.domain.Ventas;
import com.jvm.ms.project.services.VentasService;

@RestController
@RequestMapping(value = "/api/ventas")//, headers ="X-VERSION=1.0.0")
public class VentasController {
	@Autowired
	private VentasService ventaService;
	
	@GetMapping
	public List<Ventas> listarCliente(){
		return ventaService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Ventas listarPorId(@PathVariable Long id){
		return ventaService.buscarPorId(id);
	}
	
	@PostMapping
	public Ventas crearCliente(@RequestBody Ventas venta){
		return ventaService.grabar(venta);
	}
	
	@PutMapping ("/{id}")
	public Ventas editarCliente(@PathVariable Long id, @RequestBody Ventas venta){
		Ventas ventaDB = ventaService.buscarPorId(id);
		
		ventaDB.setFechaVenta(venta.getFechaVenta());
		ventaDB.setIdCliente(venta.getIdCliente());
		
		return ventaService.grabar(ventaDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		ventaService.eliminar(id);
	}
}
