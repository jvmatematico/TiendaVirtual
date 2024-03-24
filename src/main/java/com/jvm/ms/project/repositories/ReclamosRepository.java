package com.jvm.ms.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Reclamos;

public interface ReclamosRepository extends JpaRepository<Reclamos, Long> {
	Optional<Reclamos> findByIdReclamo(Long idReclamo);
	Optional<Reclamos> findByIdCliente(Long idCliente);
	Optional<Reclamos> findByEstadoReclamo(String estadoReclamo);
}
