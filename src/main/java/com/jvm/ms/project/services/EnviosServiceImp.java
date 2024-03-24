package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Envios;
import com.jvm.ms.project.repositories.EnviosRepository;

@Service
public class EnviosServiceImp implements EnviosService {

	@Autowired
	private EnviosRepository enviosSi;
	
	@Override
	public List<Envios> listarTodos() {
		return enviosSi.findAll();
	}

	@Override
	@Transactional
	public Envios buscarPorId(Long id) {
		Optional<Envios> envio = enviosSi.findById(id);
		return envio.get();
	}

	@Override
	@Transactional
	public Envios grabar(Envios envio) {
		return enviosSi.save(envio);
	}

	@Override
	@Transactional
	public Envios actualizar(Envios envio, Long id) {
		envio.setIdEnvio(id);
		return enviosSi.save(envio);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		enviosSi.deleteById(id);

	}

	@Override
	@Transactional
	public Envios findByIdEnvio(Long idEnvio) {		
		return enviosSi.findByIdEnvio(idEnvio).get();
	}

	@Override
	@Transactional
	public Envios findByIdPedido(Long idPedido) {
		return enviosSi.findByIdPedido(idPedido).get();
	}

	@Override
	@Transactional
	public Envios findByEstadoEnvio(String estado) {
		return enviosSi.findByEstadoEnvio(estado).get();
	}

}
