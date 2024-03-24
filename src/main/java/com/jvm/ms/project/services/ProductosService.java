package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Productos;

public interface ProductosService {
	List<Productos> listarTodos();
	Productos buscarPorId(Long id);
	Productos grabar(Productos producto);
	Productos  actualizar (Productos producto, Long id);
	void eliminar(Long id);
	
	
}
