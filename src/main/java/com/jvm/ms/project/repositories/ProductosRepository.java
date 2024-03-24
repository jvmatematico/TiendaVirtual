package com.jvm.ms.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jvm.ms.project.domain.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
	
}
