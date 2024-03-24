package com.jvm.ms.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Pagos;

public interface PagosRepository extends JpaRepository<Pagos, Long> {
	Optional<Pagos> findByIdPago(Long idPago);
}
