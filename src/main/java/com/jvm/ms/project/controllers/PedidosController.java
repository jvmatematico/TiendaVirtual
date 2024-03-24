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

import com.jvm.ms.project.domain.Pedidos;
import com.jvm.ms.project.services.PedidosService;

@RestController
@RequestMapping(value = "/api/pedidos")//, headers ="X-VERSION=1.0.0")
public class PedidosController {
	@Autowired
	private PedidosService pedidoService;
	
	@GetMapping
	public List<Pedidos> listarCliente(){
		return pedidoService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Pedidos listarPorId(@PathVariable Long id){
		return pedidoService.buscarPorId(id);
	}
	
	@PostMapping
	public Pedidos crearCliente(@RequestBody Pedidos pedido){
		return pedidoService.grabar(pedido);
	}
	
	@PutMapping ("/{id}")
	public Pedidos editarCliente(@PathVariable Long id, @RequestBody Pedidos pedido){
		Pedidos pedidoDB = pedidoService.buscarPorId(id);
		
		pedidoDB.setCantidadProductos(pedido.getCantidadProductos());
		pedidoDB.setFechaPedido(pedido.getFechaPedido());
		pedidoDB.setIdCliente(pedido.getIdCliente());
		pedidoDB.setProductosSolicitados(pedido.getProductosSolicitados());
		
		return pedidoService.grabar(pedidoDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		pedidoService.eliminar(id);
	}
}
