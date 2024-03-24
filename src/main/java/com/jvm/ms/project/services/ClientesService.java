package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Clientes;

public interface ClientesService {
	List<Clientes> listarTodos();
	Clientes buscarPorId(Long id);
	Clientes grabar(Clientes cliente);
	Clientes  actualizar (Clientes cliente, Long id);
	void eliminar(Long id);
	
	Clientes findById(Long idCliente);
	Clientes findByDni(String dni);
	Clientes findByNombres(String nombres);
}
