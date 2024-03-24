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

import com.jvm.ms.project.domain.Productos;
import com.jvm.ms.project.services.ProductosService;

@RestController
@RequestMapping(value = "/api/productos")//, headers ="X-VERSION=1.0.0")
public class ProductosController {
	@Autowired
	private ProductosService prodService;
	
	@GetMapping
	public List<Productos> listarCliente(){
		return prodService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Productos listarPorId(@PathVariable Long id){
		return prodService.buscarPorId(id);
	}
	
	@PostMapping
	public Productos crearCliente(@RequestBody Productos prod){
		return prodService.grabar(prod);
	}
	
	@PutMapping ("/{id}")
	public Productos editarCliente(@PathVariable Long id, @RequestBody Productos prod){
		Productos prodDB = prodService.buscarPorId(id);
		
		prodDB.setDescripcion(prod.getDescripcion());
		prodDB.setPrecio(prod.getPrecio());
		prodDB.setProducto(prod.getProducto());
		prodDB.setStockDisponible(prod.getStockDisponible());
		
		return prodService.grabar(prodDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		prodService.eliminar(id);
	}
}
