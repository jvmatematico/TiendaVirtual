package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Reclamos;

public interface ReclamosService {
	List<Reclamos> listarTodos();
	Reclamos buscarPorId(Long id);
	Reclamos grabar(Reclamos reclamo);
	Reclamos  actualizar (Reclamos reclamo, Long id);
	void eliminar(Long id);
	
	Reclamos findByIdReclamo(Long idReclamo);
	Reclamos findByIdCliente(Long idCliente);
	Reclamos findByEstadoReclamo(String estadoReclamo);
}
