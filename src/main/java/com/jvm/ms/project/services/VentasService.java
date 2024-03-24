package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Ventas;

public interface VentasService {
	List<Ventas> listarTodos();
	Ventas buscarPorId(Long id);
	Ventas grabar(Ventas venta);
	Ventas  actualizar (Ventas venta, Long id);
	void eliminar(Long id);
}
