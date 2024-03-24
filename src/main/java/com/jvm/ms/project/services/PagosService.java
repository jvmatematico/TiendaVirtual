package com.jvm.ms.project.services;

import java.util.List;

import com.jvm.ms.project.domain.Pagos;

public interface PagosService {
	List<Pagos> listarTodos();
	Pagos buscarPorId(Long id);
	Pagos grabar(Pagos pago);
	Pagos  actualizar (Pagos pago, Long id);
	void eliminar(Long id);
	
	Pagos findByIdPago(Long idPago);
}
