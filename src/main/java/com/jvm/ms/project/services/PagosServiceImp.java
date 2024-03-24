package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Pagos;
import com.jvm.ms.project.repositories.PagosRepository;

@Service
public class PagosServiceImp implements PagosService {

	@Autowired
	private PagosRepository pagosSi;
	
	@Override
	@Transactional
	public List<Pagos> listarTodos() {
		return pagosSi.findAll();
	}

	@Override
	@Transactional
	public Pagos buscarPorId(Long id) {
		Optional<Pagos> pago = pagosSi.findById(id);
		return pago.get();
	}

	@Override
	@Transactional
	public Pagos grabar(Pagos pago) {
		return pagosSi.save(pago);
	}

	@Override
	@Transactional
	public Pagos actualizar(Pagos pago, Long id) {
		pago.setIdPago(id);
		return pagosSi.save(pago);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		pagosSi.deleteById(id);
	}

	@Override
	@Transactional
	public Pagos findByIdPago(Long idPago) {
		return pagosSi.findByIdPago(idPago).get();
	}

	

}
