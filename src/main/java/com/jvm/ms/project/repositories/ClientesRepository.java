package com.jvm.ms.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
	Optional<Clientes> findById(Long id);
	Optional<Clientes> findByDni(String dni);
	Optional<Clientes> findByNombres(String nombres);
}
