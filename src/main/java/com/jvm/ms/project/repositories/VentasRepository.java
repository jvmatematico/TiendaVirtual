package com.jvm.ms.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Long>{
	
}
