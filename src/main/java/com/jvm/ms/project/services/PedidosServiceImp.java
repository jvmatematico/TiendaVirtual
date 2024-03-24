package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Pedidos;
import com.jvm.ms.project.repositories.PedidosRepository;

@Service
public class PedidosServiceImp implements PedidosService {

	@Autowired
	private PedidosRepository pedidosSi;
	
	@Override
	@Transactional
	public List<Pedidos> listarTodos() {
		return pedidosSi.findAll();
	}

	@Override
	@Transactional
	public Pedidos buscarPorId(Long id) {
		Optional<Pedidos> pedido = pedidosSi.findById(id);
		return pedido.get();
	}

	@Override
	@Transactional
	public Pedidos grabar(Pedidos pedido) {
		return pedidosSi.save(pedido);
	}

	@Override
	@Transactional
	public Pedidos actualizar(Pedidos pedido, Long id) {
		pedido.setIdPedido(id);
		return pedidosSi.save(pedido);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		pedidosSi.deleteById(id);
	}

	@Override
	@Transactional
	public Pedidos findByIdPedido(Long idPedido) {
		return pedidosSi.findByIdPedido(idPedido).get();
	}

}
