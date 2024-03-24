package com.jvm.ms.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
	Optional<Pedidos> findByIdPedido(Long idPedido);
}
