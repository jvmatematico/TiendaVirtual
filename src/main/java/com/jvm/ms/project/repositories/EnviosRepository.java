package com.jvm.ms.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Envios;

public interface EnviosRepository extends JpaRepository<Envios, Long> {
	Optional<Envios> findByIdEnvio(Long idEnvio);
	Optional<Envios> findByIdPedido(Long idPedido);
	Optional<Envios> findByEstadoEnvio(String estado);
}
