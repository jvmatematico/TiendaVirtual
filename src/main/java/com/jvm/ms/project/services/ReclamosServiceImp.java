package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Reclamos;
import com.jvm.ms.project.repositories.ReclamosRepository;

@Service
public class ReclamosServiceImp implements ReclamosService {

	@Autowired
	private ReclamosRepository reclamosSi;
	
	@Override
	@Transactional
	public List<Reclamos> listarTodos() {
		return reclamosSi.findAll();
	}

	@Override
	@Transactional
	public Reclamos buscarPorId(Long id) {
		Optional<Reclamos> reclamo = reclamosSi.findById(id);
		return reclamo.get();
	}

	@Override
	@Transactional
	public Reclamos grabar(Reclamos reclamo) {
		return reclamosSi.save(reclamo);
	}

	@Override
	@Transactional
	public Reclamos actualizar(Reclamos reclamo, Long id) {
		reclamo.setIdReclamo(id);
		return null;
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		reclamosSi.deleteById(id);
	}

	@Override
	@Transactional
	public Reclamos findByIdReclamo(Long idReclamo) {
		return reclamosSi.findByIdReclamo(idReclamo).get();
	}

	@Override
	@Transactional
	public Reclamos findByIdCliente(Long idCliente) {
		return reclamosSi.findByIdCliente(idCliente).get();
	}

	@Override
	@Transactional
	public Reclamos findByEstadoReclamo(String estadoReclamo) {
		return reclamosSi.findByEstadoReclamo(estadoReclamo).get();
	}

}
