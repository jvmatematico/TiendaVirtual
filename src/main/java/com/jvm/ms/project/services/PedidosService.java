package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Pedidos;

public interface PedidosService {
	List<Pedidos> listarTodos();
	Pedidos buscarPorId(Long id);
	Pedidos grabar(Pedidos pedido);
	Pedidos  actualizar (Pedidos pedido, Long id);
	void eliminar(Long id);
	
	Pedidos findByIdPedido(Long idPedido);
}
