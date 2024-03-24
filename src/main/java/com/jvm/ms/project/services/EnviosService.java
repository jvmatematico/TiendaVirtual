package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Envios;

public interface EnviosService {
	List<Envios> listarTodos();
	Envios buscarPorId(Long id);
	Envios grabar(Envios envio);
	Envios  actualizar (Envios envio, Long id);
	void eliminar(Long id);
	
	Envios findByIdEnvio (Long idEnvio);
	Envios findByIdPedido(Long idPedido);
	Envios findByEstadoEnvio(String estado);
}
