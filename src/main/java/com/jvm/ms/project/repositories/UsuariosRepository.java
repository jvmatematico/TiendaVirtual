package com.jvm.ms.project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	Optional<Usuarios> findByUser(String user);
}
