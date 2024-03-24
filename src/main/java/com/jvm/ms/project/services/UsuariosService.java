package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Usuarios;

public interface UsuariosService {
	List<Usuarios> listarTodos();
	Usuarios buscarPorId(Long id);
	Usuarios grabar(Usuarios usuario);
	Usuarios  actualizar (Usuarios usuario, Long id);
	void eliminar(Long id);
	
	Usuarios finByUser (String user);
}
